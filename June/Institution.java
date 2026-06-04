
package June;

import java.util.Scanner;


public class Institution {
 
    String institutionName="ABC Insitution";
    
    
    class Student{
    String studentName;
    int rollNo;
    int[] marks;
    double average;
    String grade;
           
    Scanner sc=new Scanner(System.in);
    int sum=0;
    void addStudent(){
        sc.nextLine();
        
        System.out.println("Enter Student Name: ");
        studentName=sc.nextLine();
        
        System.out.println("Ente Roll No: ");
        rollNo=sc.nextInt();
        
        System.out.println("Enter Number of Subjects: ");
        int n=sc.nextInt();
        
        marks=new int[n];
    
    }
    void addMarks(){
        System.out.println("Enter Marks: ");
        for (int j = 0; j < marks.length; j++) {
            marks[j]=sc.nextInt();
            sum += marks[j];
        }
    }
    
    void calculateGrade(){
        
    average=(double)sum/marks.length;
        
        if(average>=90){
           grade="A"; 
        }
        else if(average>=75){
          grade="B";
        }
        else if(average>=50){
          grade="C";
        }
        else {
          grade="Fail";
        }
    }
    
    void display(){
    System.out.println("Institution Name: " +institutionName );
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll No: " + rollNo);

        System.out.println("Marks: ");
        for (int i=0;i< marks.length;i++) {
            System.out.print(marks[i] + " ");
        }
            

        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    
    }
     
    } 
}

