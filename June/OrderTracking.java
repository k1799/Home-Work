
package June;

import java.util.Scanner;
/*3. Order Status Tracking Use enum for order 
status (PLACED, SHIPPED, DELIVERED, CANCELLED). Menu: 
Show Order Status Check if Order is Completed Exit*/

public class OrderTracking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.println("1.Show Order Status");
            System.out.println("2.Check Completed");
            System.out.println("3.Exit");
            
            System.out.println("Enter Choice");
            int choice=sc.nextInt();
            
            switch(choice){
                case 1:
                  for(OrderStatus o:OrderStatus.values()){
                      System.out.println(o);
                  }  
                  break;
                case 2:
                    System.out.println("Enter Status: ");
                    OrderStatus status= OrderStatus.valueOf(sc.next().toUpperCase());
                    
                    if(status==OrderStatus.DELIVERED){
                        System.out.println("Order Completed");
                    }
                    else{
                        System.out.println("Order Not Completed");
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invalid Choice! Choose 1 to 3");
            }
        }
    }
}
