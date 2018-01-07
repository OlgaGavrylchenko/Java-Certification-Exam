/*
 * CIT285 Advanced Java
 * Final Programming Project
 * Create an environmental similar to the Java Certification Examinations
 * 
 *
 * @Created by Olga Gavrylchenko, 12/10/ 2017
 */
package javacertification;

//hold questions and answers data
public interface QEasy_Iface {
    
    String PATH= "C:\\Users\\ig097\\Documents\\Questions\\";
    
    //easy questions
    String QuestionEasy1 = PATH+"QuestionEasy1.png";
    String AnswerEasy1_1 = "this(10)";
    String AnswerEasy1_2 = "super(10)";
    String AnswerEasy1_3 = "Test(10)";
    String AnswerEasy1_4 = "super.Test(10)";
    String AnswerEasy1_5 = "None";
    String CorrectEasy1 = "this(10)";
    
    String QuestionEasy2 = PATH+"QuestionEasy2.png";
    String AnswerEasy2_1 = "6 7";
    String AnswerEasy2_2 = "6 6";
    String AnswerEasy2_3 = "7 7";
    String AnswerEasy2_4 = "7 6";
    String AnswerEasy2_5 = "None";
    String CorrectEasy2 = "7 7";
    
    String QuestionEasy3 = PATH+"QuestionEasy3.png";
    String AnswerEasy3_1 = "6 7";
    String AnswerEasy3_2 = "6 6";
    String AnswerEasy3_3 = "7 7";
    String AnswerEasy3_4 = "7 6";
    String AnswerEasy3_5 = "None";
    String CorrectEasy3 = "7 6";
    
    String QuestionEasy4 = PATH+"QuestionEasy4.png";
    String AnswerEasy4_1 = "a";
    String AnswerEasy4_2 = "B";
    String AnswerEasy4_3 = "65";
    String AnswerEasy4_4 = "A";
    String AnswerEasy4_5 = "65.25";
    String CorrectEasy4 = "A";
    
    String QuestionEasy5 = PATH+"QuestionEasy5.png";
    String AnswerEasy5_1 = "a c a-c";
    String AnswerEasy5_2 = "b c 2";
    String AnswerEasy5_3 = "b c -2";
    String AnswerEasy5_4 = "b c b-c";
    String AnswerEasy5_5 = "None";
    String CorrectEasy5 = "b c -2";
    
    String QuestionEasy6 = PATH+"QuestionEasy6.png";
    String AnswerEasy6_1 = "10";
    String AnswerEasy6_2 = "Endless loop";
    String AnswerEasy6_3 = "Compile-time error: unreachable statement";
    String AnswerEasy6_4 = "1";
    String AnswerEasy6_5 = "none";
    String CorrectEasy6 = "Compile-time error: unreachable statement";
    
    String QuestionEasy7 = PATH+"QuestionEasy7.png";
    String AnswerEasy7_1 = "Private";
    String AnswerEasy7_2 = "Protected";
    String AnswerEasy7_3 = "Public";
    String AnswerEasy7_4 = "None";
    String AnswerEasy7_5 = "Package-private";
    String CorrectEasy7 = "Package-private";
    
    String QuestionEasy8 = PATH+"QuestionEasy8.png";
    String AnswerEasy8_1 = "Private";
    String AnswerEasy8_2 = "Protected";
    String AnswerEasy8_3 = "Public";
    String AnswerEasy8_4 = "None";
    String AnswerEasy8_5 = "Package-private";
    String CorrectEasy8 = "Private";
    
    String QuestionEasy9 = PATH+"QuestionEasy9.png";
    String AnswerEasy9_1 = "B";
    String AnswerEasy9_2 = "A";
    String AnswerEasy9_3 = "C";
    String AnswerEasy9_4 = "D";
    String AnswerEasy9_5 = "All";
    String CorrectEasy9 = "A";
    
    String QuestionEasy10 = PATH+"QuestionEasy10.png";
    String AnswerEasy10_1 = "Private";
    String AnswerEasy10_2 = "Protected";
    String AnswerEasy10_3 = "Public";
    String AnswerEasy10_4 = "None";
    String AnswerEasy10_5 = "Package-private";
    String CorrectEasy10 = "Protected";
    
    String QuestionEasy11 = PATH+"QuestionEasy11.png";
    String AnswerEasy11_1 = "B";
    String AnswerEasy11_2 = "A";
    String AnswerEasy11_3 = "C";
    String AnswerEasy11_4 = "D";
    String AnswerEasy11_5 = "All";
    String CorrectEasy11 = "D";
    
    String QuestionEasy12 = PATH+"QuestionEasy12.png";
    String AnswerEasy12_1 = "B A";
    String AnswerEasy12_2 = "A C";
    String AnswerEasy12_3 = "C D";
    String AnswerEasy12_4 = "D B";
    String AnswerEasy12_5 = "All";
    String CorrectEasy12 = "C D";
    
    String QuestionEasy13 = PATH+"QuestionEasy13.png";
    String AnswerEasy13_1 = "B";
    String AnswerEasy13_2 = "A";
    String AnswerEasy13_3 = "C";
    String AnswerEasy13_4 = "D";
    String AnswerEasy13_5 = "None";
    String CorrectEasy13 = "C";
    
    String QuestionEasy14 = PATH+"QuestionEasy14.png";
    String AnswerEasy14_1 = "-1";
    String AnswerEasy14_2 = "3";
    String AnswerEasy14_3 = "4";
    String AnswerEasy14_4 = "0";
    String AnswerEasy14_5 = "StringIndexOutOfBoundsException";
    String CorrectEasy14 = "4";
    
    String QuestionEasy15 = PATH+"QuestionEasy15.png";
    String AnswerEasy15_1 = "B";
    String AnswerEasy15_2 = "C";
    String AnswerEasy15_3 = "A";
    String AnswerEasy15_4 = "D";
    String AnswerEasy15_5 = "None";
    String CorrectEasy15 = "C";
    
    String QuestionEasy16 = PATH+"QuestionEasy16.png";
    String AnswerEasy16_1 = "B";
    String AnswerEasy16_2 = "A";
    String AnswerEasy16_3 = "C";
    String AnswerEasy16_4 = "D";
    String AnswerEasy16_5 = "All";
    String CorrectEasy16 = "D";
    
    String QuestionEasy17 = PATH+"QuestionEasy17.png";
    String AnswerEasy17_1 = "2147483648";
    String AnswerEasy17_2 = "java.lang.StackOverflowError";
    String AnswerEasy17_3 = "-2147483648";
    String AnswerEasy17_4 = "-2147483647";
    String AnswerEasy17_5 = "None";
    String CorrectEasy17 = "-2147483648";
    
    String QuestionEasy18 = PATH+"QuestionEasy18.png";
    String AnswerEasy18_1 = "0.5";
    String AnswerEasy18_2 = "RoundOffError";
    String AnswerEasy18_3 = "0.5000000000000001";
    String AnswerEasy18_4 = "0.51";
    String AnswerEasy18_5 = "None";
    String CorrectEasy18 = "0.5000000000000001";
    
    String QuestionEasy19 = PATH+"QuestionEasy19.png";
    String AnswerEasy19_1 = "(x+y<z) is 3";
    String AnswerEasy19_2 = "(x+y<z) is true";
    String AnswerEasy19_3 = "(x+y<z) is 5<6";
    String AnswerEasy19_4 = "(x+y<z) is false";
    String AnswerEasy19_5 = "Nonel";
    String CorrectEasy19 = "(x+y<z) is true";
    
    String QuestionEasy20 = PATH+"QuestionEasy20.png";
    String AnswerEasy20_1 = "Compile time error";
    String AnswerEasy20_2 = "0";
    String AnswerEasy20_3 = "5";
    String AnswerEasy20_4 = "None";
    String AnswerEasy20_5 = "All";
    String CorrectEasy20 = "5";
    
    String QuestionEasy21 = PATH+"QuestionEasy21.png";
    String AnswerEasy21_1 = "January 1 1970";
    String AnswerEasy21_2 = "00:00:00";
    String AnswerEasy21_3 = "1234567";
    String AnswerEasy21_4 = "null";
    String AnswerEasy21_5 = "None";
    String CorrectEasy21 = "1234567";
    
    String QuestionEasy22 = PATH+"QuestionEasy22.png";
    String AnswerEasy22_1 = "1";
    String AnswerEasy22_2 = "java.lang.RuntimeException";
    String AnswerEasy22_3 = "0 1 2 3 4 5 6 7 8 9";
    String AnswerEasy22_4 = "9";
    String AnswerEasy22_5 = "None";
    String CorrectEasy22 = "java.lang.RuntimeException";
    
    String QuestionEasy23 = PATH+"QuestionEasy23.png";
    String AnswerEasy23_1 = "0 tom 0 jerry 1 tom 1 jerry";
    String AnswerEasy23_2 = "0 tom 0 jerry 2 tom 2 jerry";
    String AnswerEasy23_3 = "0 tom 0 jerry 1 tom 2 tom 2 jerry";
    String AnswerEasy23_4 = "0 tom 0 jerry 1 tom 1 jerry 2 tom 2 jerry";
    String AnswerEasy23_5 = "None";
    String CorrectEasy23 = "0 tom 0 jerry 1 tom 2 tom 2 jerry";
    
    String QuestionEasy24 = PATH+"QuestionEasy24.png";
    String AnswerEasy24_1 = "Dog is running";
    String AnswerEasy24_2 = "Puppy is playing";
    String AnswerEasy24_3 = "Dog is running Puppy is playing";
    String AnswerEasy24_4 = "Puppy is playing Dog is running";
    String AnswerEasy24_5 = "None";
    String CorrectEasy24 = "Puppy is playing";
    
    String QuestionEasy25 = PATH+"QuestionEasy25.png";
    String AnswerEasy25_1 = "9";
    String AnswerEasy25_2 = "java.lang.RuntimeException";
    String AnswerEasy25_3 = "0";
    String AnswerEasy25_4 = "4+5";
    String AnswerEasy25_5 = "None";
    String CorrectEasy25 = "java.lang.RuntimeException";    
}
