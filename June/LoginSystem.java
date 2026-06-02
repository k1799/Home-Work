
package June;

import java.util.Scanner;


public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String username="Kannan";
        String password="1999";
        
        int attempts=3;
        
        while(true){
            System.out.println("1.Login");
            System.out.println("2.Exit");
            System.out.print("Enter Choice: ");
            int choice=sc.nextInt();
            
            switch (choice){
                case 1:
                    try{
                    while(attempts>0){
                        System.out.print("Username: ");
                        String u=sc.next();
                        
                        System.out.print("password:");
                        String p=sc.next();
                        
                        if(u.equals(username) && p.equals(password)){
                            System.out.println("Login Successfully");
                            return;
                        }
                        else{
                        attempts--;
                            System.out.println("Invalid Credentials");
                            System.out.println("Remaining Attempts: "+attempts);
                        }
                        if(attempts==0){
                        throw new AccountLockedException("Account Locked");
                        }
                    }
                    }
                    catch(AccountLockedException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Exited"); 
                    System.exit(0);
                default:
                    System.out.println("Ivalid Choice");
            }
                
        }
    }
    }

