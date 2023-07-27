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
   <br>Table structure: course varchar(20), semester1 varchar(20), semester2 varchar(20), semester3 varchar(20), semester4 varchar(20), semester5 varchar(20), semester6 varchar(20), semester7 varchar(20), semester8 varchar(20)
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
3) **login** - Stores the username and password for student and admin/factulty
   <br>Table structure: username varchar(25), password varchar
5) **marks**
6) **student**
7) **studentleave**
8) **subject**
9) **teacher**
10) **teacherleave**
