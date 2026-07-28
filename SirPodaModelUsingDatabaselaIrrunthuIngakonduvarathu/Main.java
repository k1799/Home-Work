
package SirPodaModelUsingDatabaselaIrrunthuIngakonduvarathu;

import java.sql.SQLException;
import java.util.ArrayList;

//ithula sir sona display panurathu eppadi nu.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Dao d=new Dao();
        ArrayList<Model>a=d.view();
        for(Model display:a)
        {
            System.out.println(display.getId()+" " +display.getName()+" "+display.getAge()+" "+display.getPhonenumber());
        } 
    }
  
}
