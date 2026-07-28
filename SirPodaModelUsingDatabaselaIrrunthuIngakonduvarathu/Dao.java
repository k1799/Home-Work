
package SirPodaModelUsingDatabaselaIrrunthuIngakonduvarathu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;


public class Dao {
 public Connection connect() throws ClassNotFoundException, SQLException{
     Class.forName("org.postgresql.Driver");
     Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Pratice","postgres","kannan");
    return c;
    }
 
    public ArrayList<Model> view() throws ClassNotFoundException, SQLException
    {

        ArrayList <Model> a=new ArrayList();
         Connection con=  connect();
         PreparedStatement ps= con.prepareStatement("select * from employee");
          ResultSet rs=ps.executeQuery();
          while(rs.next())
          {
           Model m=new Model();
          m.setId(rs.getInt("id"));
          m.setName(rs.getString(2));
          m.setAge(rs.getInt(3));
          m.setPhonenumber(rs.getLong(4));
          a.add(m);
          }
          return a;
    }
}
