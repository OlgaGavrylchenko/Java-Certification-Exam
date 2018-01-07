/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package javacertification;

import userinterface.NewQuestionUI;
import java.io.ByteArrayInputStream;
import java.sql.*;
import javafx.application.Platform;
import javafx.scene.image.Image;


public class PreviousQuestion implements UserData_Iface{
    
    private Connection connection = null;
    private NewQuestionUI mainForm;
    private boolean disableButton;
    
    public PreviousQuestion(Connection connection, NewQuestionUI mainForm){
        this.connection = connection;
        this.mainForm = mainForm;
        this.disableButton = false;
        
    }
    
    public void init(){
        int posCurr = UserData_Iface.QList.getCurrentPos();
        int pos = UserData_Iface.QList.getPreviousPos();
        System.out.println("Position Curr "+(posCurr));
        System.out.println("Position Prev "+(pos));
        
          if(posCurr == pos){ //if prev == current
               String answer="";
              
               if(this.mainForm.getAnswerGroup().getSelectedToggle() != null){
                        
                  answer = (String)this.mainForm.getAnswerGroup().getSelectedToggle().getUserData();      
               }else{       
                  answer = "";  
               }
               
               ResultModel modelPrev =  UserData_Iface.QList.getResultModel(( UserData_Iface.QList.getCurrentPos())); 
                        
               //set selected answer
               System.out.println("Previous answer");
               modelPrev.setSelectedAnswer(answer);
               System.out.println(modelPrev.toString());
      
               //decrement current position
               pos--;
               prevQuestion(pos);
          
          }else if(pos < posCurr && pos != 0){ //if prev < current
               System.out.println("Prev quest");
         
               String answer="";
              
               if(this.mainForm.getAnswerGroup().getSelectedToggle() != null){
                        
                  answer = (String)this.mainForm.getAnswerGroup().getSelectedToggle().getUserData();      
               }else{       
                  answer = "";  
               }
               
               ResultModel modelPrev =  UserData_Iface.QList.getResultModel(pos); 
   
               //set selected answer
               System.out.println("Previous answer");
               modelPrev.setSelectedAnswer(answer);
               System.out.println(modelPrev.toString());
 
               //decrement current position
               pos--;
               prevQuestion(pos);
          }else{ //if prev == 0
            setFirstElement(true);
            System.out.println("no more questions");
            
       }
    }
    
    private void prevQuestion(int pos){
        
        ResultModel model = UserData_Iface.QList.getResultModel(pos);
        //show question and answers on a screen

        setQuestAnswer(model);
       
        //decrement current pos
        UserData_Iface.QList.setPreviousPos(pos);  
    }
    
    private void setQuestAnswer(ResultModel model){
        this.mainForm.setQuestionImage(model.getQuestion());
        this.mainForm.setFirstRadioButton(model.getAnswerOne(), model.getAnswerOne());
        this.mainForm.setSecondRadioButton(model.getAnswerTwo(), model.getAnswerTwo());
        this.mainForm.setThirdRadioButton(model.getAnswerThree(), model.getAnswerThree());
        this.mainForm.setForthRadioButton(model.getAnswerFour(), model.getAnswerFour());
        this.mainForm.setFifthRadioButton(model.getAnswerFive(), model.getAnswerFive());
        
        if(model.getSelectedAnswer() != null){
            if(model.getSelectedAnswer().equals(model.getAnswerOne())){
                this.mainForm.getFirstRadioButton().setSelected(true);
            
            }else if(model.getSelectedAnswer().equals(model.getAnswerTwo())){
                this.mainForm.getSecondRadioButton().setSelected(true);
            
            }else if(model.getSelectedAnswer().equals(model.getAnswerThree())){
                this.mainForm.getThirdRadioButton().setSelected(true);
            
            }else if(model.getSelectedAnswer().equals(model.getAnswerFour())){
                this.mainForm.getForthradioButton().setSelected(true);
            
            }else if(model.getSelectedAnswer().equals(model.getAnswerFive())){
                this.mainForm.getFifthradioButton().setSelected(true);
            }
        }
    }
    
    private void setFirstElement(boolean flag){
        this.disableButton = flag;
    }
    
    public boolean isFirstElement(){
        return this.disableButton;
    }
    
}
