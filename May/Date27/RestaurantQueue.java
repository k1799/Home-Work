
package May.Date27;

import java.util.LinkedList;
import java.util.Queue;


public class RestaurantQueue {
    
    Queue<String> orders=new LinkedList<>();
    
    //Add order
    void add(String order){
    orders.offer(order);
        System.out.println("Order added: "+order);
    }
    
    //Serve order
    void serveorder(){
    if(orders.isEmpty()){
        System.out.println("No order to Serve");
    }
    else{
        System.out.println("Served order: "+orders.poll());
    }
    }
    
    //View next order
    void viewnextorder(){
    if(orders.isEmpty()){
        System.out.println("No pending orders");
    }
    else{
        System.out.println("Next order: "+orders.peek());
    }
    }
    
    //Display all orders
    void displayorders(){
    if(orders.isEmpty()){
        System.out.println("No pending orders");
    }
    else{
        System.out.println("Pending orders: "+orders);
    }
    }
}
