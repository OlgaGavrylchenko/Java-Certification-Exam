/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package userinterface;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;


public interface UserInterface_Iface {
    
    //size for MainAppUI
    double MAIN_WIDTH = 760;
    double MAIN_HEIGHT = 700;
    double MAIN_SMALL_HEIGHT = 100;
    double MAIN_MEDIUM_HEIGHT = 150;
    double MAIN_LARGE_HEIGHT = 400;
    
    //size for PrevQuestionUI
    double SMALLBOX_WIDTH = 200;
    double SMALLBOX_HEIGHT = 700;
        
    //size for NewQuestionUI
    double LARGEBOX_WIDTH = 660;
    double LARGEBOX_HEIGHT = 550;
    double LARGEBOX_HEIGHT_QUEST = 300;
    double LARGEBOX_HEIGHT_ANS = 250;
    double TOP_HEIGHT = 80;
    
    double IMAGE_WIDTH = 500.0;
    double IMAGE_HEIGHT = 300.0;
    
    //button size
    double BUTTON_WIDTH = 150.0;
    double BUTTON_HEIGHT = 40.0;
    double LABEL_WIDTH = 300;
    
    //textfield size
    double TEXTFIELD_WIDTH = 200.0;
    double TEXTFIELD_HEIGHT = 40.0;
   
    
    //FONT
    public Font MAIN_FONT_SMALL = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 16);
    public Font MAIN_FONT_MEDIUM = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 18);
    public Font CHECKBOX_FONT_MEDIUM = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 16);
    public Font TITLE_FONT_SMALL = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20);
    public Font TITLE_FONT_MEDIUM = Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 24);
    public Font TIMER_FONT_MEDIUM = Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 32);
    public Font TITLE_FONT_LARGE = Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 36);
    public Font TITLE_FONT_EXLARGE = Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 48);
    
    String MAIN_COLOR = "-fx-background-color: #cce6ff";
    String SECOND_COLOR = "-fx-background-color: #ffffff";
    String THIRD_COLOR = "-fx-background-color: #ffffff";
    
}
