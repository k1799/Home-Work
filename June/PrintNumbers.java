
package June;


public class PrintNumbers {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);//1seconds delay
        }
    }
  
}
