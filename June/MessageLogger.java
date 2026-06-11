
package June;


public class MessageLogger {
  private static MessageLogger obj;
  
  private MessageLogger(){
  }
  
  public static synchronized MessageLogger getInstance(){
  if(obj==null){
  obj=new MessageLogger();
  }
  return obj;
  }
  public void logMessage(String msg){
      System.out.println(Thread.currentThread().getName()+" : "+msg);
  }
}
