
package HomeWorkJDBCpostgresql;

import java.sql.SQLException;


public class Service {
    Dao d = new Dao();
    
    public void insertservice(int id,String name,String dept) throws ClassNotFoundException, SQLException{
    d.insertdao(id, name, dept);
    }
    
    public void displayservice() throws ClassNotFoundException, SQLException{
    d.displaydao();
    }
    
    public void updateservice(int id,String name) throws ClassNotFoundException, SQLException{
    d.updatedao(id, name);
    }
    
    public void deleteservice(int id) throws ClassNotFoundException, SQLException{
    d.deletedao(id);
    }
}
