
package June;


public class MainThread {
    public static void main(String[] args) {
        
        //ithu simple easy way inthaquestion ku answer
        //write a program to create two threads and run them simultaneously.
        /*MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        //thread na enna artha ora nerathula rendum nadakum athan artham
        t1.start();
        t2.start();*/
        
        //Another way itu program partha than purium ora nerathula nadakurathu therium
         MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        
        t1.start();
        t2.start();
    }
  
}
