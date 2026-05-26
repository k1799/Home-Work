
package May.Date26;

public class MainDoublyLinkPositionAdd {
    public static void main(String[] args) {
        DoublyLink d=new DoublyLink();
        d.insert(10);
        d.insert(20);
        d.insert(40);
        d.insert(50);
        d.insertposition(30,3);
        d.display();
    }
 
}
