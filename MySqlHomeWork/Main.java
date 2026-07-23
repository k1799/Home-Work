
package MySqlHomeWork;

import java.sql.SQLException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
         Scanner sc = new Scanner(System.in);
         Scanner se = new Scanner(System.in);  
         Service s = new Service();
        int choice;
        
        do{
            System.out.println("STUDENT MENU");
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Search");
            System.out.println("6.Exit");
            
            System.out.print("Enter Choice:");
            choice = sc.nextInt();
            
            switch(choice){
            
               case 1:
                    System.out.print("Enter name : ");
                     String name = se.nextLine();
                    
                    System.out.print("Enter email : ");
                    String email = se.nextLine();
                    
                    System.out.print("Enter course : ");
                    String course = se.nextLine();
                    
                    System.out.print("Enter fee : ");
                    double fees = sc.nextDouble();
                    
                    s.insertservice(name,email,course,fees);
                    
                    break;
                    
                case 2:
                    s.displayservice();
                    
                    break;
                    
                case 3:
                  System.out.print("Enter id : ");
                  int uid = sc.nextInt();
                    
                  System.out.print("Enter name : ");
                  String uname = se.nextLine(); 
                  
                  System.out.print("Enter email : ");
                  String uemail = se.nextLine();
                    
                  System.out.print("Enter course : ");
                  String ucourse = se.nextLine();
                    
                  System.out.print("Enter fee : ");
                  double ufees = sc.nextDouble();
                  
                  s.updateservice(uid,uname,uemail,ucourse,ufees);
                  
                 break;
                  
                case 4:
                  System.out.print("Enter id : ");
                  int did = sc.nextInt();
                  
                  s.deleteservice(did);
                  
                  break;
                  
                case 5:
                    System.out.print("Enter email : ");
                    String semail = se.nextLine();
                    
                    s.searchservice(semail);

                    break;
                  
                case 6:
                    System.out.println("Exited");
                      
                 break;
                      
                default:
                    System.out.println("Invalid Choice Choose 1 to 5");
            }
            
        }while(choice!=6);
    }
}
