/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package javacertification;

import userinterface.UserInterface_Iface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;
import java.util.regex.Pattern;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;



public class RegistrationForm implements UserInterface_Iface, UserInfo_Iface{
    
    private Connection connection = null;
    private Alert mainForm;
    private TextField tfFirstName, tfLastName;
    private PasswordField tfUserPassword;
    private Label lFirstName, lLastName, lUserPassword;
    
    public RegistrationForm(Connection connection){
        this.connection = connection;
        this.mainForm = new Alert(Alert.AlertType.NONE);
        this.mainForm.setTitle("Registration");
        this.mainForm.setHeaderText("CREATE A TEST TAKER ACCOUNT");
        this.mainForm.initModality(Modality.APPLICATION_MODAL);
        this.mainForm.initOwner(null);
        
        ButtonType loginButtonType = new ButtonType("SUBMIT", ButtonData.OK_DONE);
        this.mainForm.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

        // Create the username and password labels and fields.
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        this.tfFirstName = new TextField();
        this.tfFirstName.setPromptText("John");
        
        this.tfLastName = new TextField();
        this.tfLastName.setPromptText("Smith");
        
        this.tfUserPassword = new PasswordField();
        this.tfUserPassword.setPromptText("1111");
        
        this.lFirstName = new Label("First name:");
        this.lLastName = new Label("Last name:");
        this.lUserPassword = new Label("ID #: ");
        this.lUserPassword.setFont(MAIN_FONT_MEDIUM);
        this.lLastName.setFont(MAIN_FONT_MEDIUM);
        this.lFirstName.setFont(MAIN_FONT_MEDIUM);
        
        grid.add(this.lFirstName, 0, 0);
        grid.add(this.tfFirstName, 1, 0);
        
        grid.add(this.lLastName, 0, 1);
        grid.add(this.tfLastName, 1, 1);
        
        grid.add(this.lUserPassword, 0, 2);
        grid.add(this.tfUserPassword, 1, 2);
        
        // Enable/Disable login button depending on whether a username was entered.
        Node loginButton = this.mainForm.getDialogPane().lookupButton(loginButtonType);
        loginButton.setDisable(true);
        
        loginButton .disableProperty().bind(this.tfFirstName.textProperty().isEmpty().or(this.tfUserPassword.textProperty().isEmpty().or(this.tfLastName.textProperty().isEmpty())));
        
        // Request focus on the username field by default.
        Platform.runLater(() -> this.tfFirstName.requestFocus());

        this.mainForm.getDialogPane().setContent(grid);
        
        Optional<ButtonType> result = this.mainForm.showAndWait(); //thread 
        
        if(result.get() == loginButtonType){
            
            String id = this.tfUserPassword.getText().trim();
            String firstName = this.tfFirstName.getText().trim();
            String lastName = this.tfLastName.getText().trim();
            int count = 1;
            
            if(checkName(firstName) && checkName(lastName) && checkPassword(id)){
            
            if(checkNamePassword(id) == false){
                if(AlertBox.confirmationDialog() ==  true){
                   registerUser(id, firstName, lastName, count); 
                   
                    UserInfo_Iface.USER_INFO.setFirstName(firstName);
                    UserInfo_Iface.USER_INFO.setLastName(lastName);
                    UserInfo_Iface.USER_INFO.setUserID(id);
                    UserInfo_Iface.USER_INFO.setCount(count);
                   
                   //start a test
                   MainAppController mainApp = new MainAppController(this.connection);
                   mainApp.startTimer();   
               }  
            }else{
                 AlertBox.warningDialog("Registration is not Allowed!\n Test-Taker ID is already exist!\n"); //error message  
                 this.mainForm.close();
            }
            } else{                    
                 AlertBox.warningDialog("Registration is not Allowed!\nInput is incorrect, try again.\n"); //error message  
                 cleanFields();   
             }   
        }
    }//RegistrationForm
    
    //use this method for log in form
    private boolean checkNamePassword(String password){
    
        PreparedStatement preparedSt = null;
        ResultSet resultSet = null;
        //define temp variables
        String query = "";
        boolean result = false;
        
        try{
            //select all user's information
            query = "select * from user_info where user_id = ?";
            
            preparedSt = this.connection.prepareStatement(query);
            preparedSt.setString(1, password); //1 - number of parameter
            
            //create a statement
            resultSet = preparedSt.executeQuery();
            
            if(resultSet.next()){ //if it exists
                 result = true;
            } 
            //close statements
            preparedSt.close();
            resultSet.close();
        
        }catch(SQLException e){
            System.err.println("SQL error: " + e.toString());   
        }catch(Exception e){ 
            e.printStackTrace();
        }finally{
            if(preparedSt != null){
                try{
                    preparedSt.close();
                }catch(SQLException e){
                    System.err.println("SQL error: " + e.toString());
                }
            }
            if(resultSet != null){
                try{
                    resultSet.close();
                }catch(SQLException e){
                    System.err.println("SQL error: " + e.toString());
                }
            }
        }
        return result;
    }//checkNamePassword
    
    
    private void registerUser(String id, String firstName, String lastName, int count){
        //define a statement
        Statement statement = null;
        String query;
        
        try{
               //create statement;
                statement = this.connection.createStatement();

                //create a query statement
                query = "INSERT INTO user_info (user_firstname, user_lastname, exam_count, user_id)"
                            + "VALUES " + "('"+firstName.toUpperCase() +"','"+lastName.toUpperCase() +"','"+count+"','"+id+"')";
                
                
                UserInfo_Iface.USER_INFO.setFirstName(firstName);
                UserInfo_Iface.USER_INFO.setLastName(lastName);
                UserInfo_Iface.USER_INFO.setUserID(id);
                UserInfo_Iface.USER_INFO.setCount(count);
                
                statement.executeUpdate(query);
              
                //Clean-up environment
                statement.close();
            
        }catch(SQLException e){
            e.printStackTrace();     
        }catch(Exception e){
            e.printStackTrace();     
        }finally{
            if(statement != null){
                try{
                    statement.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }    
    }//registerUser
    
    //check name on alphabetic characters
    public boolean checkName(String name){
        return Pattern.matches("^[\\p{L}]{1,}[ '-]{0,1}[\\p{L}]{1,}[ '-]{0,1}[\\p{L}]{0,}$", name);
    }//checkName
    
    //check password
    public boolean checkPassword(String password){
        
        boolean flag = false;
        
            if(password.length() != 4){ //length must be more than 8 characters
                flag = false;
            } else{
                flag = Pattern.matches("^[0-9A-Za-z]+$", password);
            }

        return flag;
    }//checkPassword
    
    private void cleanFields(){
        this.tfFirstName.clear();
        this.tfLastName.clear();
        this.tfUserPassword.clear();
    }
}
