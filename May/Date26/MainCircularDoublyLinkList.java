
package May.Date26;


public class MainCircularDoublyLinkList {
    public static void main(String[] args) {
        CircularDoublyLinkList c=new CircularDoublyLinkList();
        //insert at head
        c.insertHead(20);
        c.insertHead(10);
        //insert at tail
        c.insertTail(40);
        //insert at position 3
        c.insertAtPosition(30,3);
        //display
        c.display();
        
    }
  
}
