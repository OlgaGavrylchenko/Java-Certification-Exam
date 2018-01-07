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
import javafx.scene.image.Image;


public class NextQuestion implements UserData_Iface{
    
    private Connection connection = null;
    private NewQuestionUI mainForm;
    private int tableId;
    
    public NextQuestion(Connection connection, NewQuestionUI mainForm){
        this.connection = connection;
        this.mainForm = mainForm;
        
        //show first question
        int pos = UserData_Iface.QList.getCurrentPos();
        if( pos == 0){ //get first question
            int qId = getRandomNum();
            this.tableId = getRandomTableNum();
            nextQuestion(qId, this.tableId, pos);      
        }
    }
    
    public void init(){
        int pos = UserData_Iface.QList.getCurrentPos();
       int prevPos = UserData_Iface.QList.getPreviousPos();
        System.out.println("Position "+(pos));
        System.out.println("Prev button " + prevPos);
        
       if(!UserData_Iface.QList.isFull()){
                
            if(pos == prevPos){//if current pos < 19, and prev==current
               String answer = "";
                    if(this.mainForm.getAnswerGroup().getSelectedToggle() != null){
                        
                      answer = (String)this.mainForm.getAnswerGroup().getSelectedToggle().getUserData();
                      
                    }else{
                        
                      answer = "";  
                    }
                
                    ResultModel modelPrev =  UserData_Iface.QList.getResultModel(( UserData_Iface.QList.getCurrentPos())); 
                        
                    //set selected answer
                    modelPrev.setSelectedAnswer(answer);
                    System.out.println(modelPrev.toString());
                        
                    if(modelPrev.getResult() == 1){ //correct
                        if(modelPrev.getTableId() < 4){
                             this.tableId = modelPrev.getTableId()+1;
                         }else{
                             this.tableId = modelPrev.getTableId();
                         }
                     }else{//incorrect
                         if(modelPrev.getTableId() == 1){
                             this.tableId = modelPrev.getTableId();
                          }else{
                             this.tableId = modelPrev.getTableId()-1;
                          }
                     }    
                    //get random number    
                    int qId = getRandomNum();
                    //increment current position
                    pos++;
                    //show next question
                    nextQuestion(qId, this.tableId, pos);
                    
          }else if(prevPos < pos){ //if previous answer before current answer
               prevNextQuestion(prevPos);
          }
 
        }else{
            if(prevPos < pos){ //if previous answer before current answer
               prevNextQuestion(prevPos);
          }
        }
    }//init
    
    private void nextQuestion(int id, int table_id, int pos){
        
        ResultModel model = getQuestionFromDB(id, table_id);
        //show question and answers on a screen
        setQuestAnswer(model);
        //add user data to list
        UserData_Iface.QList.addNewQuest(model);
        //increment current pos
        UserData_Iface.QList.setCurrentPos(pos);
        UserData_Iface.QList.setPreviousPos(pos);
        
    }//nextQuestion
    
    private void prevNextQuestion(int prevPos){
        String answer = "";
        if(this.mainForm.getAnswerGroup().getSelectedToggle() != null){
                        
            answer = (String)this.mainForm.getAnswerGroup().getSelectedToggle().getUserData();             
        }else{ 
            answer = "";  
        }
        //find current data from linked list        
        ResultModel modelPrev =  UserData_Iface.QList.getResultModel(prevPos);  
        //set selected answer
        modelPrev.setSelectedAnswer(answer);
               
        System.out.println("Changed Answer: ");
        System.out.println(modelPrev.toString());
               
        //set next question
        prevPos++;
        setQuestAnswer(UserData_Iface.QList.getResultModel( prevPos ));
        //increment previous position
        UserData_Iface.QList.setPreviousPos(prevPos);
    }
    
    private void setSelectedRadioButton(ResultModel model){
        
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
        
    }//setSelectedRadioButton
    
    
    private int getRandomNum(){
        int min = 1, max = 25, num;
        
        num = min + (int)(Math.random() * max);
        
        return num;
    }//getRandomNum
    
    
     private int getRandomTableNum(){
        int min = 1, max = 4, num;
        
        num = min + (int)(Math.random() * max);
        
        return num;
    }//getRandomNum
    
     
    public ResultModel getQuestionFromDB(int id, int table_id){
        
        Image image = null;
        ResultModel model = null;
        PreparedStatement preparedSt = null;
        ResultSet resultSet = null;
        
        String one, two, three, four, five, rightAns, query=null;
        Blob blob;
        byte[] arr;
        
        try {           
            switch(table_id){ //select question based on table_id
                case 1: 
                    query = "SELECT * FROM question_easy WHERE id=?";
                    break;
                case 2:
                    query = "SELECT * FROM question_medium WHERE id=?";
                    break;
                case 3:
                    query = "SELECT * FROM question_hard WHERE id=?";
                    break;
                case 4:
                    query = "SELECT * FROM question_advance WHERE id=?";
                    break;   
            }
            
            preparedSt = this.connection.prepareStatement(query);
            
            preparedSt.setInt(1, id);
            
            resultSet = preparedSt.executeQuery();
            
            if(resultSet.next()){
               
               blob = resultSet.getBlob("question");
               arr = blob.getBytes(1L, (int)blob.length());
               image = new Image(new ByteArrayInputStream(arr)); //convert byte array to an image
               
               one = resultSet.getString("answer_one");
               two = resultSet.getString("answer_two");
               three = resultSet.getString("answer_three");
               four = resultSet.getString("answer_four");
               five = resultSet.getString("answer_five");
               rightAns = resultSet.getString("correct_ans");      
               
               //instantiate an object
               model = new ResultModel(image, one, two, three, four, five, rightAns, this.tableId);       
           } 
            
              //Clean-up environment
               resultSet.close();
               preparedSt.close();

        }catch (SQLException ex) {
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(preparedSt != null){
                try{
                    preparedSt.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(resultSet != null){
                try{
                    resultSet.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        } 
        return model;
    }//getQuestionFromDB
    
    
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
    }//setQuestAnswer    
    
}
