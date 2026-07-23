
package MySqlPratice;

import java.sql.*;

public class Service {
   Dao d = new Dao();

    // Insert
    public void insertservice(Student s)
            throws ClassNotFoundException, SQLException {

        d.insertdao(s);

    }

    // Display
    public void displayservice()
            throws ClassNotFoundException, SQLException {

        d.displaydao();

    }

    // Update
    public void updateservice(int id, String name)
            throws ClassNotFoundException, SQLException {

        d.updatedao(id, name);

    }

    // Delete
    public void deleteservice(int id)
            throws ClassNotFoundException, SQLException {

        d.deletedao(id);

    }

    // Search
    public void searchservice(String email)
            throws ClassNotFoundException, SQLException {

        d.searchdao(email);

    }  
}
