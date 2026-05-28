
package May.Date27;

import java.util.Scanner;


public class MainRestaurant {
    public static void main(String[] args) {
        RestaurantQueue r=new RestaurantQueue();
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("-----RESTAURANT MENU----");
            System.out.println("1.Add order");
            System.out.println("2.Serve Order");
            System.out.println("3.View Next Order");
            System.out.println("4.Display All Order");
            System.out.println("5.Exit");
            
            System.out.println("Enter Choice: ");
            choice=sc.nextInt();
            sc.nextLine();//clear buffer
            
            switch(choice){
                case 1:
                    System.out.println("Enter Order: ");
                    String order=sc.nextLine();
                    r.add(order);
                    break;
                case 2:
                    r.serveorder();
                    break;
                case 3:
                    r.viewnextorder();
                    break;
                case 4:
                    r.displayorders();
                    break;
                case 5:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalied Choice!");
                    }
        }while(choice!=5);
        sc.close();
    }
 
}
