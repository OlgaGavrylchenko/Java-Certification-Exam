/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package javacertification;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.FileNotFoundException;
import java.sql.*;


public class JavaCertification extends Application implements Application_Iface{
    
    private final BorderPane root = new BorderPane();
    private Connection connection = null;
    
    //JDBC driver name and database URL
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/javaexam";
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        //initialize database conectivity
        initializeDB();
        
        //define and execute line 37 and 38 if needed
        //PreCompileClass obj = new PreCompileClass(this.connection);
        //obj.initQAdvance();

        //define an oject
        new LogInScene(connection);
        
        Label title = new Label("@Created by Olga Gavrylchenko, 12/10/2017");
        title.setPrefHeight(30);
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().add(title);
        

        SUB_ROOT.setStyle(" -fx-background-color: #fff;");
        root.setStyle(" -fx-background-color: #fff;");        
        root.setCenter(SUB_ROOT);
        root.setBottom(hbox);
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Java Certification Examinations");
        primaryStage.setMinWidth(SCREEN_WIDTH);
        primaryStage.setMinHeight(SCREEN_HEIGHT);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
     @Override //application method stop()
    public void stop(){ //This method is called when the application should stop, 
                        //and provides a convenient place to prepare for 
                        //application exit and destroy resources.
        try{
            if(connection != null){
                connection.close();
                System.out.println("Connection is closed!");
            }
                
        }catch(SQLException e){
            System.out.println("SQL error: " + e.toString());
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    //method which connect javaFX app to database
    private void initializeDB(){
        try{
        //load the JDBC driver
        Class.forName(DRIVER);
        
        //establish the connection - connect to database
        connection = DriverManager.getConnection(DATABASE_URL, "olga", "gavrylc");
       
        }catch(ClassNotFoundException e){
            e.printStackTrace();          
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }//initializeDB

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
