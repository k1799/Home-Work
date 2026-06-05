
package June;

import java.util.HashSet;
import java.util.Set;


public class SetInteger {
    
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(40);
        
        //display set
        System.out.println("Set: "+set);
        
        //Check element exit
        System.out.println("Contains 20? "+ set.containsAll(set));
        
        //Remove element
        set.remove(30);
        
        System.out.println("After Removal:");
        for(Integer num : set){
            System.out.println(num);
        }
    }
}
