/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package javacertification;

import userinterface.LoginFormUI;

import javafx.event.ActionEvent;
import java.sql.*; //access database


public class LogInScene implements Application_Iface, UserInfo_Iface{

    private Connection connection = null;
    private LoginFormUI mainFormUI;
    
    public LogInScene(Connection connection){

        this.connection = connection;
        this.mainFormUI = new LoginFormUI();

        Application_Iface.SUB_ROOT.setCenter(this.mainFormUI.getMainPane());
        
        this.mainFormUI.getLoginButton().setOnAction((ActionEvent e)->{
        
            if(loginUser() && UserInfo_Iface.USER_INFO.getCount() < 2){
              
               if(AlertBox.confirmationDialog() ==  true){
                   //start a test
                   incrementTestCount();
                   MainAppController mainApp = new MainAppController(this.connection);
                   mainApp.startTimer();
               }
                
            }else if(!loginUser()){
                //AlertBox.confirmationDialog();
               AlertBox.warningDialog("Sorry, but TEST TAKER ACCOUNT does not exist!\nPlease, SIGN UP first.");
            
            }else if(UserInfo_Iface.USER_INFO.getCount() == 2){
                
               AlertBox.warningDialog("Sorry, but you are NOT ALLOWED to take a test.\nYou have already taken a test two time."
                       + "\nFor more information, please contact Customer Service in your region."); 
            }
            
        });
        
        this.mainFormUI.getRegisterButton().setOnAction((ActionEvent e)->{   
              new RegistrationForm(this.connection);
        });
        
    }
    
    //method to login into account
    private boolean loginUser(){
       boolean flag = false;
        try{
            if(this.mainFormUI.getUserName().getText().isEmpty()){ 
                this.mainFormUI.getUserName().requestFocus();    
            }else if(this.mainFormUI.getUserPassword().getText().isEmpty()){ 
                this.mainFormUI.getUserPassword().requestFocus();
            }else{ 
                String name = this.mainFormUI.getUserName().getText();
                String password = this.mainFormUI.getUserPassword().getText();
  
                //check username and password if they correct 
                if(checkNamePassword(name, password) == true){
                    flag = true;
                }
               this.mainFormUI.clearFiled();
            } 
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }//logInUser
    
    //use this method for log in form
    private boolean checkNamePassword(String name, String password){
    
        PreparedStatement preparedSt = null;
        ResultSet resultSet = null;
        //define temp variables
        String query = "";
        boolean result = false;
        
        try{
            //select all user's information
            query = "select * from user_info where user_id = ? AND user_lastname = ?";
            
            preparedSt = this.connection.prepareStatement(query);
            preparedSt.setString(1, password); //1 - number of parameter
            preparedSt.setString(2, name); //2 - number of parameter
            
            //create a statement
            resultSet = preparedSt.executeQuery();
            
            if(resultSet.next()){ //if it exists
                
                String fn = resultSet.getString("user_firstname");
                String ln = resultSet.getString("user_lastname");
                String id = resultSet.getString("user_id");
                int count = resultSet.getInt("exam_count");
                
                UserInfo_Iface.USER_INFO.setFirstName(fn);
                UserInfo_Iface.USER_INFO.setLastName(ln);
                UserInfo_Iface.USER_INFO.setUserID(id);
                UserInfo_Iface.USER_INFO.setCount(count);

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
    
    private void incrementTestCount(){
        //define a statement
        PreparedStatement preparedSt = null;
        
        try{
                int num = UserInfo_Iface.USER_INFO.getCount() + 1;
                UserInfo_Iface.USER_INFO.setCount(num);
                
                //create a query statement
                String query = "UPDATE user_info SET exam_count = ? WHERE user_id = ?";
                
               //create statement;
                preparedSt = this.connection.prepareStatement(query);
                preparedSt.setInt(1, num);
                preparedSt.setString(2, UserInfo_Iface.USER_INFO.getUserID());
                
                preparedSt.executeUpdate();
                //Clean-up environment
                preparedSt.close();

        }catch(SQLException e){
            e.printStackTrace();     
        }catch(Exception e){
            e.printStackTrace();     
        }finally{
            if(preparedSt != null){
                try{
                    preparedSt.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }    
    }//incrementTestCount

}//LogInScene


