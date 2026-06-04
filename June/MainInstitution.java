
package June;

import java.util.Scanner;


public class MainInstitution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Institution.Student is=new Institution().new Student();
        Institution i=new Institution();
        
        int choice;
        
        do{
            System.out.println("1. Add Student");
            System.out.println("2. Add Marks");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Display Student Details");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    is.addStudent();
                    break;
                case 2:
                    is.addMarks();
                    break;
                case 3:
                    is.calculateGrade();
                    break;
                case 4:
                    is.display();
                    break;
                case 5:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid Choice");
            
            }
        }while(choice!=5);
        
       
        
         
    }
}
