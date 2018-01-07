/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package javacertification;

import javafx.scene.layout.BorderPane;


public interface Application_Iface {
    
    double SCREEN_WIDTH = 840;
    double SCREEN_HEIGHT = 740;
    
    BorderPane SUB_ROOT = new BorderPane();
    
    String MAIN_SCREEN_COLOR = "-fx-background-color: #9fdfbf";
}
