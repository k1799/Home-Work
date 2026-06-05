
package June;

import java.util.LinkedList;
import java.util.Queue;


public class QueueInteger {
   
    public static void main(String[] args) {
        
        Queue<Integer> que=new LinkedList<>();
        
        //Enqueue
        que.offer(10);//add and offer um same than queue/list na add use and queue matumna offer rentutula ethu vennalum use pannalam
        que.offer(20);
        que.offer(30);
        que.offer(40);
        
        //Dequeue
        System.out.println("Removed: "+que.poll());
        
        //Peek
        System.out.println("Front Element: "+que.peek());
        
        //Display
        System.out.println("Queue List: "+que);
        
        //Check empty
        System.out.println("Is Queue Empty? "+que.isEmpty());
    }
}
