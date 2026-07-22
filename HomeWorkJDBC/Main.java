
package HomeWorkJDBC;

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
            System.out.println("5.Exit");
            
            System.out.print("Enter Choice:");
            choice = sc.nextInt();
            
            switch(choice){
            
                case 1:
                    System.out.print("Enter id : ");
                    int id = sc.nextInt();
                    
                    System.out.print("Enter name : ");
                    String name = se.nextLine();
                    
                    System.out.print("Enter Department : ");
                    String dept = se.nextLine();
                    
                    s.insertservice(id, name, dept);
                    
                    break;
                    
                case 2:
                    s.displayservice();
                    
                    break;
                    
                case 3:
                  System.out.print("Enter id : ");
                  int uid = sc.nextInt();
                    
                  System.out.print("Enter name : ");
                  String uname = se.nextLine(); 
                  
                  s.updateservice(uid,uname);
                  
                  break;
                  
                case 4:
                  System.out.print("Enter id : ");
                  int did = sc.nextInt();
                  
                  s.deleteservice(did);
                  
                  break;
                  
                case 5:
                    System.out.println("Exited");
            }
            
        }while(choice!=5);
    }
 
}
