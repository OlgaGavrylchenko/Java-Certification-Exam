/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package javacertification;

import javafx.application.Platform;
import javafx.scene.control.Label;

public class MainTimer implements Runnable{
    
    private Label tfTimer;
    private volatile boolean exit = false;
    private volatile boolean isOver = false;
    
    public MainTimer(Label tfTimer){
        this.tfTimer = tfTimer;
    }
    
    public void run(){
   
            String result = "";
                try{
                    for(int min=9; min >= 0; min--){
                        for(int sec=59; sec>=0; sec--){
                            // Update the Label on the JavaFx Application Thread     
                            String str = this.getTime(min, sec);
                            
                             Platform.runLater(()->{
                                 this.tfTimer.setText("");
                                 this.tfTimer.setText(str);
                             
                             });
                            
                             if(min == 0 && sec == 0){
                                System.out.println("Stop ");
                                
                               Platform.runLater(() ->{
                                    AlertBox.timeIsOverDialog();
                               });
                                
                               break;
                             }
                             
                             if(Thread.currentThread().isInterrupted()){
                                 break;
                             }
                           
                           
                           Thread.sleep(1000);
                        }
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();        
                }    
    }// run
    
    private String getTime(int min, int sec){
        String str = "", mStr="", sStr="";
        
        if(min < 10){
            mStr="0"+String.valueOf(min);
        }else{
            mStr = String.valueOf(min);
        }
        
        if(sec < 10){
            sStr = "0"+String.valueOf(sec);
        }else{
            sStr = String.valueOf(sec);
        }
        
        str = "00:" + mStr + ":" + sStr;
        
        return str;
    }//getTime
    
    private boolean isExit(){
        return this.exit;
    }
    
    public void setExit(boolean flag){
        this.exit = flag;
    }
 
    private void setTimeIsOver(boolean flag){
        this.isOver = flag;
    }
    
    public boolean getTimeIsOver(){
        return this.isOver;
    }
    
}
