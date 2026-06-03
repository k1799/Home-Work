
package June;


public class MyThread extends Thread{

    //simple extends thread used 
    /*@Override
     public void run(){
       System.out.println("Thread Is Running");
     }*/ 
    
    //Another wayitu program partha than purium ora nerathula nadakurathu therium
    
    @Override
    public void run(){
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(Thread.currentThread().getName() +" : " + i);
        }
    }
 
}
