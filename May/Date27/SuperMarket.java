
package May.Date27;

import java.util.Stack;


public class SuperMarket {
   Stack<String> stack =new Stack<>();
   
//Add Item
   void add(String item){
   stack.push(item);
   System.out.println("Item added: "+item);
   }
   
   //undo last item
   void undo(){
   if(stack.isEmpty()){
       System.out.println("Stack is empty. Nonitem to remove.");
   }
   else{
       System.out.println("Removed last item: "+stack.pop());
   }
   }
   
   //view last item
   void view(){
   if(stack.isEmpty()){
       System.out.println("Stack is empty.");
   }
   else{
       System.out.println("Last scanned item: "+stack.peek());
   }
   }
   
   //Display all items
   void display() {
    if (stack.isEmpty()) {
        System.out.println("No items in the bill.");
    } else {
        System.out.println("Scanned items:");
        for (String item : stack) {
            System.out.println(item);
        }
   }
  }
}
