
package June;

import java.util.Scanner;


public class MainSmartLoginSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Login l=new Login();
        
        while(true){
            System.out.println("1.Login");
            System.out.println("2.Exit");
            System.out.print("Enter Choice: ");
            int choice=sc.nextInt();
            
            switch (choice){
                case 1:
                    while(l.attempts>0){
                    try{
                        System.out.println("Username: ");
                        String u=sc.next();
                       
                        System.out.println("Password: ");
                        String p=sc.next();
                        l.loginCheck(u,p);
                        if(u.equals("admin") && p.equals("1234")){
                          break;  
                        }
                    }
                    
                    catch(Exception e){
                        System.out.println(e.getMessage());
                        break;
                    }
                    }
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
        }
    }
}
}
