
package HomeWorkJDBCpostgresql;

import java.util.Scanner;
import java.sql.*;

public class Menu {
 

    Scanner sc = new Scanner(System.in);
    Service s = new Service();

    public void start() throws ClassNotFoundException, SQLException {

        int choice;

        do {

            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch(choice){

                case 1:
                    insertStudent();
                    break;

                case 2:
                    displayStudent();
                    break;

                case 3:
                    updateStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice Choose 1 to 5");
            }

        }while(choice!=5);

    } 
    public void insertStudent() throws ClassNotFoundException, SQLException {

    System.out.print("Enter Id : ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Name : ");
    String name = sc.nextLine();

    System.out.print("Enter Department : ");
    String dept = sc.nextLine();

    s.insertservice(id,name,dept);
   }
    
    public void displayStudent() throws ClassNotFoundException, SQLException {

    s.displayservice();

   }
    
    public void updateStudent() throws ClassNotFoundException, SQLException {

    System.out.print("Enter Id : ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter New Name : ");
    String name = sc.nextLine();

    s.updateservice(id,name);

   }
    
    public void deleteStudent() throws ClassNotFoundException, SQLException {

    System.out.print("Enter Id : ");
    int id = sc.nextInt();

    s.deleteservice(id);

   }
}
