
package MySqlPratice;

import java.util.Scanner;

import java.sql.*;

public class Main {
  

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Scanner sc = new Scanner(System.in);
        Scanner se = new Scanner(System.in);

        Service service = new Service();

        int choice;

        do {

            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Search");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    Student s = new Student();

                    System.out.print("Enter Name : ");
                    s.setName(se.nextLine());

                    System.out.print("Enter Email : ");
                    s.setEmail(se.nextLine());

                    System.out.print("Enter Course : ");
                    s.setCourse(se.nextLine());

                    System.out.print("Enter Fee : ");
                    s.setFee(sc.nextDouble());

                    service.insertservice(s);

                    break;

                case 2:

                    service.displayservice();

                    break;

                case 3:

                    System.out.print("Enter ID : ");
                    int id = sc.nextInt();

                    se.nextLine();

                    System.out.print("Enter New Name : ");
                    String name = se.nextLine();

                    service.updateservice(id, name);

                    break;

                case 4:

                    System.out.print("Enter ID : ");
                    int did = sc.nextInt();

                    service.deleteservice(did);

                    break;

                case 5:

                    se.nextLine();

                    System.out.print("Enter Email : ");
                    String email = se.nextLine();

                    service.searchservice(email);

                    break;

                case 6:

                    System.out.println("Thank You...");
                    break;

                default:

                    System.out.println("Invalid Choice");

            }

        } while (choice != 6);

    }  
}
