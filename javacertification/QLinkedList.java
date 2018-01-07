/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package javacertification;

import java.util.Iterator;
import java.util.LinkedList;

public class QLinkedList {
    
    private LinkedList<ResultModel> linkedList;
    
    private final int SIZE;
    private final int TOTAL;
    
    private  int currentPos = 0;
    private  int previousPos = 0;
    
    public QLinkedList(int size){
        this.SIZE = size;
        this.TOTAL = size-1;
        this.linkedList = new LinkedList<>();
    }
    
    public boolean isFull(){
       return (this.linkedList.size() == this.SIZE);
    }
    
    //define mutators
    public void setCurrentPos(int value){
        this.currentPos = value;
    }
    
    public void setPreviousPos(int value){
        this.previousPos = value;
    }
    
    public void addNewQuest(ResultModel model){
        this.linkedList.add(model);
    }
    
    //define accessor methods
    public int getCurrentPos(){
        return this.currentPos;
    }
    
    public int getPreviousPos(){
        return this.previousPos;
    }
    
    public ResultModel getResultModel(int pos){
        return this.linkedList.get(pos);
    }
    
    //logical methods
    public boolean isCurrentPos(){
        System.out.println(this.previousPos==this.currentPos);
        return ( this.previousPos==this.currentPos );
    }
    
    public boolean isTotalPos(){
        return ( this.currentPos==this.TOTAL );
    }
    
    public void printList(){
        Iterator it = this.linkedList.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
    
    private double getExamResult(int total){
        
        Iterator it = this.linkedList.iterator();
        int correctAns = 0;
        int incorrectAns = 0;

        while(it.hasNext()){
            ResultModel model = (ResultModel)it.next();
            
            if(model.getResult() == 1){ //if answer is correct
                correctAns += 1;
            
            }else{ //if answer is wrong
                incorrectAns += 1;
            }
        }//while
        
        if( (correctAns + incorrectAns) != total ){ //if user has not taken all questions
            incorrectAns = total - correctAns;
        }
        
        System.out.println("Total correct - "+correctAns);
        System.out.println("Total incorrect - " + incorrectAns);
        
        //calculate guessing penalty
        double penalty = (total - incorrectAns) / (total * 1.0); //must be double value
        
        //calculate incorrect penalty
        double incorrectPenalty = 1.0 - penalty;
         System.out.println("IncorrectPenalty - "+incorrectPenalty);
        //total incorrect quessing
        double totalIncorrect = (incorrectPenalty * incorrectAns) + incorrectAns;
        
        //total correct quessing
        double totalCorrect = (correctAns * 5) - totalIncorrect;
         System.out.println("Total result - " + totalCorrect);
        return totalCorrect;
    
    }//getExamResult
    
    public String getPersonTitle(int total){
        
        double points = getExamResult(total);
        String title = "";
        
        if(points >= 65 && points < 75){
            title = "Java Certified Programmer";
            
        }else if(points >= 75 && points < 85){
            title = "Java Certified Developer";
        
        }else if(points >= 85){
            title = "Java Certified Architect";
            
        }else{
            title = "None";
        }
        return title;
    }//getPersonTitle
        
    public double getPersonScore(int x){
        return getExamResult(x);
    }
}
