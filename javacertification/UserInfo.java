/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package javacertification;


public class UserInfo {
    
    private String firstName;
    private String lastName;
    private String userID;
    int count;
    
    public UserInfo(String firstName, String lastName, String id, int count){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = id;
        this.count = count;
    }
    
    public UserInfo(){
        this.firstName = "";
        this.lastName = "";
        this.userID = "";
        this.count = 0;
    }
    
    public void setFirstName(String value){
        this.firstName = value;
    }
    
    public void setLastName(String value){
        this.lastName = value;
    }
    
    public void setUserID(String value){
        this.userID = value;
    }
    
    public void setCount(int count){
        this.count = count;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String getUserID(){
        return this.userID;
    }
    
    public int getCount(){
        return this.count;
    }
    
}
