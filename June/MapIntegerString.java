
package June;

import java.util.HashMap;
import java.util.Map;


public class MapIntegerString {
   
    public static void main(String[] args) {
        
        Map<Integer,String> student=new HashMap<>();
        
        student.put(101,"Ganapathy");
        student.put(102,"Vijay");
        student.put(103,"Kannan");
        
        //Retrieve value
        System.out.println("Student 102: "+student.get(102));
        
        //Update value
        student.put(102,"C.M.Thiru C.Joseph Vijay");
        
        //Remove key value
        student.remove(103);
        
        /*for(Object obj : student.keySet()){
            System.out.println(obj+" -> "+student.get(obj));
        }*/
        for (Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
