/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package javacertification;

import javafx.scene.image.Image;


public class ResultModel {
    
    private Image question;
    private String answer_one;
    private String answer_two;
    private String answer_three;
    private String answer_four;
    private String answer_five;
    private String selectedAnswer;
    private String rightAnswer;
    private int result;
    private int table_id;
    
    public ResultModel(Image image, String one, String two, String three, String four, String five, String selected, String right, int result){
        this.question = image;
        this.answer_one = one;
        this.answer_two = two;
        this.answer_three = three;
        this.answer_four = four;
        this.answer_five = five;
        this.selectedAnswer = selected;
        this.rightAnswer = right;
        this.result = result;
    }
    
    public ResultModel(Image image, String one, String two, String three, String four, String five, String right, int tableID){
        this.question = image;
        this.answer_one = one;
        this.answer_two = two;
        this.answer_three = three;
        this.answer_four = four;
        this.answer_five = five;
        this.rightAnswer = right;
        this.table_id = tableID;
    }   
    
    //define mutator function
    public void setSelectedAnswer(String answer){
        this.selectedAnswer = answer;
        
        if(this.selectedAnswer.equals(this.rightAnswer)){
            setResult(1);
        }else{
            setResult(0);
        }
    }
    
    private void setResult(int num){
        this.result = num;
    }
    
    public void setTableId(int id){
        this.table_id = id;
    }
    
    
    //define accessor methods
    public Image getQuestion() {
        return this.question;
    }
    
    public String getAnswerOne(){
        return this.answer_one;
    }
    
    public String getAnswerTwo(){
        return this.answer_two;
    }
    
    public String getAnswerThree(){
        return this.answer_three;
    }
    
    public String getAnswerFour(){
        return this.answer_four;
    }
    
    public String getAnswerFive(){
        return this.answer_five;
    }
    
    public String getSelectedAnswer(){
        return this.selectedAnswer;
    }
    
    public String getRightAnswer(){
        return this.rightAnswer;
    }
    
    public int getResult(){
        return this.result;
    }
    
    public int getTableId(){
        return this.table_id;
    }
    
    public String toString(){
        return  ( "Table ID " + String.valueOf(this.table_id) + "\n"+
                    "Image " + this.question.toString() +"\n"+
                    "Answer one " + this.answer_one +"\n"+
                    "Answer two " + this.answer_two +"\n"+
                    "Answer three " + this.answer_three +"\n"+
                    "Answer four " +this.answer_four+"\n"+
                    "Answer five " +this.answer_five +"\n"+
                    "Selected " +this.selectedAnswer +"\n"+
                    "Correct " +this.rightAnswer+"\n"+
                    "Result " +String.valueOf(this.result) + "\n" ) ;
    }
    
}
