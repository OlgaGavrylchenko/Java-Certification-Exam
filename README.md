# Java-Certification-Exam

**This desktop application is similar to the Java Certification Examination which is offered by Oracle** 

*Happy to get some valuable suggestions regarding the project!*

**Skills used: JavaFX 8, JDBC, RDBMS MySQL**

1. To run the project you should have a java compiler, java path set in your system, jdbc drivers (driver class) and mysql

2. To compile all java files in the same folder

   a. Open cmd in that folder in which all java files are kept

   b. type javac -d . *.java (Put space between all four parameters)

3. To run the project execute JavaCertification.java

4. DATABASE_URL = "jdbc:mysql://localhost/javaexam"

5. Username "olga", password "gavrylc"

6. Files .frm are inside a directory "sqldata"

7. BLOB files are inside a directory "Questions"

8. If you need to insert BLOB files (exam questions) into database tables, uncomment line 38-39 in JavaCertification.java file

9. If you need to change path of folder "Questions", change folder path in files QAdvance_Iface.java, QEasy_Iface.java, QHard_Iface.java, QMedium_Iface.java,
