/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package javacertification;


import userinterface.ResultFormUI;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Modality;
import javafx.scene.control.ButtonBar;
import java.util.Optional;
import java.util.NoSuchElementException;


public class AlertBox {

    public static void timeIsOverDialog(){
    
        Alert alert = new Alert(Alert.AlertType.NONE,"YOUR TIME IS OVER!\nPLEASE, PRESS CONTINUE BUTTON TO SEE YOUR RESULT.");
        alert.setTitle("ORACLE_s");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(null);
        alert.getDialogPane().getStylesheets().add("userinterface/MainStyleClass.css");
        
        try{
            ButtonType btYes = new ButtonType("Continue");
            alert.getButtonTypes().add(btYes);
        
            Optional<ButtonType> result = alert.showAndWait(); //thread 
        
            if( result.get() == btYes){
                Application_Iface.SUB_ROOT.setCenter(new ResultFormUI().getMainPane());  
            }
        }catch(NoSuchElementException e){
            System.out.println("ALERTBOX: " + e.toString());
            Application_Iface.SUB_ROOT.setCenter(new ResultFormUI().getMainPane()); 
        }
    }//timeIsOverDialog
    
    public void errorDialog(String content){
        Alert alert = new Alert(Alert.AlertType.ERROR, content);
        alert.setHeaderText("ERROR: ");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(null);
        alert.showAndWait(); //thread 
    }//errorDialog
     
    public static void warningDialog(String content){
        Alert alert = new Alert(Alert.AlertType.WARNING, content);
        alert.setTitle("ORACLE_s");
        alert.setHeaderText("WARNING: ");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(null);
        alert.showAndWait(); //thread 
    }//warningDialog
    
    public static boolean confirmationDialog(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("ORACLE_s");
        alert.setHeaderText("IMPORTANT NOTE");
        String manual = "1. Total Testing Time is 10 minutes.\n"
                + "2. This test consists of 20 multiple-choice questions.\n"
                + "3. Each question has five possible answers with only one being correct.\n"
                + "4. Work quickly and carefully.\n"
                + "5. Do not spend too much time on any one question.\n"
                + "6. You can come back to previous questions any time during the test.\n"
                + "7. Try to answer every question to the best of your ability.\n"
                + "8. Please, press ENTER key to start the test.";
        
        alert.setContentText(manual);
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(null);
        alert.getDialogPane().getStylesheets().add("userinterface/MainStyleClass.css");
        boolean flag = false;
        
        //create buttons
        ButtonType btYes = new ButtonType("START", ButtonBar.ButtonData.OK_DONE);

        ButtonType btNo = new ButtonType("CANCEL", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(btNo, btYes);
        
        Optional<ButtonType> result = alert.showAndWait(); //thread 
        
        if(result.get() == btYes){

            flag = true;
            
        }else{  
            flag = false;
            alert.close(); //close dialog window
        } 
        
        return flag;
    }// confirmationDialog
   
    
    public static boolean isExitExam(){
        boolean flag = false;
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "ARE YOU SURE YOU WOULD LIKE TO FINISH\nYOUR JAVA CETRIFICATION EXAM?");
        alert.setTitle("ORACLE_s");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(null);
        alert.getDialogPane().getStylesheets().add("userinterface/MainStyleClass.css");
        //create buttons
        ButtonType btYes = new ButtonType("Yes");
        ButtonType btNo = new ButtonType("No");
        alert.getButtonTypes().setAll(btNo, btYes);
        
        Optional<ButtonType> result = alert.showAndWait(); //thread 
        
        if(result.get() == btYes){

            flag = true;
            
        }else{  
            flag = false;
            alert.close(); //close dialog window
        } 
        
        return flag;
    }//isExitExam

}
