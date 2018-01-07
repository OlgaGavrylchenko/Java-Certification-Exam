/*
/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package userinterface;

import javafx.geometry.Insets;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.ImageView;

public class NewQuestionUI implements UserInterface_Iface{
    
    private HBox mainHBox, questionHBox, answerHBox;
    private VBox mainVBox;
    
    private ToggleGroup groupAnswer;
    private RadioButton rbOne, rbTwo, rbThree, rbFour, rbFive;
    
    public NewQuestionUI(){
    
        this.mainHBox = new HBox();
        this.mainVBox = new VBox();
        this.questionHBox = new HBox();
        this.answerHBox = new HBox();
   
        initMainHBox();
        
        this.mainVBox.getChildren().addAll(this.questionHBox, this.answerHBox);
        this.mainHBox.getChildren().add(this.mainVBox);
    }
    
    private void initMainHBox(){
        //set main hbox size
        this.mainHBox.setMinSize(LARGEBOX_WIDTH, LARGEBOX_HEIGHT);
        this.mainHBox.setMaxSize(LARGEBOX_WIDTH, LARGEBOX_HEIGHT);
        
        initQuestionHBox();
        initAnswerHBox();      
    }
    
    private void initQuestionHBox(){
        this.questionHBox.setMinSize(LARGEBOX_WIDTH, LARGEBOX_HEIGHT_QUEST);
        this.questionHBox.setMaxSize(LARGEBOX_WIDTH, LARGEBOX_HEIGHT_QUEST);
        this.questionHBox.setStyle(THIRD_COLOR);
    }
    
    private void initAnswerHBox(){
        this.answerHBox.setMinSize(LARGEBOX_WIDTH, LARGEBOX_HEIGHT_ANS);
        this.answerHBox.setMaxSize(LARGEBOX_WIDTH, LARGEBOX_HEIGHT_ANS);
        
        //initialize togglegroup of radio buttons
        this.groupAnswer = new ToggleGroup();
        
        //initialize radio button
        this.rbOne = new RadioButton("First answer");
        this.rbOne.setToggleGroup(groupAnswer);
        this.rbOne.setContentDisplay(ContentDisplay.LEFT);
        this.rbOne.setFont(CHECKBOX_FONT_MEDIUM);
        this.rbOne.setStyle("-fx-border-width: 1px; -fx-border-color: #f2f2f2");
        this.rbOne.setPrefWidth(LARGEBOX_WIDTH);
        this.rbOne.setPadding(new Insets(10));
        
        this.rbTwo = new RadioButton("First answer");
        this.rbTwo.setToggleGroup(groupAnswer);
        this.rbTwo.setContentDisplay(ContentDisplay.LEFT);
        this.rbTwo.setFont(CHECKBOX_FONT_MEDIUM);
        this.rbTwo.setStyle("-fx-border-width: 1px; -fx-border-color: #f2f2f2");
        this.rbTwo.setPrefWidth(LARGEBOX_WIDTH);
        this.rbTwo.setPadding(new Insets(10));
        
        this.rbThree = new RadioButton("First answer");
        this.rbThree.setToggleGroup(groupAnswer);
        this.rbThree.setContentDisplay(ContentDisplay.LEFT);
        this.rbThree.setFont(CHECKBOX_FONT_MEDIUM);
        this.rbThree.setStyle("-fx-border-width: 1px; -fx-border-color: #f2f2f2");
        this.rbThree.setPrefWidth(LARGEBOX_WIDTH);
        this.rbThree.setPadding(new Insets(10));
        
        this.rbFour = new RadioButton("First answer");
        this.rbFour.setToggleGroup(groupAnswer);
        this.rbFour.setContentDisplay(ContentDisplay.LEFT);
        this.rbFour.setFont(CHECKBOX_FONT_MEDIUM);
        this.rbFour.setStyle("-fx-border-width: 1px; -fx-border-color: #f2f2f2");
        this.rbFour.setPrefWidth(LARGEBOX_WIDTH);
        this.rbFour.setPadding(new Insets(10));
        
        this.rbFive = new RadioButton("First answer");
        this.rbFive.setToggleGroup(groupAnswer);
        this.rbFive.setContentDisplay(ContentDisplay.LEFT);
        this.rbFive.setFont(CHECKBOX_FONT_MEDIUM);
        this.rbFive.setStyle("-fx-border-width: 1px; -fx-border-color: #f2f2f2");
        this.rbFive.setPrefWidth(LARGEBOX_WIDTH);
        this.rbFive.setPadding(new Insets(10, 10, 20, 10));
        
        VBox tempVBox = new VBox();
        
        tempVBox.getChildren().addAll(this.rbOne, this.rbTwo, this.rbThree, this.rbFour, this.rbFive);
        
        this.answerHBox.getChildren().add(tempVBox);
    }//initAnswerHBox
    
    public HBox getMainHBox(){
        return this.mainHBox;
    }
    
    public HBox getQuestionHBox(){
        return this.questionHBox;
    }
    
    public ToggleGroup getAnswerGroup(){
        return this.groupAnswer;
    }
    
    public RadioButton getFirstRadioButton(){
        return this.rbOne;
    }
    
    public RadioButton getSecondRadioButton(){
        return this.rbTwo;
    }
    
    public RadioButton getThirdRadioButton(){
        return this.rbThree;
    }
    
    public RadioButton getForthradioButton(){
        return this.rbFour;
    }
    
    public RadioButton getFifthradioButton(){
        return this.rbFive;
    }
   
    //mutator methods
    public void setFirstRadioButton(String displayValue, String userData){
        this.rbOne.setSelected(false);
        this.rbOne.setText(displayValue);
        this.rbOne.setUserData(userData);
    }
    
    public void setSecondRadioButton(String displayValue, String userData){
        this.rbTwo.setSelected(false);
        this.rbTwo.setText(displayValue);
        this.rbTwo.setUserData(userData);
    }
    
    public void setThirdRadioButton(String displayValue, String userData){
        this.rbThree.setSelected(false);
        this.rbThree.setText(displayValue);
        this.rbThree.setUserData(userData);
    }
    
    public void setForthRadioButton(String displayValue, String userData){
        this.rbFour.setSelected(false);
        this.rbFour.setText(displayValue);
        this.rbFour.setUserData(userData);
    }
    
    public void setFifthRadioButton(String displayValue, String userData){
        this.rbFive.setSelected(false);
        this.rbFive.setText(displayValue);
        this.rbFive.setUserData(userData);
    }
    
    public void setQuestionImage(Image image){
        this.questionHBox.getChildren().clear();
        
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(IMAGE_HEIGHT);
        imageView.setFitWidth(IMAGE_WIDTH); 
        
        this.questionHBox.getChildren().add(imageView);
    }
}
