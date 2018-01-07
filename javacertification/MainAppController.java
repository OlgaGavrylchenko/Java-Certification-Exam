/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package javacertification;

import userinterface.MainAppUI;
import userinterface.ResultFormUI;
import javafx.application.Platform;
import javafx.scene.layout.HBox;
import javafx.event.ActionEvent;
import java.sql.*;


public class MainAppController implements UserData_Iface, Application_Iface, UserInfo_Iface{
    
    private Connection connection;
    protected MainAppUI mainForm;
    
    private MainTimer mainTimer;
    private NextQuestion mainNextQ;
    protected PreviousQuestion mainPrevQ;
    
    protected Thread thread1;
    
    public MainAppController(Connection connection){
        this.connection = connection;
        this.mainForm = new MainAppUI();
        
        Application_Iface.SUB_ROOT.setCenter( this.mainForm.getMainPane());
        
        //instantiate a timer object
        this.mainTimer = new MainTimer(this.mainForm.getTimerField());
        this.thread1 = new Thread(this.mainTimer); //initialize a thread
        this.thread1.setDaemon(true);
        
       
        this.mainNextQ = new NextQuestion(this.connection, this.mainForm.getNewQuestUI());
        this.mainPrevQ = new PreviousQuestion(this.connection, this.mainForm.getNewQuestUI());
        
        //initialize userid
        this.mainForm.setUserId(UserInfo_Iface.USER_INFO.getUserID());
        this.mainForm.getPrevButton().setDisable(true);
        

        this.mainForm.getNextButton().setOnAction((ActionEvent event)->{
            
              this.mainNextQ.init();
              
             
              if(UserData_Iface.QList.getPreviousPos() == 0){
                    this.mainForm.getPrevButton().setDisable(true);
              }else if(UserData_Iface.QList.getCurrentPos() == 19 && UserData_Iface.QList.getPreviousPos() == 19){
                    this.mainForm.getNextButton().setDisable(true);
              }else{
                    this.mainForm.getPrevButton().setDisable(false);
                    this.mainForm.getNextButton().setDisable(false);
              }
              
        });
        
        this.mainForm.getPrevButton().setOnAction((ActionEvent e)->{

               Thread thread = new Thread(new GoPrevQ());
               thread.start();
               
        });
        
        
        this.mainForm.getSubmitButton().setOnAction((ActionEvent e)->{
            
                if( AlertBox.isExitExam() == true){
                   this.mainTimer.setExit(true);
                   this.thread1.interrupt();
                   String title = UserData_Iface.QList.getPersonTitle(20);
                   double score = UserData_Iface.QList.getPersonScore(20);
                   
                   Application_Iface.SUB_ROOT.setCenter(new ResultFormUI(title, score).getMainPane());

                   System.out.println("Exam is over");
                   UserData_Iface.QList.printList(); 
                   System.out.println(title);
                   System.out.println(String.valueOf(score));
                }
        });
        
    }
    
    public void startTimer(){
           
           thread1.start();      
    }
    
    public HBox getMainPane(){
        return this.mainForm.getMainPane();
    }
    
    public MainAppUI getMainForm(){
        return this.mainForm;
    }
    
    public class GoPrevQ implements Runnable {
        @Override
        public void run() {
            Platform.runLater(() -> {
                mainPrevQ.init();    
                  
               if(UserData_Iface.QList.getPreviousPos() == 0){
                    mainForm.getPrevButton().setDisable(true);
               }else if(UserData_Iface.QList.getCurrentPos() == 19 && UserData_Iface.QList.getPreviousPos() == 19){
                    mainForm.getNextButton().setDisable(true);
               }else{
                    mainForm.getPrevButton().setDisable(false);
                    mainForm.getNextButton().setDisable(false);
               }
            });
        }
    }
    
}
