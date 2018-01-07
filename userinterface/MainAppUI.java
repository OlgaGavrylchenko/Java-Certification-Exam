/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package userinterface;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainAppUI implements UserInterface_Iface{
    
    private PrevQuestionUI prevListForm;
    private NewQuestionUI newQuestForm;
    
    private final HBox mainPane;
    private HBox prevQuestHBox, newQuestHBox, timerHBox, buttonHBox, tempHBox;    
    private VBox mainVBox;
    
    private Button btPrev, btNext, btSubmit;
    
    private Label tfTimer, tfUserId;
    
    
    public MainAppUI(){
        
        //initialize main pane
        this.mainPane = new HBox();
        
        //initialize all containers
        this.prevQuestHBox = new HBox();
        this.newQuestHBox = new HBox();
        this.timerHBox = new HBox();
        this.buttonHBox = new HBox();
        this.tempHBox = new HBox();
        
        //initialize vbox and add three containers
        this.mainVBox = new VBox();
        this.mainVBox.getChildren().addAll(this.timerHBox, this.newQuestHBox, this.buttonHBox);
        //add vbox to hbox
        this.tempHBox.getChildren().add(this.mainVBox);
        
        //add two main xbox to mainpane
        this.mainPane.getChildren().add(this.tempHBox);//this.prevQuestHBox
        
        
        //instantiate an list form
        this.prevListForm = new PrevQuestionUI();
        this.newQuestForm = new NewQuestionUI();
        
        initMainPane();
        initPrevQuestHBox();
        initTempHBox();
    }
    
    private void initMainPane(){
        
        //set size
        this.mainPane.setMinSize(MAIN_WIDTH, MAIN_HEIGHT);
        this.mainPane.setAlignment(Pos.CENTER);
        
    }//initMainPane
    
    private void initPrevQuestHBox(){
        
        //set size
        this.prevQuestHBox.setMinSize(SMALLBOX_WIDTH, SMALLBOX_HEIGHT);
        this.prevQuestHBox.setMaxSize(SMALLBOX_WIDTH, SMALLBOX_HEIGHT);
        this.prevQuestHBox.setStyle(SECOND_COLOR);
        this.prevQuestHBox.setAlignment(Pos.CENTER);
        //add list view to a hbox
        this.prevQuestHBox.getChildren().add(this.prevListForm.getMainListView());
        
    }//initializePrevQuestHBox
    
    private void initTempHBox(){
        //set size
        this.tempHBox.setMinSize(LARGEBOX_WIDTH+10, MAIN_HEIGHT);
        
        //set newquestbox
        this.newQuestHBox.setMinSize(LARGEBOX_WIDTH, LARGEBOX_HEIGHT);
        this.newQuestHBox.setMaxSize(LARGEBOX_WIDTH, LARGEBOX_HEIGHT);
        this.newQuestHBox.setStyle(SECOND_COLOR);
        
        //add form view to hbox
        this.newQuestHBox.getChildren().add(this.newQuestForm.getMainHBox());
        
        initButtonHBox();
        initTimerHBox();
        
    }//initTempHBox
    
    private void initButtonHBox(){
        //set size for button box
        this.buttonHBox.setMinSize(LARGEBOX_WIDTH, TOP_HEIGHT);
        this.buttonHBox.setMaxSize(LARGEBOX_WIDTH, TOP_HEIGHT);
        this.buttonHBox.setStyle(MAIN_COLOR);
        
        //create button
        this.btPrev = new Button("PREVIOUS");
        this.btNext = new Button("NEXT"); 
        this.btSubmit = new Button("SUBMIT");
        
        this.btPrev.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        this.btNext.setMinSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        this.btSubmit.setMinSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        this.btPrev.setFont(MAIN_FONT_MEDIUM);
        this.btNext.setFont(MAIN_FONT_MEDIUM);
        this.btSubmit.setFont(MAIN_FONT_MEDIUM);
        
        GridPane tempGrid = new GridPane();
        tempGrid.add(this.btPrev, 0, 1);
        tempGrid.add(this.btNext, 1, 1);
        tempGrid.add(this.btSubmit, 2, 1);
        tempGrid.add(new Label(), 3, 1);
        tempGrid.setVgap(15);
        tempGrid.setHgap(20);
        this.buttonHBox.setAlignment(Pos.CENTER_RIGHT);
        
        //add button to hbox
        this.buttonHBox.getChildren().add(tempGrid);
    }//initButtonHBox
    
    private void initTimerHBox(){
        //set size for timer box
        this.timerHBox.setMinSize(LARGEBOX_WIDTH, TOP_HEIGHT);
        this.timerHBox.setMaxSize(LARGEBOX_WIDTH, TOP_HEIGHT);
        this.timerHBox.setStyle(MAIN_COLOR);
        
        this.tfTimer = new Label();
        this.tfTimer.setPrefSize(LABEL_WIDTH, TEXTFIELD_HEIGHT);
        this.tfTimer.setMinSize(LABEL_WIDTH, TEXTFIELD_HEIGHT);
        this.tfTimer.setFont(TIMER_FONT_MEDIUM);
        this.tfTimer.setAlignment(Pos.CENTER);
        
        this.tfUserId = new Label();
        this.tfUserId.setPrefSize(LABEL_WIDTH, TEXTFIELD_HEIGHT);
        this.tfUserId.setMinSize(LABEL_WIDTH, TEXTFIELD_HEIGHT);
        this.tfUserId.setFont(TIMER_FONT_MEDIUM);
        this.tfUserId.setAlignment(Pos.CENTER);
        
        GridPane tempGrid = new GridPane();
        tempGrid.add(this.tfUserId, 0, 1);
        tempGrid.add(this.tfTimer, 2, 1);
        tempGrid.setVgap(40);
        tempGrid.setHgap(50);
        
        this.timerHBox.setAlignment(Pos.BOTTOM_CENTER);
        this.timerHBox.getChildren().add(tempGrid);
    }//initTimerHBox
    
    
    public HBox getMainPane(){
        return this.mainPane;
    }
    
    //get list view which holds previous questions
    public ListView<String> getListView(){
        return this.prevListForm.getMainListView();
    }
    
    public Button getPrevButton(){
        return this.btPrev;
    }
    
    public Button getNextButton(){
        return this.btNext;
    }
    
    public Button getSubmitButton(){
        return this.btSubmit;
    }
    
    public Label getTimerField(){
        return this.tfTimer;
    }
    
     public void setUserId(String value){
         this.tfUserId.setText( ("ID:  "+value) );
     }
     
      public NewQuestionUI getNewQuestUI(){
          return this.newQuestForm;
      }
     
}
