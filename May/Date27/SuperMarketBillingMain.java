
package May.Date27;

import java.util.Scanner;

public class SuperMarketBillingMain {
    public static void main(String[] args) {
        SuperMarket s=new SuperMarket();
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("---- SuperMarket Billing System -----");
            System.out.println("1.Add");
            System.out.println("2.Undo");
            System.out.println("3.View");
            System.out.println("4.Display");
            System.out.println("5.Exited");
            
            System.out.println("Enter choice");
             choice=sc.nextInt();
             sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter the item name: ");
                    String item=sc.nextLine();
                    s.add(item);
                    break;
                case 2:
                    s.undo();
                    break;
                case 3:
                    s.view();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.out.println("Exited program...");
                    break;
                default:
                    System.out.println("Invalied choice!");
            }
        }while(choice!=5);
        sc.close();
    }
  
}
