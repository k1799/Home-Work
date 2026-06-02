
package June;

import java.util.Scanner;


public class ATMmSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=5000;
        
         while(true){
            System.out.println("1.Withdraw");
            System.out.println("2.Check Balance");
            System.out.println("3.Exit");
            System.out.println("Enter Choice");
            int choice=sc.nextInt();
            
            switch(choice){
                case 1:
                    try{
                    System.out.println("Enter Amount");
                    double amount=sc.nextDouble();
                    if(amount>balance){
                    throw new InsufficentBalanceException("Insufficient Balance!");
                    }
                    balance-=amount;
                    System.out.println("Withdrawal Successfully");
                    }
                    catch(InsufficentBalanceException e){
                    
                        System.out.println(e.getMessage());}
                    break;
                    
                case 2:
                    System.out.println("Balance: Rs."+balance);
                    break;
                    
                case 3:
                    System.out.println("Thank You");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        
    }
 
}
