# University-Management-System
The University Management System is a comprehensive Java-based application designed to efficiently manage the administrative tasks of a university. 
It serves as a centralized platform for administrators, faculty and students to access and process essential information related to academic and administrative activities.

The Tables used in this University Management System are:
1) **collegefee** - Students who paid a particular semester fees.
   <br>Table structure: rollno	int primary key , course varchar(20), branch varchar(20), semester varchar(20), total varchar(20)

   | rollno        | course        | branch            | semester      | course        | 
   | ------------- | ------------- | ----------------- | ------------- | ------------- |
   | 15331598      | Bsc           | Electronics       | Semester1     | 40000         |
   | 15331598      | BCA           | Electronics       | Semester4     | 33000         |
   | 15331978      | BTech         | Computer Science  | Semester5     | 43000         |
2) **fee** - Fees structure for all the course curriculum.
   <br>Table structure: course varchar(20), semester1 varchar(20), semester2 varchar(20), semester3 varchar(20), semester4 varchar(20), semester5 varchar(20), semester6 varchar(20), semester7 varchar(20), semester8 varchar(20), primary key (rollno, course)
   | course        | semester1     | semester2     | semester3     | semester4     | semester5     | semester6     | semester7     | semester8     | 
   | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
   | BA            | 32000         | 28000         | 28000         | 28000         | 28000         | 28000         |
   | BBA           | 22000         | 28000         | 28000         | 28000         | 28000         | 28000         |
   | BCA           | 46000         | 33000         | 33000         | 33000         | 33000         | 33000         |
   | BCom          | 25000         | 22000         | 22000         | 22000         | 22000         | 22000         |
   | BSc           | 40000         | 35000         | 35000         | 35000         | 35000         | 35000         |
   | BTech         | 48000         | 43000         | 43000         | 43000         | 43000         | 43000         | 43000         | 43000         |
   | MA            | 22000         | 20000         | 20000         | 20000         | 
   | MBA           | 46000         | 33000         | 33000         | 33000         |
   | MCA           | 43000         | 33000         | 33000         | 33000         | 
   | MCom          | 30000         | 30000         | 30000         | 30000         |
   | MSc           | 38000         | 35000         | 35000         | 35000         |
3) **login** - Stores the username and password for student and admin/factulty.
   <br>Table structure: username varchar(25), password varchar(25), primary key (username, password)
   | username      | password      |
   | ------------- | ------------- |
   | admin         | 12345         |
   | student       | 67890         |
   
4) **marks** - Consists of marks of all the subjects for a particular student in every semester exam.
   <br>Table stucture - rollno int, semester varchar(20), marks1 varchar(50), marks2 varchar(50), marks3 varchar(50), marks4 varchar(50), marks5 varchar(50), primary key (rollno,semester)
   | rollno        | semester      | marks1        | marks2        | marks3        | marks4        | marks5        |
   | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
   | 15331978      | 2ndSemester   | 67            | 54            | 89            | 90            | 79            |
   | 15339119      | 1stSemester   | 90            | 85            | 93            | 88            | 82            |
   
7) **student**
8) **studentleave**
9) **subject**
10) **teacher**
11) **teacherleave**
