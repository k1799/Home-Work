
package MySqlHomeWork;

import java.sql.SQLException;


public class Service {
    Dao d = new Dao();
    public void insertservice(String name,String email,String course,double fees) throws ClassNotFoundException, SQLException{
    d.insertdao(name,email,course,fees);
    }
    
    public void displayservice() throws ClassNotFoundException, SQLException{
    d.displaydao();
    }
    
    public void updateservice(int id,String name,String email,String course,double fees) throws ClassNotFoundException, SQLException{
    d.updatedao(id, name,email,course,fees);
    }
    
    public void deleteservice(int id) throws ClassNotFoundException, SQLException{
    d.deletedao(id);
    }
    
    public void searchservice(String email)throws ClassNotFoundException, SQLException {

    d.searchdao(email);
    }
}
