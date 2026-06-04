
package June;

import java.util.Scanner;


public class MainShoppingCart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        ShoppingCart.Item si=new ShoppingCart().new Item();
        ShoppingCart s=new ShoppingCart();
        
        int choice;
       boolean result=true;
        do{
            System.out.println("1.Add Item");
            System.out.println("2.Update price History");
            System.out.println("3.Calculate Total Bill");
            System.out.println("4.Display Cart Details");
            System.out.println("5.Exit");
            
            System.out.println("Enter Choice");
            choice = sc.nextInt();
            
            if(choice==1){
            si.addItem();
            }
            else if(choice==2){
            si.updatePriceHistory();
            }
            else if(choice==3){
            si.calculateTotalBill();
            }
             else if(choice==4){
            si.display();
            }
             else{
                System.out.println("Exited...");
                result=false;
             }
            
        }while(result);
        
       
        
    }
  
}
