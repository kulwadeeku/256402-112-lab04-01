#### 03603112 Programming Fundamentals II (256402) 
#### Lab04: Class Creation 
#### Student ID: <YOUR-STUDENT-ID>
#### Student Name: <YOUR-NAME>

## Homework 4-1
1. Write a Java class named `Grader` for calculating students' scores of a course.
The `Grader` class must consist of the following methods.
   * `Grader(String name)` is a constructor that receives a course name as its argument.
   * `void addScore(double score)` records a student's score.
   * `int countStudents()` returns the number of students (or scores) recorded by this `Grader` object.
   * `double mean()` calculates an average of the scores.
   * `int belowMean()` returns the number of students having scores less than the average.
   * `int aboveMean()` returns the number of students having scores greater than or equal to the average.
   * `void showGrade()` displays a grade distribution.
     * Grading Criteria: 
       0-49 => F, 50-54 => D, 55-59 => D+, 60-64 => C, 65-69 => C+, 70-74 => B, 75-79 => B+, 80-100 => A  
     
   * `String getCourseName()` returns the course name of this `Grader` object.
The `Grader` class must consist of at least two attributes as follows.
   * `String coureName` 
   * `ArrayList<String> scores`
   
2. Write a Java class named `GraderTest` to test the class `Grader`.
   * Receive the name of an input file from a command-line argument.
   * Use a `java.util.Scanner` class to read from the input file.
     * Each line in the input file contains scores for a course.
       The line format is 
     ```
       <COURSE_NAME>,<NUMBER_OF_STUDENT>,score1,score2,score3,...
     ```
       For example, the following line represents a course named `Python` for `5` students. 
       And the scores of the students are: 12, 45, 88.5, 64, 51.5
     ```
       Python,5,12,45,88.5,64,51.5
     ```
   * Create a `Grader` object for each course read from the input file.
   * Display the mean score, the number of scores below mean, the number of scores above mean, 
     and a grade distribution in the following format.
     ```
        <No>. <COURSE_NAME> 
        mean = <mean>, below mean = <below_mean>, above mean = <above mean>
        Grades: A <gradeA>, B+ <gradeBPlus>, B <gradeB>, C+ <gradeCPlus>, C <gradeC>, D+ <gradeDPlus>, D <gradeD>, F <gradeF>           
     ```  

#### Example Run 1
```
# file: scores.txt
Python,5,12,45,88.5,64,51.5
Java,2,80,75
```
```
$ java GraderTest scores.txt   
1. Python
mean = 52.20, below mean = 3, above mean = 2
Grades: A 1, B+ 0, C+ 0, C 1, D+ 0, D 1, F 2
2. Java
mean = 77.50, below mean = 1, above mean = 1
Grades: A 1, B+ 1, C+ 0, C 0, D+ 0, D 0, F 2
```