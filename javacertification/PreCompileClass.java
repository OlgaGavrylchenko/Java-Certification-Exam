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
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class PreCompileClass implements QEasy_Iface, QMedium_Iface, QHard_Iface, QAdvance_Iface{
    
    Connection connection = null;
    
    public PreCompileClass(Connection connection){
        this.connection = connection;
    }//PreCompileClass
    
    public void insertObject() throws FileNotFoundException{
        
        PreparedStatement p1 = null;
        
        try{ 
            p1.executeUpdate();  
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        } 
    }//insertObject
    
    
    public Image selectObject(){
        String selectSQL = "SELECT * FROM question_easy WHERE id=?";
        Image image = null;
        try {
            PreparedStatement pstmt = this.connection.prepareStatement(selectSQL);
            
            pstmt.setInt(1, 9);
            
            ResultSet rs = pstmt.executeQuery();
            
            Blob blob;
            byte[] arr;
            
           if(rs.next()){
               
               blob = rs.getBlob("question");
               arr = blob.getBytes(1L, (int)blob.length());
               image = new Image(new ByteArrayInputStream(arr));
           }
            
        }catch (SQLException ex) {
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        } 
        return image;
    }//selectObject
    
    public void initQEasy() throws FileNotFoundException{
    
       PreparedStatement p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25;
       
       try{
        String query1 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input1 = new FileInputStream(new File(QEasy_Iface.QuestionEasy1));
        p1 = this.connection.prepareStatement(query1);
        p1.setBinaryStream(1, input1);
        p1.setString(2, QEasy_Iface.AnswerEasy1_1);
        p1.setString(3, QEasy_Iface.AnswerEasy1_2);
        p1.setString(4, QEasy_Iface.AnswerEasy1_3);
        p1.setString(5, QEasy_Iface.AnswerEasy1_4);
        p1.setString(6, QEasy_Iface.AnswerEasy1_5);
        p1.setString(7, QEasy_Iface.CorrectEasy1);
        p1.executeUpdate();
        
        String query2 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input2 = new FileInputStream(new File(QEasy_Iface.QuestionEasy2));
        p2 = this.connection.prepareStatement(query2);
        p2.setBinaryStream(1, input2);
        p2.setString(2, QEasy_Iface.AnswerEasy2_1);
        p2.setString(3, QEasy_Iface.AnswerEasy2_2);
        p2.setString(4, QEasy_Iface.AnswerEasy2_3);
        p2.setString(5, QEasy_Iface.AnswerEasy2_4);
        p2.setString(6, QEasy_Iface.AnswerEasy2_5);
        p2.setString(7, QEasy_Iface.CorrectEasy2);
        p2.executeUpdate();
        
        String query3 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input3 = new FileInputStream(new File(QEasy_Iface.QuestionEasy3));
        p3 = this.connection.prepareStatement(query3);
        p3.setBinaryStream(1, input3);
        p3.setString(2, QEasy_Iface.AnswerEasy3_1);
        p3.setString(3, QEasy_Iface.AnswerEasy3_2);
        p3.setString(4, QEasy_Iface.AnswerEasy3_3);
        p3.setString(5, QEasy_Iface.AnswerEasy3_4);
        p3.setString(6, QEasy_Iface.AnswerEasy3_5);
        p3.setString(7, QEasy_Iface.CorrectEasy3);
        p3.executeUpdate();
        
        String query4 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input4 = new FileInputStream(new File(QEasy_Iface.QuestionEasy4));
        p4 = this.connection.prepareStatement(query4);
        p4.setBinaryStream(1, input4);
        p4.setString(2, QEasy_Iface.AnswerEasy4_1);
        p4.setString(3, QEasy_Iface.AnswerEasy4_2);
        p4.setString(4, QEasy_Iface.AnswerEasy4_3);
        p4.setString(5, QEasy_Iface.AnswerEasy4_4);
        p4.setString(6, QEasy_Iface.AnswerEasy4_5);
        p4.setString(7, QEasy_Iface.CorrectEasy4);
        p4.executeUpdate();
        
        String query5 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input5 = new FileInputStream(new File(QEasy_Iface.QuestionEasy5));
        p5 = this.connection.prepareStatement(query5);
        p5.setBinaryStream(1, input5);
        p5.setString(2, QEasy_Iface.AnswerEasy5_1);
        p5.setString(3, QEasy_Iface.AnswerEasy5_2);
        p5.setString(4, QEasy_Iface.AnswerEasy5_3);
        p5.setString(5, QEasy_Iface.AnswerEasy5_4);
        p5.setString(6, QEasy_Iface.AnswerEasy5_5);
        p5.setString(7, QEasy_Iface.CorrectEasy5);
        p5.executeUpdate();
        
        String query6 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input6 = new FileInputStream(new File(QEasy_Iface.QuestionEasy6));
        p6 = this.connection.prepareStatement(query6);
        p6.setBinaryStream(1, input6);
        p6.setString(2, QEasy_Iface.AnswerEasy6_1);
        p6.setString(3, QEasy_Iface.AnswerEasy6_2);
        p6.setString(4, QEasy_Iface.AnswerEasy6_3);
        p6.setString(5, QEasy_Iface.AnswerEasy6_4);
        p6.setString(6, QEasy_Iface.AnswerEasy6_5);
        p6.setString(7, QEasy_Iface.CorrectEasy6);
        p6.executeUpdate();
        
        String query7 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input7 = new FileInputStream(new File(QEasy_Iface.QuestionEasy7));
        p7 = this.connection.prepareStatement(query7);
        p7.setBinaryStream(1, input7);
        p7.setString(2, QEasy_Iface.AnswerEasy7_1);
        p7.setString(3, QEasy_Iface.AnswerEasy7_2);
        p7.setString(4, QEasy_Iface.AnswerEasy7_3);
        p7.setString(5, QEasy_Iface.AnswerEasy7_4);
        p7.setString(6, QEasy_Iface.AnswerEasy7_5);
        p7.setString(7, QEasy_Iface.CorrectEasy7);
        p7.executeUpdate();
        
        String query8 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input8 = new FileInputStream(new File(QEasy_Iface.QuestionEasy8));
        p8 = this.connection.prepareStatement(query8);
        p8.setBinaryStream(1, input8);
        p8.setString(2, QEasy_Iface.AnswerEasy8_1);
        p8.setString(3, QEasy_Iface.AnswerEasy8_2);
        p8.setString(4, QEasy_Iface.AnswerEasy8_3);
        p8.setString(5, QEasy_Iface.AnswerEasy8_4);
        p8.setString(6, QEasy_Iface.AnswerEasy8_5);
        p8.setString(7, QEasy_Iface.CorrectEasy8);
        p8.executeUpdate();
        
        String query9 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input9 = new FileInputStream(new File(QEasy_Iface.QuestionEasy9));
        p9 = this.connection.prepareStatement(query9);
        p9.setBinaryStream(1, input9);
        p9.setString(2, QEasy_Iface.AnswerEasy9_1);
        p9.setString(3, QEasy_Iface.AnswerEasy9_2);
        p9.setString(4, QEasy_Iface.AnswerEasy9_3);
        p9.setString(5, QEasy_Iface.AnswerEasy9_4);
        p9.setString(6, QEasy_Iface.AnswerEasy9_5);
        p9.setString(7, QEasy_Iface.CorrectEasy9);
        p9.executeUpdate();
        
        String query10 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input10 = new FileInputStream(new File(QEasy_Iface.QuestionEasy10));
        p10 = this.connection.prepareStatement(query10);
        p10.setBinaryStream(1, input10);
        p10.setString(2, QEasy_Iface.AnswerEasy10_1);
        p10.setString(3, QEasy_Iface.AnswerEasy10_2);
        p10.setString(4, QEasy_Iface.AnswerEasy10_3);
        p10.setString(5, QEasy_Iface.AnswerEasy10_4);
        p10.setString(6, QEasy_Iface.AnswerEasy10_5);
        p10.setString(7, QEasy_Iface.CorrectEasy10);
        p10.executeUpdate();
        
        String query11 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input11 = new FileInputStream(new File(QEasy_Iface.QuestionEasy11));
        p11 = this.connection.prepareStatement(query11);
        p11.setBinaryStream(1, input11);
        p11.setString(2, QEasy_Iface.AnswerEasy11_1);
        p11.setString(3, QEasy_Iface.AnswerEasy11_2);
        p11.setString(4, QEasy_Iface.AnswerEasy11_3);
        p11.setString(5, QEasy_Iface.AnswerEasy11_4);
        p11.setString(6, QEasy_Iface.AnswerEasy11_5);
        p11.setString(7, QEasy_Iface.CorrectEasy11);
        p11.executeUpdate();
        
        String query12 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input12 = new FileInputStream(new File(QEasy_Iface.QuestionEasy12));
        p12 = this.connection.prepareStatement(query12);
        p12.setBinaryStream(1, input12);
        p12.setString(2, QEasy_Iface.AnswerEasy12_1);
        p12.setString(3, QEasy_Iface.AnswerEasy12_2);
        p12.setString(4, QEasy_Iface.AnswerEasy12_3);
        p12.setString(5, QEasy_Iface.AnswerEasy12_4);
        p12.setString(6, QEasy_Iface.AnswerEasy12_5);
        p12.setString(7, QEasy_Iface.CorrectEasy12);
        p12.executeUpdate();
        
        String query13 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input13 = new FileInputStream(new File(QEasy_Iface.QuestionEasy13));
        p13 = this.connection.prepareStatement(query13);
        p13.setBinaryStream(1, input13);
        p13.setString(2, QEasy_Iface.AnswerEasy13_1);
        p13.setString(3, QEasy_Iface.AnswerEasy13_2);
        p13.setString(4, QEasy_Iface.AnswerEasy13_3);
        p13.setString(5, QEasy_Iface.AnswerEasy13_4);
        p13.setString(6, QEasy_Iface.AnswerEasy13_5);
        p13.setString(7, QEasy_Iface.CorrectEasy13);
        p13.executeUpdate();
        
        String query14 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input14 = new FileInputStream(new File(QEasy_Iface.QuestionEasy14));
        p14 = this.connection.prepareStatement(query14);
        p14.setBinaryStream(1, input14);
        p14.setString(2, QEasy_Iface.AnswerEasy14_1);
        p14.setString(3, QEasy_Iface.AnswerEasy14_2);
        p14.setString(4, QEasy_Iface.AnswerEasy14_3);
        p14.setString(5, QEasy_Iface.AnswerEasy14_4);
        p14.setString(6, QEasy_Iface.AnswerEasy14_5);
        p14.setString(7, QEasy_Iface.CorrectEasy14);
        p14.executeUpdate();
        
        String query15 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input15 = new FileInputStream(new File(QEasy_Iface.QuestionEasy15));
        p15 = this.connection.prepareStatement(query15);
        p15.setBinaryStream(1, input15);
        p15.setString(2, QEasy_Iface.AnswerEasy15_1);
        p15.setString(3, QEasy_Iface.AnswerEasy15_2);
        p15.setString(4, QEasy_Iface.AnswerEasy15_3);
        p15.setString(5, QEasy_Iface.AnswerEasy15_4);
        p15.setString(6, QEasy_Iface.AnswerEasy15_5);
        p15.setString(7, QEasy_Iface.CorrectEasy15);
        p15.executeUpdate();
        
        String query16 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input16 = new FileInputStream(new File(QEasy_Iface.QuestionEasy16));
        p16 = this.connection.prepareStatement(query16);
        p16.setBinaryStream(1, input16);
        p16.setString(2, QEasy_Iface.AnswerEasy16_1);
        p16.setString(3, QEasy_Iface.AnswerEasy16_2);
        p16.setString(4, QEasy_Iface.AnswerEasy16_3);
        p16.setString(5, QEasy_Iface.AnswerEasy16_4);
        p16.setString(6, QEasy_Iface.AnswerEasy16_5);
        p16.setString(7, QEasy_Iface.CorrectEasy16);
        p16.executeUpdate();
        
        String query17 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input17 = new FileInputStream(new File(QEasy_Iface.QuestionEasy17));
        p17 = this.connection.prepareStatement(query17);
        p17.setBinaryStream(1, input17);
        p17.setString(2, QEasy_Iface.AnswerEasy17_1);
        p17.setString(3, QEasy_Iface.AnswerEasy17_2);
        p17.setString(4, QEasy_Iface.AnswerEasy17_3);
        p17.setString(5, QEasy_Iface.AnswerEasy17_4);
        p17.setString(6, QEasy_Iface.AnswerEasy17_5);
        p17.setString(7, QEasy_Iface.CorrectEasy17);
        p17.executeUpdate();
        
        String query18 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input18 = new FileInputStream(new File(QEasy_Iface.QuestionEasy18));
        p18 = this.connection.prepareStatement(query18);
        p18.setBinaryStream(1, input18);
        p18.setString(2, QEasy_Iface.AnswerEasy18_1);
        p18.setString(3, QEasy_Iface.AnswerEasy18_2);
        p18.setString(4, QEasy_Iface.AnswerEasy18_3);
        p18.setString(5, QEasy_Iface.AnswerEasy18_4);
        p18.setString(6, QEasy_Iface.AnswerEasy18_5);
        p18.setString(7, QEasy_Iface.CorrectEasy18);
        p18.executeUpdate();
        
        String query19 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input19 = new FileInputStream(new File(QEasy_Iface.QuestionEasy19));
        p19 = this.connection.prepareStatement(query19);
        p19.setBinaryStream(1, input19);
        p19.setString(2, QEasy_Iface.AnswerEasy19_1);
        p19.setString(3, QEasy_Iface.AnswerEasy19_2);
        p19.setString(4, QEasy_Iface.AnswerEasy19_3);
        p19.setString(5, QEasy_Iface.AnswerEasy19_4);
        p19.setString(6, QEasy_Iface.AnswerEasy19_5);
        p19.setString(7, QEasy_Iface.CorrectEasy19);
        p19.executeUpdate();
        
        String query20 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input20 = new FileInputStream(new File(QEasy_Iface.QuestionEasy20));
        p20 = this.connection.prepareStatement(query20);
        p20.setBinaryStream(1, input20);
        p20.setString(2, QEasy_Iface.AnswerEasy20_1);
        p20.setString(3, QEasy_Iface.AnswerEasy20_2);
        p20.setString(4, QEasy_Iface.AnswerEasy20_3);
        p20.setString(5, QEasy_Iface.AnswerEasy20_4);
        p20.setString(6, QEasy_Iface.AnswerEasy20_5);
        p20.setString(7, QEasy_Iface.CorrectEasy20);
        p20.executeUpdate();
        
        String query21 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input21 = new FileInputStream(new File(QEasy_Iface.QuestionEasy21));
        p21 = this.connection.prepareStatement(query21);
        p21.setBinaryStream(1, input21);
        p21.setString(2, QEasy_Iface.AnswerEasy21_1);
        p21.setString(3, QEasy_Iface.AnswerEasy21_2);
        p21.setString(4, QEasy_Iface.AnswerEasy21_3);
        p21.setString(5, QEasy_Iface.AnswerEasy21_4);
        p21.setString(6, QEasy_Iface.AnswerEasy21_5);
        p21.setString(7, QEasy_Iface.CorrectEasy21);
        p21.executeUpdate();
        
        String query22 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input22 = new FileInputStream(new File(QEasy_Iface.QuestionEasy22));
        p22 = this.connection.prepareStatement(query22);
        p22.setBinaryStream(1, input22);
        p22.setString(2, QEasy_Iface.AnswerEasy22_1);
        p22.setString(3, QEasy_Iface.AnswerEasy22_2);
        p22.setString(4, QEasy_Iface.AnswerEasy22_3);
        p22.setString(5, QEasy_Iface.AnswerEasy22_4);
        p22.setString(6, QEasy_Iface.AnswerEasy22_5);
        p22.setString(7, QEasy_Iface.CorrectEasy22);
        p22.executeUpdate();
        
        String query23 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input23 = new FileInputStream(new File(QEasy_Iface.QuestionEasy23));
        p23 = this.connection.prepareStatement(query23);
        p23.setBinaryStream(1, input23);
        p23.setString(2, QEasy_Iface.AnswerEasy23_1);
        p23.setString(3, QEasy_Iface.AnswerEasy23_2);
        p23.setString(4, QEasy_Iface.AnswerEasy23_3);
        p23.setString(5, QEasy_Iface.AnswerEasy23_4);
        p23.setString(6, QEasy_Iface.AnswerEasy23_5);
        p23.setString(7, QEasy_Iface.CorrectEasy23);
        p23.executeUpdate();
        
        String query24 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input24 = new FileInputStream(new File(QEasy_Iface.QuestionEasy24));
        p24 = this.connection.prepareStatement(query24);
        p24.setBinaryStream(1, input24);
        p24.setString(2, QEasy_Iface.AnswerEasy24_1);
        p24.setString(3, QEasy_Iface.AnswerEasy24_2);
        p24.setString(4, QEasy_Iface.AnswerEasy24_3);
        p24.setString(5, QEasy_Iface.AnswerEasy24_4);
        p24.setString(6, QEasy_Iface.AnswerEasy24_5);
        p24.setString(7, QEasy_Iface.CorrectEasy24);
        p24.executeUpdate();
        
        String query25 = "INSERT INTO question_easy (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input25 = new FileInputStream(new File(QEasy_Iface.QuestionEasy25));
        p25 = this.connection.prepareStatement(query25);
        p25.setBinaryStream(1, input25);
        p25.setString(2, QEasy_Iface.AnswerEasy25_1);
        p25.setString(3, QEasy_Iface.AnswerEasy25_2);
        p25.setString(4, QEasy_Iface.AnswerEasy25_3);
        p25.setString(5, QEasy_Iface.AnswerEasy25_4);
        p25.setString(6, QEasy_Iface.AnswerEasy25_5);
        p25.setString(7, QEasy_Iface.CorrectEasy25);
        p25.executeUpdate();
        
        p1.close();
        p2.close();
        p3.close();
        p4.close();
        p5.close();
        p6.close();
        p7.close();
        p8.close();
        p9.close();
        p10.close();
        p11.close();
        p12.close();
        p13.close();
        p14.close();
        p15.close();
        p16.close();
        p17.close();
        p18.close();
        p19.close();
        p20.close();
        p21.close();
        p22.close();
        p23.close();
        p24.close();
        p25.close();
        
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//initQEasy
    
    public void initQMedium()throws FileNotFoundException{
    
       PreparedStatement p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25;
       
       try{
        
       String query1 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input1 = new FileInputStream(new File(QMedium_Iface.QuestionMedium1));
        p1 = this.connection.prepareStatement(query1);
        p1.setBinaryStream(1, input1);
        p1.setString(2, QMedium_Iface.AnswerMedium1_1);
        p1.setString(3, QMedium_Iface.AnswerMedium1_2);
        p1.setString(4, QMedium_Iface.AnswerMedium1_3);
        p1.setString(5, QMedium_Iface.AnswerMedium1_4);
        p1.setString(6, QMedium_Iface.AnswerMedium1_5);
        p1.setString(7, QMedium_Iface.CorrectMedium1);
        p1.executeUpdate();
        
        String query2 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input2 = new FileInputStream(new File(QMedium_Iface.QuestionMedium2));
        p2 = this.connection.prepareStatement(query2);
        p2.setBinaryStream(1, input2);
        p2.setString(2, QMedium_Iface.AnswerMedium2_1);
        p2.setString(3, QMedium_Iface.AnswerMedium2_2);
        p2.setString(4, QMedium_Iface.AnswerMedium2_3);
        p2.setString(5, QMedium_Iface.AnswerMedium2_4);
        p2.setString(6, QMedium_Iface.AnswerMedium2_5);
        p2.setString(7, QMedium_Iface.CorrectMedium2);
        p2.executeUpdate();
        
        String query3 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input3 = new FileInputStream(new File(QMedium_Iface.QuestionMedium3));
        p3 = this.connection.prepareStatement(query3);
        p3.setBinaryStream(1, input3);
        p3.setString(2, QMedium_Iface.AnswerMedium3_1);
        p3.setString(3, QMedium_Iface.AnswerMedium3_2);
        p3.setString(4, QMedium_Iface.AnswerMedium3_3);
        p3.setString(5, QMedium_Iface.AnswerMedium3_4);
        p3.setString(6, QMedium_Iface.AnswerMedium3_5);
        p3.setString(7, QMedium_Iface.CorrectMedium3);
        p3.executeUpdate();
        
        String query4 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input4 = new FileInputStream(new File(QMedium_Iface.QuestionMedium4));
        p4 = this.connection.prepareStatement(query4);
        p4.setBinaryStream(1, input4);
        p4.setString(2, QMedium_Iface.AnswerMedium4_1);
        p4.setString(3, QMedium_Iface.AnswerMedium4_2);
        p4.setString(4, QMedium_Iface.AnswerMedium4_3);
        p4.setString(5, QMedium_Iface.AnswerMedium4_4);
        p4.setString(6, QMedium_Iface.AnswerMedium4_5);
        p4.setString(7, QMedium_Iface.CorrectMedium4);
        p4.executeUpdate();
        
        String query5 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input5 = new FileInputStream(new File(QMedium_Iface.QuestionMedium5));
        p5 = this.connection.prepareStatement(query5);
        p5.setBinaryStream(1, input5);
        p5.setString(2, QMedium_Iface.AnswerMedium5_1);
        p5.setString(3, QMedium_Iface.AnswerMedium5_2);
        p5.setString(4, QMedium_Iface.AnswerMedium5_3);
        p5.setString(5, QMedium_Iface.AnswerMedium5_4);
        p5.setString(6, QMedium_Iface.AnswerMedium5_5);
        p5.setString(7, QMedium_Iface.CorrectMedium5);
        p5.executeUpdate();
        
        String query6 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input6 = new FileInputStream(new File(QMedium_Iface.QuestionMedium6));
        p6 = this.connection.prepareStatement(query6);
        p6.setBinaryStream(1, input6);
        p6.setString(2, QMedium_Iface.AnswerMedium6_1);
        p6.setString(3, QMedium_Iface.AnswerMedium6_2);
        p6.setString(4, QMedium_Iface.AnswerMedium6_3);
        p6.setString(5, QMedium_Iface.AnswerMedium6_4);
        p6.setString(6, QMedium_Iface.AnswerMedium6_5);
        p6.setString(7, QMedium_Iface.CorrectMedium6);
        p6.executeUpdate();
        
        String query7 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input7 = new FileInputStream(new File(QMedium_Iface.QuestionMedium7));
        p7 = this.connection.prepareStatement(query7);
        p7.setBinaryStream(1, input7);
        p7.setString(2, QMedium_Iface.AnswerMedium7_1);
        p7.setString(3, QMedium_Iface.AnswerMedium7_2);
        p7.setString(4, QMedium_Iface.AnswerMedium7_3);
        p7.setString(5, QMedium_Iface.AnswerMedium7_4);
        p7.setString(6, QMedium_Iface.AnswerMedium7_5);
        p7.setString(7, QMedium_Iface.CorrectMedium7);
        p7.executeUpdate();
        
        String query8 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input8 = new FileInputStream(new File(QMedium_Iface.QuestionMedium8));
        p8 = this.connection.prepareStatement(query8);
        p8.setBinaryStream(1, input8);
        p8.setString(2, QMedium_Iface.AnswerMedium8_1);
        p8.setString(3, QMedium_Iface.AnswerMedium8_2);
        p8.setString(4, QMedium_Iface.AnswerMedium8_3);
        p8.setString(5, QMedium_Iface.AnswerMedium8_4);
        p8.setString(6, QMedium_Iface.AnswerMedium8_5);
        p8.setString(7, QMedium_Iface.CorrectMedium8);
        p8.executeUpdate();
        
        String query9 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input9 = new FileInputStream(new File(QMedium_Iface.QuestionMedium9));
        p9 = this.connection.prepareStatement(query9);
        p9.setBinaryStream(1, input9);
        p9.setString(2, QMedium_Iface.AnswerMedium9_1);
        p9.setString(3, QMedium_Iface.AnswerMedium9_2);
        p9.setString(4, QMedium_Iface.AnswerMedium9_3);
        p9.setString(5, QMedium_Iface.AnswerMedium9_4);
        p9.setString(6, QMedium_Iface.AnswerMedium9_5);
        p9.setString(7, QMedium_Iface.CorrectMedium9);
        p9.executeUpdate();
        
        String query10 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input10 = new FileInputStream(new File(QMedium_Iface.QuestionMedium10));
        p10 = this.connection.prepareStatement(query10);
        p10.setBinaryStream(1, input10);
        p10.setString(2, QMedium_Iface.AnswerMedium10_1);
        p10.setString(3, QMedium_Iface.AnswerMedium10_2);
        p10.setString(4, QMedium_Iface.AnswerMedium10_3);
        p10.setString(5, QMedium_Iface.AnswerMedium10_4);
        p10.setString(6, QMedium_Iface.AnswerMedium10_5);
        p10.setString(7, QMedium_Iface.CorrectMedium10);
        p10.executeUpdate();
        
        String query11 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input11 = new FileInputStream(new File(QMedium_Iface.QuestionMedium11));
        p11 = this.connection.prepareStatement(query11);
        p11.setBinaryStream(1, input11);
        p11.setString(2, QMedium_Iface.AnswerMedium11_1);
        p11.setString(3, QMedium_Iface.AnswerMedium11_2);
        p11.setString(4, QMedium_Iface.AnswerMedium11_3);
        p11.setString(5, QMedium_Iface.AnswerMedium11_4);
        p11.setString(6, QMedium_Iface.AnswerMedium11_5);
        p11.setString(7, QMedium_Iface.CorrectMedium11);
        p11.executeUpdate();
        
        String query12 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input12 = new FileInputStream(new File(QMedium_Iface.QuestionMedium12));
        p12 = this.connection.prepareStatement(query12);
        p12.setBinaryStream(1, input12);
        p12.setString(2, QMedium_Iface.AnswerMedium12_1);
        p12.setString(3, QMedium_Iface.AnswerMedium12_2);
        p12.setString(4, QMedium_Iface.AnswerMedium12_3);
        p12.setString(5, QMedium_Iface.AnswerMedium12_4);
        p12.setString(6, QMedium_Iface.AnswerMedium12_5);
        p12.setString(7, QMedium_Iface.CorrectMedium12);
        p12.executeUpdate();
        
        String query13 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input13 = new FileInputStream(new File(QMedium_Iface.QuestionMedium13));
        p13 = this.connection.prepareStatement(query13);
        p13.setBinaryStream(1, input13);
        p13.setString(2, QMedium_Iface.AnswerMedium13_1);
        p13.setString(3, QMedium_Iface.AnswerMedium13_2);
        p13.setString(4, QMedium_Iface.AnswerMedium13_3);
        p13.setString(5, QMedium_Iface.AnswerMedium13_4);
        p13.setString(6, QMedium_Iface.AnswerMedium13_5);
        p13.setString(7, QMedium_Iface.CorrectMedium13);
        p13.executeUpdate();
        
        String query14 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input14 = new FileInputStream(new File(QMedium_Iface.QuestionMedium14));
        p14 = this.connection.prepareStatement(query14);
        p14.setBinaryStream(1, input14);
        p14.setString(2, QMedium_Iface.AnswerMedium14_1);
        p14.setString(3, QMedium_Iface.AnswerMedium14_2);
        p14.setString(4, QMedium_Iface.AnswerMedium14_3);
        p14.setString(5, QMedium_Iface.AnswerMedium14_4);
        p14.setString(6, QMedium_Iface.AnswerMedium14_5);
        p14.setString(7, QMedium_Iface.CorrectMedium14);
        p14.executeUpdate();
        
        String query15 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input15 = new FileInputStream(new File(QMedium_Iface.QuestionMedium15));
        p15 = this.connection.prepareStatement(query15);
        p15.setBinaryStream(1, input15);
        p15.setString(2, QMedium_Iface.AnswerMedium15_1);
        p15.setString(3, QMedium_Iface.AnswerMedium15_2);
        p15.setString(4, QMedium_Iface.AnswerMedium15_3);
        p15.setString(5, QMedium_Iface.AnswerMedium15_4);
        p15.setString(6, QMedium_Iface.AnswerMedium15_5);
        p15.setString(7, QMedium_Iface.CorrectMedium15);
        p15.executeUpdate();
        
        String query16 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input16 = new FileInputStream(new File(QMedium_Iface.QuestionMedium16));
        p16 = this.connection.prepareStatement(query16);
        p16.setBinaryStream(1, input16);
        p16.setString(2, QMedium_Iface.AnswerMedium16_1);
        p16.setString(3, QMedium_Iface.AnswerMedium16_2);
        p16.setString(4, QMedium_Iface.AnswerMedium16_3);
        p16.setString(5, QMedium_Iface.AnswerMedium16_4);
        p16.setString(6, QMedium_Iface.AnswerMedium16_5);
        p16.setString(7, QMedium_Iface.CorrectMedium16);
        p16.executeUpdate();
        
        String query17 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input17 = new FileInputStream(new File(QMedium_Iface.QuestionMedium17));
        p17 = this.connection.prepareStatement(query17);
        p17.setBinaryStream(1, input17);
        p17.setString(2, QMedium_Iface.AnswerMedium17_1);
        p17.setString(3, QMedium_Iface.AnswerMedium17_2);
        p17.setString(4, QMedium_Iface.AnswerMedium17_3);
        p17.setString(5, QMedium_Iface.AnswerMedium17_4);
        p17.setString(6, QMedium_Iface.AnswerMedium17_5);
        p17.setString(7, QMedium_Iface.CorrectMedium17);
        p17.executeUpdate();
        
        String query18 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input18 = new FileInputStream(new File(QMedium_Iface.QuestionMedium18));
        p18 = this.connection.prepareStatement(query18);
        p18.setBinaryStream(1, input18);
        p18.setString(2, QMedium_Iface.AnswerMedium18_1);
        p18.setString(3, QMedium_Iface.AnswerMedium18_2);
        p18.setString(4, QMedium_Iface.AnswerMedium18_3);
        p18.setString(5, QMedium_Iface.AnswerMedium18_4);
        p18.setString(6, QMedium_Iface.AnswerMedium18_5);
        p18.setString(7, QMedium_Iface.CorrectMedium18);
        p18.executeUpdate();
        
        String query19 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input19 = new FileInputStream(new File(QMedium_Iface.QuestionMedium19));
        p19 = this.connection.prepareStatement(query19);
        p19.setBinaryStream(1, input19);
        p19.setString(2, QMedium_Iface.AnswerMedium19_1);
        p19.setString(3, QMedium_Iface.AnswerMedium19_2);
        p19.setString(4, QMedium_Iface.AnswerMedium19_3);
        p19.setString(5, QMedium_Iface.AnswerMedium19_4);
        p19.setString(6, QMedium_Iface.AnswerMedium19_5);
        p19.setString(7, QMedium_Iface.CorrectMedium19);
        p19.executeUpdate();
        
        String query20 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input20 = new FileInputStream(new File(QMedium_Iface.QuestionMedium20));
        p20 = this.connection.prepareStatement(query20);
        p20.setBinaryStream(1, input20);
        p20.setString(2, QMedium_Iface.AnswerMedium20_1);
        p20.setString(3, QMedium_Iface.AnswerMedium20_2);
        p20.setString(4, QMedium_Iface.AnswerMedium20_3);
        p20.setString(5, QMedium_Iface.AnswerMedium20_4);
        p20.setString(6, QMedium_Iface.AnswerMedium20_5);
        p20.setString(7, QMedium_Iface.CorrectMedium20);
        p20.executeUpdate();
        
        String query21 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input21 = new FileInputStream(new File(QMedium_Iface.QuestionMedium21));
        p21 = this.connection.prepareStatement(query21);
        p21.setBinaryStream(1, input21);
        p21.setString(2, QMedium_Iface.AnswerMedium21_1);
        p21.setString(3, QMedium_Iface.AnswerMedium21_2);
        p21.setString(4, QMedium_Iface.AnswerMedium21_3);
        p21.setString(5, QMedium_Iface.AnswerMedium21_4);
        p21.setString(6, QMedium_Iface.AnswerMedium21_5);
        p21.setString(7, QMedium_Iface.CorrectMedium21);
        p21.executeUpdate();
        
        String query22 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input22 = new FileInputStream(new File(QMedium_Iface.QuestionMedium22));
        p22 = this.connection.prepareStatement(query22);
        p22.setBinaryStream(1, input22);
        p22.setString(2, QMedium_Iface.AnswerMedium22_1);
        p22.setString(3, QMedium_Iface.AnswerMedium22_2);
        p22.setString(4, QMedium_Iface.AnswerMedium22_3);
        p22.setString(5, QMedium_Iface.AnswerMedium22_4);
        p22.setString(6, QMedium_Iface.AnswerMedium22_5);
        p22.setString(7, QMedium_Iface.CorrectMedium22);
        p22.executeUpdate();
        
        String query23 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input23 = new FileInputStream(new File(QMedium_Iface.QuestionMedium23));
        p23 = this.connection.prepareStatement(query23);
        p23.setBinaryStream(1, input23);
        p23.setString(2, QMedium_Iface.AnswerMedium23_1);
        p23.setString(3, QMedium_Iface.AnswerMedium23_2);
        p23.setString(4, QMedium_Iface.AnswerMedium23_3);
        p23.setString(5, QMedium_Iface.AnswerMedium23_4);
        p23.setString(6, QMedium_Iface.AnswerMedium23_5);
        p23.setString(7, QMedium_Iface.CorrectMedium23);
        p23.executeUpdate();
        
        String query24 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input24 = new FileInputStream(new File(QMedium_Iface.QuestionMedium24));
        p24 = this.connection.prepareStatement(query24);
        p24.setBinaryStream(1, input24);
        p24.setString(2, QMedium_Iface.AnswerMedium24_1);
        p24.setString(3, QMedium_Iface.AnswerMedium24_2);
        p24.setString(4, QMedium_Iface.AnswerMedium24_3);
        p24.setString(5, QMedium_Iface.AnswerMedium24_4);
        p24.setString(6, QMedium_Iface.AnswerMedium24_5);
        p24.setString(7, QMedium_Iface.CorrectMedium24);
        p24.executeUpdate();
        
        String query25 = "INSERT INTO question_medium (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input25 = new FileInputStream(new File(QMedium_Iface.QuestionMedium25));
        p25 = this.connection.prepareStatement(query25);
        p25.setBinaryStream(1, input25);
        p25.setString(2, QMedium_Iface.AnswerMedium25_1);
        p25.setString(3, QMedium_Iface.AnswerMedium25_2);
        p25.setString(4, QMedium_Iface.AnswerMedium25_3);
        p25.setString(5, QMedium_Iface.AnswerMedium25_4);
        p25.setString(6, QMedium_Iface.AnswerMedium25_5);
        p25.setString(7, QMedium_Iface.CorrectMedium25);
        p25.executeUpdate();
        
        p1.close();
        p2.close();
        p3.close();
        p4.close();
        p5.close();
        p6.close();
        p7.close();
        p8.close();
        p9.close();
        p10.close();
        p11.close();
        p12.close();
        p13.close();
        p14.close();
        p15.close();
        p16.close();
        p17.close();
        p18.close();
        p19.close();
        p20.close();
        p21.close();
        p22.close();
        p23.close();
        p24.close();
        p25.close();
        
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//initQMedium
    
    public void initQHard() throws FileNotFoundException{
    
       PreparedStatement p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25;
       
       try{
        
        String query1 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input1 = new FileInputStream(new File(QHard_Iface.QuestionHard1));
        p1 = this.connection.prepareStatement(query1);
        p1.setBinaryStream(1, input1);
        p1.setString(2, QHard_Iface.AnswerHard1_1);
        p1.setString(3, QHard_Iface.AnswerHard1_2);
        p1.setString(4, QHard_Iface.AnswerHard1_3);
        p1.setString(5, QHard_Iface.AnswerHard1_4);
        p1.setString(6, QHard_Iface.AnswerHard1_5);
        p1.setString(7, QHard_Iface.CorrectHard1);
        p1.executeUpdate();
        
        String query2 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input2 = new FileInputStream(new File(QHard_Iface.QuestionHard2));
        p2 = this.connection.prepareStatement(query2);
        p2.setBinaryStream(1, input2);
        p2.setString(2, QHard_Iface.AnswerHard2_1);
        p2.setString(3, QHard_Iface.AnswerHard2_2);
        p2.setString(4, QHard_Iface.AnswerHard2_3);
        p2.setString(5, QHard_Iface.AnswerHard2_4);
        p2.setString(6, QHard_Iface.AnswerHard2_5);
        p2.setString(7, QHard_Iface.CorrectHard2);
        p2.executeUpdate();
        
        String query3 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input3 = new FileInputStream(new File(QHard_Iface.QuestionHard3));
        p3 = this.connection.prepareStatement(query3);
        p3.setBinaryStream(1, input3);
        p3.setString(2, QHard_Iface.AnswerHard3_1);
        p3.setString(3, QHard_Iface.AnswerHard3_2);
        p3.setString(4, QHard_Iface.AnswerHard3_3);
        p3.setString(5, QHard_Iface.AnswerHard3_4);
        p3.setString(6, QHard_Iface.AnswerHard3_5);
        p3.setString(7, QHard_Iface.CorrectHard3);
        p3.executeUpdate();
        
        String query4 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input4 = new FileInputStream(new File(QHard_Iface.QuestionHard4));
        p4 = this.connection.prepareStatement(query4);
        p4.setBinaryStream(1, input4);
        p4.setString(2, QHard_Iface.AnswerHard4_1);
        p4.setString(3, QHard_Iface.AnswerHard4_2);
        p4.setString(4, QHard_Iface.AnswerHard4_3);
        p4.setString(5, QHard_Iface.AnswerHard4_4);
        p4.setString(6, QHard_Iface.AnswerHard4_5);
        p4.setString(7, QHard_Iface.CorrectHard4);
        p4.executeUpdate();
        
        String query5 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input5 = new FileInputStream(new File(QHard_Iface.QuestionHard5));
        p5 = this.connection.prepareStatement(query5);
        p5.setBinaryStream(1, input5);
        p5.setString(2, QHard_Iface.AnswerHard5_1);
        p5.setString(3, QHard_Iface.AnswerHard5_2);
        p5.setString(4, QHard_Iface.AnswerHard5_3);
        p5.setString(5, QHard_Iface.AnswerHard5_4);
        p5.setString(6, QHard_Iface.AnswerHard5_5);
        p5.setString(7, QHard_Iface.CorrectHard5);
        p5.executeUpdate();
        
        String query6 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input6 = new FileInputStream(new File(QHard_Iface.QuestionHard6));
        p6 = this.connection.prepareStatement(query6);
        p6.setBinaryStream(1, input6);
        p6.setString(2, QHard_Iface.AnswerHard6_1);
        p6.setString(3, QHard_Iface.AnswerHard6_2);
        p6.setString(4, QHard_Iface.AnswerHard6_3);
        p6.setString(5, QHard_Iface.AnswerHard6_4);
        p6.setString(6, QHard_Iface.AnswerHard6_5);
        p6.setString(7, QHard_Iface.CorrectHard6);
        p6.executeUpdate();
        
        String query7 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input7 = new FileInputStream(new File(QHard_Iface.QuestionHard7));
        p7 = this.connection.prepareStatement(query7);
        p7.setBinaryStream(1, input7);
        p7.setString(2, QHard_Iface.AnswerHard7_1);
        p7.setString(3, QHard_Iface.AnswerHard7_2);
        p7.setString(4, QHard_Iface.AnswerHard7_3);
        p7.setString(5, QHard_Iface.AnswerHard7_4);
        p7.setString(6, QHard_Iface.AnswerHard7_5);
        p7.setString(7, QHard_Iface.CorrectHard7);
        p7.executeUpdate();
        
        String query8 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input8 = new FileInputStream(new File(QHard_Iface.QuestionHard8));
        p8 = this.connection.prepareStatement(query8);
        p8.setBinaryStream(1, input8);
        p8.setString(2, QHard_Iface.AnswerHard8_1);
        p8.setString(3, QHard_Iface.AnswerHard8_2);
        p8.setString(4, QHard_Iface.AnswerHard8_3);
        p8.setString(5, QHard_Iface.AnswerHard8_4);
        p8.setString(6, QHard_Iface.AnswerHard8_5);
        p8.setString(7, QHard_Iface.CorrectHard8);
        p8.executeUpdate();
        
        String query9 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input9 = new FileInputStream(new File(QHard_Iface.QuestionHard9));
        p9 = this.connection.prepareStatement(query9);
        p9.setBinaryStream(1, input9);
        p9.setString(2, QHard_Iface.AnswerHard9_1);
        p9.setString(3, QHard_Iface.AnswerHard9_2);
        p9.setString(4, QHard_Iface.AnswerHard9_3);
        p9.setString(5, QHard_Iface.AnswerHard9_4);
        p9.setString(6, QHard_Iface.AnswerHard9_5);
        p9.setString(7, QHard_Iface.CorrectHard9);
        p9.executeUpdate();
        
        String query10 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input10 = new FileInputStream(new File(QHard_Iface.QuestionHard10));
        p10 = this.connection.prepareStatement(query10);
        p10.setBinaryStream(1, input10);
        p10.setString(2, QHard_Iface.AnswerHard10_1);
        p10.setString(3, QHard_Iface.AnswerHard10_2);
        p10.setString(4, QHard_Iface.AnswerHard10_3);
        p10.setString(5, QHard_Iface.AnswerHard10_4);
        p10.setString(6, QHard_Iface.AnswerHard10_5);
        p10.setString(7, QHard_Iface.CorrectHard10);
        p10.executeUpdate();
        
        String query11 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input11 = new FileInputStream(new File(QHard_Iface.QuestionHard11));
        p11 = this.connection.prepareStatement(query11);
        p11.setBinaryStream(1, input11);
        p11.setString(2, QHard_Iface.AnswerHard11_1);
        p11.setString(3, QHard_Iface.AnswerHard11_2);
        p11.setString(4, QHard_Iface.AnswerHard11_3);
        p11.setString(5, QHard_Iface.AnswerHard11_4);
        p11.setString(6, QHard_Iface.AnswerHard11_5);
        p11.setString(7, QHard_Iface.CorrectHard11);
        p11.executeUpdate();
        
        String query12 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input12 = new FileInputStream(new File(QHard_Iface.QuestionHard12));
        p12 = this.connection.prepareStatement(query12);
        p12.setBinaryStream(1, input12);
        p12.setString(2, QHard_Iface.AnswerHard12_1);
        p12.setString(3, QHard_Iface.AnswerHard12_2);
        p12.setString(4, QHard_Iface.AnswerHard12_3);
        p12.setString(5, QHard_Iface.AnswerHard12_4);
        p12.setString(6, QHard_Iface.AnswerHard12_5);
        p12.setString(7, QHard_Iface.CorrectHard12);
        p12.executeUpdate();
        
        String query13 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input13 = new FileInputStream(new File(QHard_Iface.QuestionHard13));
        p13 = this.connection.prepareStatement(query13);
        p13.setBinaryStream(1, input13);
        p13.setString(2, QHard_Iface.AnswerHard13_1);
        p13.setString(3, QHard_Iface.AnswerHard13_2);
        p13.setString(4, QHard_Iface.AnswerHard13_3);
        p13.setString(5, QHard_Iface.AnswerHard13_4);
        p13.setString(6, QHard_Iface.AnswerHard13_5);
        p13.setString(7, QHard_Iface.CorrectHard13);
        p13.executeUpdate();
        
        String query14 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input14 = new FileInputStream(new File(QHard_Iface.QuestionHard14));
        p14 = this.connection.prepareStatement(query14);
        p14.setBinaryStream(1, input14);
        p14.setString(2, QHard_Iface.AnswerHard14_1);
        p14.setString(3, QHard_Iface.AnswerHard14_2);
        p14.setString(4, QHard_Iface.AnswerHard14_3);
        p14.setString(5, QHard_Iface.AnswerHard14_4);
        p14.setString(6, QHard_Iface.AnswerHard14_5);
        p14.setString(7, QHard_Iface.CorrectHard14);
        p14.executeUpdate();
        
        String query15 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input15 = new FileInputStream(new File(QHard_Iface.QuestionHard15));
        p15 = this.connection.prepareStatement(query15);
        p15.setBinaryStream(1, input15);
        p15.setString(2, QHard_Iface.AnswerHard15_1);
        p15.setString(3, QHard_Iface.AnswerHard15_2);
        p15.setString(4, QHard_Iface.AnswerHard15_3);
        p15.setString(5, QHard_Iface.AnswerHard15_4);
        p15.setString(6, QHard_Iface.AnswerHard15_5);
        p15.setString(7, QHard_Iface.CorrectHard15);
        p15.executeUpdate();
        
        String query16 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input16 = new FileInputStream(new File(QHard_Iface.QuestionHard16));
        p16 = this.connection.prepareStatement(query16);
        p16.setBinaryStream(1, input16);
        p16.setString(2, QHard_Iface.AnswerHard16_1);
        p16.setString(3, QHard_Iface.AnswerHard16_2);
        p16.setString(4, QHard_Iface.AnswerHard16_3);
        p16.setString(5, QHard_Iface.AnswerHard16_4);
        p16.setString(6, QHard_Iface.AnswerHard16_5);
        p16.setString(7, QHard_Iface.CorrectHard16);
        p16.executeUpdate();
        
        String query17 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input17 = new FileInputStream(new File(QHard_Iface.QuestionHard17));
        p17 = this.connection.prepareStatement(query17);
        p17.setBinaryStream(1, input17);
        p17.setString(2, QHard_Iface.AnswerHard17_1);
        p17.setString(3, QHard_Iface.AnswerHard17_2);
        p17.setString(4, QHard_Iface.AnswerHard17_3);
        p17.setString(5, QHard_Iface.AnswerHard17_4);
        p17.setString(6, QHard_Iface.AnswerHard17_5);
        p17.setString(7, QHard_Iface.CorrectHard17);
        p17.executeUpdate();
        
        String query18 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input18 = new FileInputStream(new File(QHard_Iface.QuestionHard18));
        p18 = this.connection.prepareStatement(query18);
        p18.setBinaryStream(1, input18);
        p18.setString(2, QHard_Iface.AnswerHard18_1);
        p18.setString(3, QHard_Iface.AnswerHard18_2);
        p18.setString(4, QHard_Iface.AnswerHard18_3);
        p18.setString(5, QHard_Iface.AnswerHard18_4);
        p18.setString(6, QHard_Iface.AnswerHard18_5);
        p18.setString(7, QHard_Iface.CorrectHard18);
        p18.executeUpdate();
        
        String query19 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input19 = new FileInputStream(new File(QHard_Iface.QuestionHard19));
        p19 = this.connection.prepareStatement(query19);
        p19.setBinaryStream(1, input19);
        p19.setString(2, QHard_Iface.AnswerHard19_1);
        p19.setString(3, QHard_Iface.AnswerHard19_2);
        p19.setString(4, QHard_Iface.AnswerHard19_3);
        p19.setString(5, QHard_Iface.AnswerHard19_4);
        p19.setString(6, QHard_Iface.AnswerHard19_5);
        p19.setString(7, QHard_Iface.CorrectHard19);
        p19.executeUpdate();
        
        String query20 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input20 = new FileInputStream(new File(QHard_Iface.QuestionHard20));
        p20 = this.connection.prepareStatement(query20);
        p20.setBinaryStream(1, input20);
        p20.setString(2, QHard_Iface.AnswerHard20_1);
        p20.setString(3, QHard_Iface.AnswerHard20_2);
        p20.setString(4, QHard_Iface.AnswerHard20_3);
        p20.setString(5, QHard_Iface.AnswerHard20_4);
        p20.setString(6, QHard_Iface.AnswerHard20_5);
        p20.setString(7, QHard_Iface.CorrectHard20);
        p20.executeUpdate();
        
        String query21 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input21 = new FileInputStream(new File(QHard_Iface.QuestionHard21));
        p21 = this.connection.prepareStatement(query21);
        p21.setBinaryStream(1, input21);
        p21.setString(2, QHard_Iface.AnswerHard21_1);
        p21.setString(3, QHard_Iface.AnswerHard21_2);
        p21.setString(4, QHard_Iface.AnswerHard21_3);
        p21.setString(5, QHard_Iface.AnswerHard21_4);
        p21.setString(6, QHard_Iface.AnswerHard21_5);
        p21.setString(7, QHard_Iface.CorrectHard21);
        p21.executeUpdate();
        
        String query22 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input22 = new FileInputStream(new File(QHard_Iface.QuestionHard22));
        p22 = this.connection.prepareStatement(query22);
        p22.setBinaryStream(1, input22);
        p22.setString(2, QHard_Iface.AnswerHard22_1);
        p22.setString(3, QHard_Iface.AnswerHard22_2);
        p22.setString(4, QHard_Iface.AnswerHard22_3);
        p22.setString(5, QHard_Iface.AnswerHard22_4);
        p22.setString(6, QHard_Iface.AnswerHard22_5);
        p22.setString(7, QHard_Iface.CorrectHard22);
        p22.executeUpdate();
        
        String query23 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input23 = new FileInputStream(new File(QHard_Iface.QuestionHard23));
        p23 = this.connection.prepareStatement(query23);
        p23.setBinaryStream(1, input23);
        p23.setString(2, QHard_Iface.AnswerHard23_1);
        p23.setString(3, QHard_Iface.AnswerHard23_2);
        p23.setString(4, QHard_Iface.AnswerHard23_3);
        p23.setString(5, QHard_Iface.AnswerHard23_4);
        p23.setString(6, QHard_Iface.AnswerHard23_5);
        p23.setString(7, QHard_Iface.CorrectHard23);
        p23.executeUpdate();
        
        String query24 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input24 = new FileInputStream(new File(QHard_Iface.QuestionHard24));
        p24 = this.connection.prepareStatement(query24);
        p24.setBinaryStream(1, input24);
        p24.setString(2, QHard_Iface.AnswerHard24_1);
        p24.setString(3, QHard_Iface.AnswerHard24_2);
        p24.setString(4, QHard_Iface.AnswerHard24_3);
        p24.setString(5, QHard_Iface.AnswerHard24_4);
        p24.setString(6, QHard_Iface.AnswerHard24_5);
        p24.setString(7, QHard_Iface.CorrectHard24);
        p24.executeUpdate();
        
        String query25 = "INSERT INTO question_hard (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input25 = new FileInputStream(new File(QHard_Iface.QuestionHard25));
        p25 = this.connection.prepareStatement(query25);
        p25.setBinaryStream(1, input25);
        p25.setString(2, QHard_Iface.AnswerHard25_1);
        p25.setString(3, QHard_Iface.AnswerHard25_2);
        p25.setString(4, QHard_Iface.AnswerHard25_3);
        p25.setString(5, QHard_Iface.AnswerHard25_4);
        p25.setString(6, QHard_Iface.AnswerHard25_5);
        p25.setString(7, QHard_Iface.CorrectHard25);
        p25.executeUpdate();
        
        p1.close();
        p2.close();
        p3.close();
        p4.close();
        p5.close();
        p6.close();
        p7.close();
        p8.close();
        p9.close();
        p10.close();
        p11.close();
        p12.close();
        p13.close();
        p14.close();
        p15.close();
        p16.close();
        p17.close();
        p18.close();
        p19.close();
        p20.close();
        p21.close();
        p22.close();
        p23.close();
        p24.close();
        p25.close();
        
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//initQHard
    
    public void initQAdvance() throws FileNotFoundException{
    
       PreparedStatement p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25;
       
       try{
        
       String query1 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input1 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance1));
        p1 = this.connection.prepareStatement(query1);
        p1.setBinaryStream(1, input1);
        p1.setString(2, QAdvance_Iface.AnswerAdvance1_1);
        p1.setString(3, QAdvance_Iface.AnswerAdvance1_2);
        p1.setString(4, QAdvance_Iface.AnswerAdvance1_3);
        p1.setString(5, QAdvance_Iface.AnswerAdvance1_4);
        p1.setString(6, QAdvance_Iface.AnswerAdvance1_5);
        p1.setString(7, QAdvance_Iface.CorrectAdvance1);
        p1.executeUpdate();
        
        String query2 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input2 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance2));
        p2 = this.connection.prepareStatement(query2);
        p2.setBinaryStream(1, input2);
        p2.setString(2, QAdvance_Iface.AnswerAdvance2_1);
        p2.setString(3, QAdvance_Iface.AnswerAdvance2_2);
        p2.setString(4, QAdvance_Iface.AnswerAdvance2_3);
        p2.setString(5, QAdvance_Iface.AnswerAdvance2_4);
        p2.setString(6, QAdvance_Iface.AnswerAdvance2_5);
        p2.setString(7, QAdvance_Iface.CorrectAdvance2);
        p2.executeUpdate();
        
        String query3 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input3 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance3));
        p3 = this.connection.prepareStatement(query3);
        p3.setBinaryStream(1, input3);
        p3.setString(2, QAdvance_Iface.AnswerAdvance3_1);
        p3.setString(3, QAdvance_Iface.AnswerAdvance3_2);
        p3.setString(4, QAdvance_Iface.AnswerAdvance3_3);
        p3.setString(5, QAdvance_Iface.AnswerAdvance3_4);
        p3.setString(6, QAdvance_Iface.AnswerAdvance3_5);
        p3.setString(7, QAdvance_Iface.CorrectAdvance3);
        p3.executeUpdate();
        
        String query4 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input4 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance4));
        p4 = this.connection.prepareStatement(query4);
        p4.setBinaryStream(1, input4);
        p4.setString(2, QAdvance_Iface.AnswerAdvance4_1);
        p4.setString(3, QAdvance_Iface.AnswerAdvance4_2);
        p4.setString(4, QAdvance_Iface.AnswerAdvance4_3);
        p4.setString(5, QAdvance_Iface.AnswerAdvance4_4);
        p4.setString(6, QAdvance_Iface.AnswerAdvance4_5);
        p4.setString(7, QAdvance_Iface.CorrectAdvance4);
        p4.executeUpdate();
        
        String query5 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input5 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance5));
        p5 = this.connection.prepareStatement(query5);
        p5.setBinaryStream(1, input5);
        p5.setString(2, QAdvance_Iface.AnswerAdvance5_1);
        p5.setString(3, QAdvance_Iface.AnswerAdvance5_2);
        p5.setString(4, QAdvance_Iface.AnswerAdvance5_3);
        p5.setString(5, QAdvance_Iface.AnswerAdvance5_4);
        p5.setString(6, QAdvance_Iface.AnswerAdvance5_5);
        p5.setString(7, QAdvance_Iface.CorrectAdvance5);
        p5.executeUpdate();
        
        String query6 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input6 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance6));
        p6 = this.connection.prepareStatement(query6);
        p6.setBinaryStream(1, input6);
        p6.setString(2, QAdvance_Iface.AnswerAdvance6_1);
        p6.setString(3, QAdvance_Iface.AnswerAdvance6_2);
        p6.setString(4, QAdvance_Iface.AnswerAdvance6_3);
        p6.setString(5, QAdvance_Iface.AnswerAdvance6_4);
        p6.setString(6, QAdvance_Iface.AnswerAdvance6_5);
        p6.setString(7, QAdvance_Iface.CorrectAdvance6);
        p6.executeUpdate();
        
        String query7 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input7 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance7));
        p7 = this.connection.prepareStatement(query7);
        p7.setBinaryStream(1, input7);
        p7.setString(2, QAdvance_Iface.AnswerAdvance7_1);
        p7.setString(3, QAdvance_Iface.AnswerAdvance7_2);
        p7.setString(4, QAdvance_Iface.AnswerAdvance7_3);
        p7.setString(5, QAdvance_Iface.AnswerAdvance7_4);
        p7.setString(6, QAdvance_Iface.AnswerAdvance7_5);
        p7.setString(7, QAdvance_Iface.CorrectAdvance7);
        p7.executeUpdate();
        
        String query8 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input8 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance8));
        p8 = this.connection.prepareStatement(query8);
        p8.setBinaryStream(1, input8);
        p8.setString(2, QAdvance_Iface.AnswerAdvance8_1);
        p8.setString(3, QAdvance_Iface.AnswerAdvance8_2);
        p8.setString(4, QAdvance_Iface.AnswerAdvance8_3);
        p8.setString(5, QAdvance_Iface.AnswerAdvance8_4);
        p8.setString(6, QAdvance_Iface.AnswerAdvance8_5);
        p8.setString(7, QAdvance_Iface.CorrectAdvance8);
        p8.executeUpdate();
        
        String query9 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input9 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance9));
        p9 = this.connection.prepareStatement(query9);
        p9.setBinaryStream(1, input9);
        p9.setString(2, QAdvance_Iface.AnswerAdvance9_1);
        p9.setString(3, QAdvance_Iface.AnswerAdvance9_2);
        p9.setString(4, QAdvance_Iface.AnswerAdvance9_3);
        p9.setString(5, QAdvance_Iface.AnswerAdvance9_4);
        p9.setString(6, QAdvance_Iface.AnswerAdvance9_5);
        p9.setString(7, QAdvance_Iface.CorrectAdvance9);
        p9.executeUpdate();
        
        String query10 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input10 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance10));
        p10 = this.connection.prepareStatement(query10);
        p10.setBinaryStream(1, input10);
        p10.setString(2, QAdvance_Iface.AnswerAdvance10_1);
        p10.setString(3, QAdvance_Iface.AnswerAdvance10_2);
        p10.setString(4, QAdvance_Iface.AnswerAdvance10_3);
        p10.setString(5, QAdvance_Iface.AnswerAdvance10_4);
        p10.setString(6, QAdvance_Iface.AnswerAdvance10_5);
        p10.setString(7, QAdvance_Iface.CorrectAdvance10);
        p10.executeUpdate();
        
        String query11 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input11 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance11));
        p11 = this.connection.prepareStatement(query11);
        p11.setBinaryStream(1, input11);
        p11.setString(2, QAdvance_Iface.AnswerAdvance11_1);
        p11.setString(3, QAdvance_Iface.AnswerAdvance11_2);
        p11.setString(4, QAdvance_Iface.AnswerAdvance11_3);
        p11.setString(5, QAdvance_Iface.AnswerAdvance11_4);
        p11.setString(6, QAdvance_Iface.AnswerAdvance11_5);
        p11.setString(7, QAdvance_Iface.CorrectAdvance11);
        p11.executeUpdate();
        
        String query12 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input12 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance12));
        p12 = this.connection.prepareStatement(query12);
        p12.setBinaryStream(1, input12);
        p12.setString(2, QAdvance_Iface.AnswerAdvance12_1);
        p12.setString(3, QAdvance_Iface.AnswerAdvance12_2);
        p12.setString(4, QAdvance_Iface.AnswerAdvance12_3);
        p12.setString(5, QAdvance_Iface.AnswerAdvance12_4);
        p12.setString(6, QAdvance_Iface.AnswerAdvance12_5);
        p12.setString(7, QAdvance_Iface.CorrectAdvance12);
        p12.executeUpdate();
        
        String query13 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input13 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance13));
        p13 = this.connection.prepareStatement(query13);
        p13.setBinaryStream(1, input13);
        p13.setString(2, QAdvance_Iface.AnswerAdvance13_1);
        p13.setString(3, QAdvance_Iface.AnswerAdvance13_2);
        p13.setString(4, QAdvance_Iface.AnswerAdvance13_3);
        p13.setString(5, QAdvance_Iface.AnswerAdvance13_4);
        p13.setString(6, QAdvance_Iface.AnswerAdvance13_5);
        p13.setString(7, QAdvance_Iface.CorrectAdvance13);
        p13.executeUpdate();
        
        String query14 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input14 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance14));
        p14 = this.connection.prepareStatement(query14);
        p14.setBinaryStream(1, input14);
        p14.setString(2, QAdvance_Iface.AnswerAdvance14_1);
        p14.setString(3, QAdvance_Iface.AnswerAdvance14_2);
        p14.setString(4, QAdvance_Iface.AnswerAdvance14_3);
        p14.setString(5, QAdvance_Iface.AnswerAdvance14_4);
        p14.setString(6, QAdvance_Iface.AnswerAdvance14_5);
        p14.setString(7, QAdvance_Iface.CorrectAdvance14);
        p14.executeUpdate();
        
        String query15 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input15 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance15));
        p15 = this.connection.prepareStatement(query15);
        p15.setBinaryStream(1, input15);
        p15.setString(2, QAdvance_Iface.AnswerAdvance15_1);
        p15.setString(3, QAdvance_Iface.AnswerAdvance15_2);
        p15.setString(4, QAdvance_Iface.AnswerAdvance15_3);
        p15.setString(5, QAdvance_Iface.AnswerAdvance15_4);
        p15.setString(6, QAdvance_Iface.AnswerAdvance15_5);
        p15.setString(7, QAdvance_Iface.CorrectAdvance15);
        p15.executeUpdate();
        
        String query16 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input16 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance16));
        p16 = this.connection.prepareStatement(query16);
        p16.setBinaryStream(1, input16);
        p16.setString(2, QAdvance_Iface.AnswerAdvance16_1);
        p16.setString(3, QAdvance_Iface.AnswerAdvance16_2);
        p16.setString(4, QAdvance_Iface.AnswerAdvance16_3);
        p16.setString(5, QAdvance_Iface.AnswerAdvance16_4);
        p16.setString(6, QAdvance_Iface.AnswerAdvance16_5);
        p16.setString(7, QAdvance_Iface.CorrectAdvance16);
        p16.executeUpdate();
        
        String query17 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input17 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance17));
        p17 = this.connection.prepareStatement(query17);
        p17.setBinaryStream(1, input17);
        p17.setString(2, QAdvance_Iface.AnswerAdvance17_1);
        p17.setString(3, QAdvance_Iface.AnswerAdvance17_2);
        p17.setString(4, QAdvance_Iface.AnswerAdvance17_3);
        p17.setString(5, QAdvance_Iface.AnswerAdvance17_4);
        p17.setString(6, QAdvance_Iface.AnswerAdvance17_5);
        p17.setString(7, QAdvance_Iface.CorrectAdvance17);
        p17.executeUpdate();
        
        String query18 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input18 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance18));
        p18 = this.connection.prepareStatement(query18);
        p18.setBinaryStream(1, input18);
        p18.setString(2, QAdvance_Iface.AnswerAdvance18_1);
        p18.setString(3, QAdvance_Iface.AnswerAdvance18_2);
        p18.setString(4, QAdvance_Iface.AnswerAdvance18_3);
        p18.setString(5, QAdvance_Iface.AnswerAdvance18_4);
        p18.setString(6, QAdvance_Iface.AnswerAdvance18_5);
        p18.setString(7, QAdvance_Iface.CorrectAdvance18);
        p18.executeUpdate();
        
        String query19 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input19 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance19));
        p19 = this.connection.prepareStatement(query19);
        p19.setBinaryStream(1, input19);
        p19.setString(2, QAdvance_Iface.AnswerAdvance19_1);
        p19.setString(3, QAdvance_Iface.AnswerAdvance19_2);
        p19.setString(4, QAdvance_Iface.AnswerAdvance19_3);
        p19.setString(5, QAdvance_Iface.AnswerAdvance19_4);
        p19.setString(6, QAdvance_Iface.AnswerAdvance19_5);
        p19.setString(7, QAdvance_Iface.CorrectAdvance19);
        p19.executeUpdate();
        
        String query20 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input20 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance20));
        p20 = this.connection.prepareStatement(query20);
        p20.setBinaryStream(1, input20);
        p20.setString(2, QAdvance_Iface.AnswerAdvance20_1);
        p20.setString(3, QAdvance_Iface.AnswerAdvance20_2);
        p20.setString(4, QAdvance_Iface.AnswerAdvance20_3);
        p20.setString(5, QAdvance_Iface.AnswerAdvance20_4);
        p20.setString(6, QAdvance_Iface.AnswerAdvance20_5);
        p20.setString(7, QAdvance_Iface.CorrectAdvance20);
        p20.executeUpdate();
        
        String query21 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input21 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance21));
        p21 = this.connection.prepareStatement(query21);
        p21.setBinaryStream(1, input21);
        p21.setString(2, QAdvance_Iface.AnswerAdvance21_1);
        p21.setString(3, QAdvance_Iface.AnswerAdvance21_2);
        p21.setString(4, QAdvance_Iface.AnswerAdvance21_3);
        p21.setString(5, QAdvance_Iface.AnswerAdvance21_4);
        p21.setString(6, QAdvance_Iface.AnswerAdvance21_5);
        p21.setString(7, QAdvance_Iface.CorrectAdvance21);
        p21.executeUpdate();
        
        String query22 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input22 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance22));
        p22 = this.connection.prepareStatement(query22);
        p22.setBinaryStream(1, input22);
        p22.setString(2, QAdvance_Iface.AnswerAdvance22_1);
        p22.setString(3, QAdvance_Iface.AnswerAdvance22_2);
        p22.setString(4, QAdvance_Iface.AnswerAdvance22_3);
        p22.setString(5, QAdvance_Iface.AnswerAdvance22_4);
        p22.setString(6, QAdvance_Iface.AnswerAdvance22_5);
        p22.setString(7, QAdvance_Iface.CorrectAdvance22);
        p22.executeUpdate();
        
        String query23 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input23 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance23));
        p23 = this.connection.prepareStatement(query23);
        p23.setBinaryStream(1, input23);
        p23.setString(2, QAdvance_Iface.AnswerAdvance23_1);
        p23.setString(3, QAdvance_Iface.AnswerAdvance23_2);
        p23.setString(4, QAdvance_Iface.AnswerAdvance23_3);
        p23.setString(5, QAdvance_Iface.AnswerAdvance23_4);
        p23.setString(6, QAdvance_Iface.AnswerAdvance23_5);
        p23.setString(7, QAdvance_Iface.CorrectAdvance23);
        p23.executeUpdate();
        
        String query24 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input24 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance24));
        p24 = this.connection.prepareStatement(query24);
        p24.setBinaryStream(1, input24);
        p24.setString(2, QAdvance_Iface.AnswerAdvance24_1);
        p24.setString(3, QAdvance_Iface.AnswerAdvance24_2);
        p24.setString(4, QAdvance_Iface.AnswerAdvance24_3);
        p24.setString(5, QAdvance_Iface.AnswerAdvance24_4);
        p24.setString(6, QAdvance_Iface.AnswerAdvance24_5);
        p24.setString(7, QAdvance_Iface.CorrectAdvance24);
        p24.executeUpdate();
        
        String query25 = "INSERT INTO question_advance (question, answer_one, answer_two, answer_three, answer_four, answer_five, correct_ans) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        FileInputStream input25 = new FileInputStream(new File(QAdvance_Iface.QuestionAdvance25));
        p25 = this.connection.prepareStatement(query25);
        p25.setBinaryStream(1, input25);
        p25.setString(2, QAdvance_Iface.AnswerAdvance25_1);
        p25.setString(3, QAdvance_Iface.AnswerAdvance25_2);
        p25.setString(4, QAdvance_Iface.AnswerAdvance25_3);
        p25.setString(5, QAdvance_Iface.AnswerAdvance25_4);
        p25.setString(6, QAdvance_Iface.AnswerAdvance25_5);
        p25.setString(7, QAdvance_Iface.CorrectAdvance25);
        p25.executeUpdate();
        
        p1.close();
        p2.close();
        p3.close();
        p4.close();
        p5.close();
        p6.close();
        p7.close();
        p8.close();
        p9.close();
        p10.close();
        p11.close();
        p12.close();
        p13.close();
        p14.close();
        p15.close();
        p16.close();
        p17.close();
        p18.close();
        p19.close();
        p20.close();
        p21.close();
        p22.close();
        p23.close();
        p24.close();
        p25.close();
        
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }// initQAdvance
}
