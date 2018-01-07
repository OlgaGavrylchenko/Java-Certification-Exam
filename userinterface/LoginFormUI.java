/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package userinterface;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;


public class LoginFormUI implements UserInterface_Iface{
    
    private final BorderPane mainPane;
    
    private HBox titleHBox, resultHBox, separHBox;
    
    private TextField tfUserName;
    private PasswordField tfUserPassword;
    private Button btnLogin, btnRegister;
    private Label lTitle, lUserName, lUserPassword;
    
    public LoginFormUI(){
        this.mainPane = new BorderPane();
        this.mainPane.setMinSize(MAIN_WIDTH, MAIN_HEIGHT);
        this.mainPane.setMaxSize(MAIN_WIDTH, MAIN_HEIGHT);
        this.mainPane.setStyle("-fx-background-color: #fff");
        
        init();
    }
    
    private void init(){ 

        initTitleHBox();
        initResultHBox();
        
        this.mainPane.setTop(this.titleHBox);
        this.mainPane.setCenter(this.resultHBox);
    }
    
    private void initTitleHBox(){
        
        this.titleHBox = new HBox();
        this.titleHBox.setMinSize(MAIN_WIDTH, MAIN_SMALL_HEIGHT); 
        this.titleHBox.setMaxSize(MAIN_WIDTH, MAIN_SMALL_HEIGHT); 
        this.titleHBox.setStyle("-fx-background-color: #66ccff");
        this.titleHBox.setAlignment(Pos.CENTER); 
        
        this.lTitle = new Label();
        this.lTitle.setText("ORACLE_s");
        this.lTitle.setFont(TITLE_FONT_EXLARGE);
        this.lTitle.setTextFill(Color.WHITE);
        this.lTitle.setTextAlignment(TextAlignment.CENTER);
        this.lTitle.setAlignment(Pos.CENTER);  
        
        this.titleHBox.getChildren().add(this.lTitle);
    }//initTitleHBox
    
    private void initResultHBox(){
        this.resultHBox = new HBox();
        this.separHBox = new HBox();
        this.resultHBox.setMinSize(MAIN_WIDTH, MAIN_LARGE_HEIGHT); 
        this.separHBox.setMinSize(MAIN_WIDTH, MAIN_SMALL_HEIGHT/4);
        
        //initialize separator
        this.separHBox = new HBox();
        this.separHBox.setAlignment(Pos.CENTER); 
        Separator firstS = new Separator(Orientation.HORIZONTAL);
        firstS.setStyle("-fx-border-width: 3px; -fx-background-color:  #b3b3b3;");
        firstS.setMinWidth(MAIN_WIDTH);
        this.separHBox.getChildren().add(firstS);
        
        HBox tempHBox = new HBox();
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(25);
        grid.setPadding(new Insets(35));
        
        
        this.lUserName = new Label("LAST NAME");
        this.lUserName.setAlignment(Pos.CENTER);
        this.lUserName.setPadding(new Insets(0, 10, 0, 10));
        this.lUserName.setFont(MAIN_FONT_MEDIUM); //set a font
        grid.add(this.lUserName, 0, 1);
        
        
        this.tfUserName = new TextField();
        this.tfUserName.setPromptText("LAST NAME");
        this.tfUserName.setMinWidth(TEXTFIELD_WIDTH);
        grid.add(this.tfUserName, 1, 1); 
         
        this.lUserPassword = new Label("ID #");
        this.lUserPassword.setAlignment(Pos.CENTER);
        this.lUserPassword.setPadding(new Insets(0, 10, 0, 10));
        this.lUserPassword.setFont(MAIN_FONT_MEDIUM);
        grid.add(this.lUserPassword, 0, 2);
        
        
        this.tfUserPassword = new PasswordField();
        this.tfUserPassword.setPromptText("ID #");
        this.tfUserPassword.setMinWidth(TEXTFIELD_WIDTH);
        grid.add(this.tfUserPassword, 1, 2);
        
        
        this.btnLogin = new Button("Login");
        this.btnLogin.setFont(MAIN_FONT_MEDIUM);
        this.btnLogin.setPrefSize(BUTTON_WIDTH*2, 20);
        grid.add(this.btnLogin, 0, 4, 2, 1);
        
        this.btnRegister = new Button(" Sign Up ");
        this.btnRegister.setFont(MAIN_FONT_MEDIUM);
        this.btnRegister.setPrefSize(BUTTON_WIDTH*2, 20);
        grid.add(this.btnRegister, 0, 5, 2, 1);

        GridPane.setHalignment(this.btnLogin, HPos.CENTER);
        GridPane.setHalignment(this.btnRegister, HPos.CENTER);
        GridPane.setValignment(this.btnLogin, VPos.CENTER);
        GridPane.setValignment(this.btnRegister, VPos.CENTER);
        
        //disable button is text fileds are empty
        this.btnLogin.disableProperty().bind(this.tfUserName.textProperty().isEmpty().or(this.tfUserPassword.textProperty().isEmpty()));
            
        tempHBox.getChildren().add(grid);
        tempHBox.setAlignment(Pos.CENTER);
        
        
        VBox tempVBox = new VBox();
        tempVBox.setAlignment(Pos.TOP_CENTER);
        tempVBox.setPadding(new Insets(15, 0, 0, 0));
        tempVBox.getChildren().addAll(this.separHBox, tempHBox);
        
        
        this.resultHBox.getChildren().addAll(tempVBox);
    }//initResultHBox

    public BorderPane getMainPane(){
        return this.mainPane;
    }
    
    public void clearFiled(){
        this.tfUserName.setText("");
        this.tfUserPassword.setText("");
    }
    
    public TextField getUserName(){
        return this.tfUserName;
    }
   
    public PasswordField getUserPassword(){
        return this.tfUserPassword;
    }
    
    public Button getRegisterButton(){
        return this.btnRegister;
    }
    
    public Button getLoginButton(){
        return this.btnLogin;
    }
    
}
