/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package javacertification;

public interface QAdvance_Iface {
    
    String PATH= "C:\\Users\\ig097\\Documents\\Questions\\";
    
    String QuestionAdvance1 = PATH+"QuestionAdvance1.png";
    String AnswerAdvance1_1 = "private static Semaphore sem = new Semaphore(1); sem.acquire();";
    String AnswerAdvance1_2 = "private static Semaphore sem = new Semaphore(1); sem.release();";
    String AnswerAdvance1_3 = "private static Semaphore sem = new Semaphore(1); none;";
    String AnswerAdvance1_4 = "private static Semaphore sem = new Semaphore(); sem.acquire();";
    String AnswerAdvance1_5 = "None";
    String CorrectAdvance1 = "private static Semaphore sem = new Semaphore(1); sem.acquire();";
    
    String QuestionAdvance2 = PATH+"QuestionAdvance2.png";
    String AnswerAdvance2_1 = "A B D";
    String AnswerAdvance2_2 = "B C";
    String AnswerAdvance2_3 = "A B C";
    String AnswerAdvance2_4 = "A B";
    String AnswerAdvance2_5 = "None";
    String CorrectAdvance2 = "A B C";
    
    String QuestionAdvance3 = PATH+"QuestionAdvance3.png";
    String AnswerAdvance3_1 = "A";
    String AnswerAdvance3_2 = "B";
    String AnswerAdvance3_3 = "C";
    String AnswerAdvance3_4 = "D";
    String AnswerAdvance3_5 = "None";
    String CorrectAdvance3 = "A";
    
    String QuestionAdvance4 = PATH+"QuestionAdvance4.png";
    String AnswerAdvance4_1 = "A";
    String AnswerAdvance4_2 = "B";
    String AnswerAdvance4_3 = "C";
    String AnswerAdvance4_4 = "D";
    String AnswerAdvance4_5 = "None";
    String CorrectAdvance4 = "D";
    
    String QuestionAdvance5 = PATH+"QuestionAdvance5.png";
    String AnswerAdvance5_1 = "A";
    String AnswerAdvance5_2 = "B";
    String AnswerAdvance5_3 = "C";
    String AnswerAdvance5_4 = "D";
    String AnswerAdvance5_5 = "None";
    String CorrectAdvance5 = "C";
    
    String QuestionAdvance6 = PATH+"QuestionAdvance6.png";
    String AnswerAdvance6_1 = "A";
    String AnswerAdvance6_2 = "B";
    String AnswerAdvance6_3 = "C";
    String AnswerAdvance6_4 = "D";
    String AnswerAdvance6_5 = "None";
    String CorrectAdvance6 = "B";
    
    String QuestionAdvance7 = PATH+"QuestionAdvance7.png";
    String AnswerAdvance7_1 = "Correct, but it is not important";
    String AnswerAdvance7_2 = "Correct, it's important to synchronize around the list when we iterate it";
    String AnswerAdvance7_3 = "Incorrect, this syntax does not exist";
    String AnswerAdvance7_4 = "None";
    String AnswerAdvance7_5 = "I am not sure";
    String CorrectAdvance7 = "Correct, it's important to synchronize around the list when we iterate it";
    
    String QuestionAdvance8 = PATH+"QuestionAdvance8.png";
    String AnswerAdvance8_1 = "2008 is a leap year? false";
    String AnswerAdvance8_2 = "2008 is a leap year? true";
    String AnswerAdvance8_3 = "2008 is a leap year? 0";
    String AnswerAdvance8_4 = "2008 is a leap year? 1";
    String AnswerAdvance8_5 = "None";
    String CorrectAdvance8 = "2008 is a leap year? true";
    
    String QuestionAdvance9 = PATH+"QuestionAdvance9.png";
    String AnswerAdvance9_1 = "A";
    String AnswerAdvance9_2 = "C";
    String AnswerAdvance9_3 = "D";
    String AnswerAdvance9_4 = "B";
    String AnswerAdvance9_5 = "None";
    String CorrectAdvance9 = "B";
    
    String QuestionAdvance10 = PATH+"QuestionAdvance10.png";
    String AnswerAdvance10_1 = "Sales tax is $11.85";
    String AnswerAdvance10_2 = "Sales tax is $12";
    String AnswerAdvance10_3 = "Sales tax is $11";
    String AnswerAdvance10_4 = "Sales tax is $11.0";
    String AnswerAdvance10_5 = "Sales tax is $12.5";
    String CorrectAdvance10 = "Sales tax is $11";
    
    String QuestionAdvance11 = PATH+"QuestionAdvance11.png";
    String AnswerAdvance11_1 = "Display packages about which the program currently is aware";
    String AnswerAdvance11_2 = "Display information about User-define Class Package";
    String AnswerAdvance11_3 = "java.lang.ArrayOutOfBoundException";
    String AnswerAdvance11_4 = "None";
    String AnswerAdvance11_5 = "I am not sure";
    String CorrectAdvance11 = "Display packages about which the program currently is aware";
    
    String QuestionAdvance12 = PATH+"QuestionAdvance12.png";
    String AnswerAdvance12_1 = "A";
    String AnswerAdvance12_2 = "B";
    String AnswerAdvance12_3 = "C";
    String AnswerAdvance12_4 = "D";
    String AnswerAdvance12_5 = "None";
    String CorrectAdvance12 = "A";
    
    String QuestionAdvance13 = PATH+"QuestionAdvance13.png";
    String AnswerAdvance13_1 = "A";
    String AnswerAdvance13_2 = "B";
    String AnswerAdvance13_3 = "D";
    String AnswerAdvance13_4 = "C";
    String AnswerAdvance13_5 = "All";
    String CorrectAdvance13 = "B";
    
    String QuestionAdvance14 = PATH+"QuestionAdvance14.png";
    String AnswerAdvance14_1 = "A";
    String AnswerAdvance14_2 = "B";
    String AnswerAdvance14_3 = "C";
    String AnswerAdvance14_4 = "D";
    String AnswerAdvance14_5 = "None";
    String CorrectAdvance14 = "D";
    
    String QuestionAdvance15 = PATH+"QuestionAdvance15.png";
    String AnswerAdvance15_1 = "Create public static void main() method inside SimpleApplet.java";
    String AnswerAdvance15_2 = "path:>appletviewer RunApp.html";
    String AnswerAdvance15_3 = "path:>appletviewer SimpleApplet.java";
    String AnswerAdvance15_4 = "path:>javac RunApp.html";
    String AnswerAdvance15_5 = "None";
    String CorrectAdvance15 = "path:>appletviewer RunApp.html";
    
    String QuestionAdvance16 = PATH+"QuestionAdvance16.png";
    String AnswerAdvance16_1 = "A";
    String AnswerAdvance16_2 = "B";
    String AnswerAdvance16_3 = "C";
    String AnswerAdvance16_4 = "D";
    String AnswerAdvance16_5 = "None";
    String CorrectAdvance16 = "B";
    
    String QuestionAdvance17 = PATH+"QuestionAdvance17.png";
    String AnswerAdvance17_1 = "B";
    String AnswerAdvance17_2 = "C";
    String AnswerAdvance17_3 = "A";
    String AnswerAdvance17_4 = "D";
    String AnswerAdvance17_5 = "All";
    String CorrectAdvance17 = "C";
    
    String QuestionAdvance18 = PATH+"QuestionAdvance18.png";
    String AnswerAdvance18_1 = "A";
    String AnswerAdvance18_2 = "B";
    String AnswerAdvance18_3 = "C";
    String AnswerAdvance18_4 = "D";
    String AnswerAdvance18_5 = "None";
    String CorrectAdvance18 = "C";
    
    String QuestionAdvance19 = PATH+"QuestionAdvance19.png";
    String AnswerAdvance19_1 = "A";
    String AnswerAdvance19_2 = "B";
    String AnswerAdvance19_3 = "C";
    String AnswerAdvance19_4 = "D";
    String AnswerAdvance19_5 = "None";
    String CorrectAdvance19 = "B";
    
    String QuestionAdvance20 = PATH+"QuestionAdvance20.png";
    String AnswerAdvance20_1 = "A";
    String AnswerAdvance20_2 = "B";
    String AnswerAdvance20_3 = "C";
    String AnswerAdvance20_4 = "D";
    String AnswerAdvance20_5 = "All";
    String CorrectAdvance20 = "B";
    
    String QuestionAdvance21 = PATH+"QuestionAdvance21.png";
    String AnswerAdvance21_1 = "A";
    String AnswerAdvance21_2 = "B";
    String AnswerAdvance21_3 = "C";
    String AnswerAdvance21_4 = "D";
    String AnswerAdvance21_5 = "All";
    String CorrectAdvance21 = "B";
    
    String QuestionAdvance22 = PATH+"QuestionAdvance22.png";
    String AnswerAdvance22_1 = "A";
    String AnswerAdvance22_2 = "B";
    String AnswerAdvance22_3 = "C";
    String AnswerAdvance22_4 = "D";
    String AnswerAdvance22_5 = "None";
    String CorrectAdvance22 = "A";
    
    String QuestionAdvance23 = PATH+"QuestionAdvance23.png";
    String AnswerAdvance23_1 = "A";
    String AnswerAdvance23_2 = "B";
    String AnswerAdvance23_3 = "C";
    String AnswerAdvance23_4 = "D";
    String AnswerAdvance23_5 = "None";
    String CorrectAdvance23 = "C";
    
    String QuestionAdvance24 = PATH+"QuestionAdvance24.png";
    String AnswerAdvance24_1 = "A";
    String AnswerAdvance24_2 = "B";
    String AnswerAdvance24_3 = "C";
    String AnswerAdvance24_4 = "D";
    String AnswerAdvance24_5 = "None";
    String CorrectAdvance24 = "B";
    
    String QuestionAdvance25 = PATH+"QuestionAdvance25.png";
    String AnswerAdvance25_1 = "A";
    String AnswerAdvance25_2 = "B";
    String AnswerAdvance25_3 = "C";
    String AnswerAdvance25_4 = "D";
    String AnswerAdvance25_5 = "None";
    String CorrectAdvance25 = "C";
}
