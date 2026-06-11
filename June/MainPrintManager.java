
package June;


public class MainPrintManager {
    public static void main(String[] args) {
      
        PrintManager p1=PrintManager.getInstance();
        PrintManager p2=PrintManager.getInstance();
        
        p1.print();
        p1.print();
        System.out.println("Same Object: "+(p1==p2));
    }
  
}
