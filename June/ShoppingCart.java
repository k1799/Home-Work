
package June;

import java.util.Scanner;

public class ShoppingCart {
    String cartOwnerName;
    
    public class Item{
    String itemName;
    int quantity;
    double[] priceHistory;
    double latestPrice;
    double totalBill;
    
    Scanner sc=new Scanner(System.in);

    void addItem(){
        sc.nextLine();

        System.out.println("Enter Cart Owner Name: ");
        cartOwnerName = sc.nextLine();
        
        System.out.println("Enter Item Name: ");
        itemName = sc.nextLine();
        
        System.out.println("Enter Quatity: ");
        quantity = sc.nextInt();
        
        System.out.println("Enter Number of Price Updates: ");
        int n = sc.nextInt();
        
        priceHistory = new double[n];
    }
    
    void updatePriceHistory(){
    
        System.out.println("Enter Price");
        
        for (int i = 0; i < priceHistory.length; i++) {
            priceHistory[i] = sc.nextDouble();
        }
        latestPrice = priceHistory[priceHistory.length-1];
    }
    
    void calculateTotalBill(){
    
        totalBill = latestPrice * quantity;
    }
    
     void display() {
            System.out.println("\nCart Owner: " + cartOwnerName);
            System.out.println("Item Name: " + itemName);
            System.out.println("Quantity: " + quantity);

            System.out.print("Price History: ");
            for (int i=0;i<priceHistory.length;i++) {
                System.out.print(priceHistory[i] + " ");
            }

            System.out.println("\nLatest Price: " + latestPrice);
            System.out.println("Total Bill: " + totalBill);
        }
    }
}
