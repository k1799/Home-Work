
package June;


public class MainMessageLogger {
    public static void main(String[] args) {
       
       Thread t1=new Thread(()->{
        MessageLogger logger=MessageLogger.getInstance();
        logger.logMessage("Hello From Thread1");
       });
       
       Thread t2=new Thread(()->{
        MessageLogger logger=MessageLogger.getInstance();
        logger.logMessage("Hello From Thread2");
       });
       
       t1.start();
       t2.start();
    }
}
