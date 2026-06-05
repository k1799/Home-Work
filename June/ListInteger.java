
package June;

import java.util.ArrayList;
import java.util.List;


public class ListInteger {
 
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        
        //Add 5 Elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        //insert element at intex 2
        list.add(2,25);
        
        //Remove element by value
        list.remove(Integer.valueOf(40));
        
        //Update Element at index 1
        list.set(1,5);
        
        //Traverse and print element
        for(Integer num : list){
            System.out.println(num);
        }
    }
}
