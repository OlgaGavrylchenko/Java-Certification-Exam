/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package userinterface;

import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;


public class PrevQuestionUI implements UserInterface_Iface{
    
    private ListView<String> mainList;
       
    public PrevQuestionUI(){
        
        this.mainList = new ListView<>();
        this.mainList.setMaxSize(SMALLBOX_WIDTH-20, SMALLBOX_HEIGHT-200);
        this.mainList.setMinSize(SMALLBOX_WIDTH-20, SMALLBOX_HEIGHT-200);
        this.mainList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }
    
    public ListView<String> getMainListView(){
        return this.mainList;
    }
    
}
