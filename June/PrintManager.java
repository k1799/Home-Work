
package June;


public class PrintManager {
  
    private static PrintManager obj;
    
    private PrintManager(){
    }
    
    public static PrintManager getInstance(){
    if(obj==null){
    obj=new PrintManager();
    }
    return obj;
    }
    public void print(){
        System.out.println("Printing Document....");
    }
}
