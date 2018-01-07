/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package userinterface;

import javacertification.UserData_Iface;
import javacertification.UserInfo_Iface;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;

public class ResultFormUI implements UserInterface_Iface, UserInfo_Iface{
    
    private final BorderPane mainPane;
    
    private HBox titleHBox, resultHBox, separHBox, congratHBox, personTHBox, personSHBox;
    private Label lTitle, lCongratulation, lPersonTitle, lPersonTitleR, lPersonScore, lPersonScoreR, lInfo;
    
    private String userTitle;
    private double userScore;
    
    public ResultFormUI(String title, double score){
        this.mainPane = new BorderPane();
        this.userTitle = title;
        this.userScore = score;
        
         //set size
        this.mainPane.setMinSize(MAIN_WIDTH, MAIN_HEIGHT);
        this.mainPane.setMaxSize(MAIN_WIDTH, MAIN_HEIGHT);
        init();
    }
    
    public ResultFormUI(){
         this.mainPane = new BorderPane();
         
         this.userTitle = UserData_Iface.QList.getPersonTitle(20);
         this.userScore = UserData_Iface.QList.getPersonScore(20);
         
         this.mainPane.setMinSize(MAIN_WIDTH, MAIN_HEIGHT);
         this.mainPane.setMaxSize(MAIN_WIDTH, MAIN_HEIGHT);
         init();
    }
    
    public void init(){
        this.titleHBox = new HBox();
        this.resultHBox = new HBox();
        
        this.separHBox = new HBox();
        this.congratHBox = new HBox();
        this.personTHBox = new HBox();
        this.personSHBox = new HBox();
        
        //initialize lable
        this.lTitle = new Label();
        this.lCongratulation = new Label();
        this.lPersonScore = new Label();
        this.lPersonScoreR = new Label();
        this.lPersonTitleR = new Label();
        this.lPersonTitle = new Label();
        this.lInfo = new Label();
        
        Separator firstS = new Separator(Orientation.HORIZONTAL);
        firstS.setStyle("-fx-border-width: 3px; -fx-background-color:  #b3b3b3;");
        firstS.setMinWidth(MAIN_WIDTH);
        
        this.separHBox.getChildren().add(firstS);
        this.congratHBox.getChildren().add(this.lCongratulation);
        this.personTHBox.getChildren().addAll(this.lPersonTitleR, this.lPersonTitle);
        this.personSHBox.getChildren().addAll(this.lPersonScoreR, this.lPersonScore);
        
        VBox tempVBox = new VBox();
        tempVBox.setAlignment(Pos.TOP_CENTER);
        tempVBox.getChildren().addAll(this.separHBox, this.congratHBox, this.personTHBox, this.personSHBox);
        
        this.titleHBox.getChildren().add(this.lTitle);
        this.resultHBox.getChildren().add(tempVBox);
        
        this.mainPane.setTop(this.titleHBox);
        this.mainPane.setCenter(this.resultHBox);
        this.mainPane.setBottom(this.lInfo);
        setStyleForm();
    }// init
    
    private void setStyleForm(){
        
        this.titleHBox.setMinSize(MAIN_WIDTH, MAIN_SMALL_HEIGHT); 
        this.titleHBox.setMaxSize(MAIN_WIDTH, MAIN_SMALL_HEIGHT); 
        this.resultHBox.setMinSize(MAIN_WIDTH, MAIN_LARGE_HEIGHT); 
        
        this.separHBox.setMinSize(MAIN_WIDTH, MAIN_SMALL_HEIGHT/4);
        this.congratHBox.setMinSize(MAIN_WIDTH, MAIN_SMALL_HEIGHT);
        this.congratHBox.setMaxSize(MAIN_WIDTH, MAIN_SMALL_HEIGHT);
        this.personTHBox.setMinSize(MAIN_WIDTH, MAIN_SMALL_HEIGHT/2);
        this.personSHBox.setMinSize(MAIN_WIDTH, MAIN_SMALL_HEIGHT/2);
        
        this.separHBox.setAlignment(Pos.CENTER); 
        this.congratHBox.setAlignment(Pos.TOP_CENTER); 
        this.personTHBox.setAlignment(Pos.CENTER); 
        this.personSHBox.setAlignment(Pos.CENTER); 
        
        this.titleHBox.setStyle("-fx-background-color: #66ccff");
        this.titleHBox.setAlignment(Pos.CENTER); 
        this.resultHBox.setAlignment(Pos.CENTER);
        
        this.lTitle.setText("ORACLE_s");
        this.lTitle.setFont(TITLE_FONT_EXLARGE);
        this.lTitle.setTextFill(Color.WHITE);
        this.lTitle.setTextAlignment(TextAlignment.CENTER);
        this.lTitle.setAlignment(Pos.CENTER);  
        
        if(!this.userTitle.equals("None")){
            this.lCongratulation.setText( ("CONGRATULATIONS!\n"+ UserInfo_Iface.USER_INFO.getFirstName().toUpperCase() + " "
                                                        + UserInfo_Iface.USER_INFO.getLastName().toUpperCase()));
            
            this.lPersonTitleR.setText("CERTIFICATE TITLE: ");
            this.lPersonTitleR.setMinWidth(LABEL_WIDTH);
            this.lPersonTitleR.setFont(TITLE_FONT_MEDIUM);
            this.lPersonTitleR.setTextFill(Color.BLACK);
            this.lPersonTitleR.setTextAlignment(TextAlignment.LEFT);
            this.lPersonTitleR.setAlignment(Pos.CENTER_LEFT);
        
            this.lPersonTitle.setText(this.userTitle.toUpperCase());
            this.lPersonTitle.setMinWidth(LABEL_WIDTH);
            this.lPersonTitle.setFont(TITLE_FONT_MEDIUM);
            this.lPersonTitle.setTextFill(Color.BLACK);
            this.lPersonTitle.setTextAlignment(TextAlignment.LEFT);
            this.lPersonTitle.setAlignment(Pos.CENTER_LEFT);
        
            this.lPersonScoreR.setText("YOUR SCORE: ");
            this.lPersonScoreR.setMinWidth(LABEL_WIDTH);
            this.lPersonScoreR.setFont(TITLE_FONT_MEDIUM);
            this.lPersonScoreR.setTextFill(Color.BLACK);
            this.lPersonScoreR.setTextAlignment(TextAlignment.LEFT);
            this.lPersonScoreR.setAlignment(Pos.CENTER_LEFT);
        
            this.lPersonScore.setText(String.valueOf(this.userScore));
            this.lPersonScore.setMinWidth(LABEL_WIDTH);
            this.lPersonScore.setFont(TITLE_FONT_MEDIUM);
            this.lPersonScore.setTextFill(Color.BLACK);
            this.lPersonScore.setTextAlignment(TextAlignment.LEFT);
            this.lPersonScore.setAlignment(Pos.CENTER_LEFT);
        
        }else{
            this.lCongratulation.setText("SORRY, " + UserInfo_Iface.USER_INFO.getFirstName().toUpperCase() + " "
                                                        + UserInfo_Iface.USER_INFO.getLastName().toUpperCase()+"\nYOU DID NOT PASS - TRY AGAIN!");
        }
        
       this.lCongratulation.setFont(TITLE_FONT_LARGE);
       this.lCongratulation.setTextFill(Color.BLACK);
       this.lCongratulation.setTextAlignment(TextAlignment.CENTER);
       this.lCongratulation.setAlignment(Pos.CENTER);    
       
       this.lInfo.setText("* Feedback on your performance will send you by email.\n  The report will list the objectives for which you answered a question incorrectly.\n\n");
       this.lInfo.setFont(TITLE_FONT_SMALL);
       this.lInfo.setTextFill(Color.BLACK);
       this.lInfo.setTextAlignment(TextAlignment.LEFT);
       this.lInfo.setAlignment(Pos.CENTER);    
    }//setStyleForm
       
    
    public BorderPane getMainPane(){
        return this.mainPane;
    }
    
}
