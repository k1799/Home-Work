
package June;

import java.util.Scanner;


public class MainAtmSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Atm atm=new Atm();
        
        while(true){
            System.out.println("1.Withdraw");
            System.out.println("2.Check Balance");
            System.out.println("3.Exit");
            System.out.println("Enter Choice");
            int choice=sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter Amount");
                    atm.withdraw(sc.nextDouble());
                    break;
                    
                case 2:
                    atm.checkBalance();
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
