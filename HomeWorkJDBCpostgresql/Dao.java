
package HomeWorkJDBCpostgresql;

import java.sql.*;


public class Dao {
    
    public Connection connect() throws ClassNotFoundException, SQLException{
    Class.forName("org.postgresql.Driver");
    Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Pratice","postgres","kannan");
    return c;
    }
    
    public void insertdao(int id,String name,String dept) throws ClassNotFoundException, SQLException{
    Connection c = connect();
    PreparedStatement ps = c.prepareStatement("insert into students values(?,?,?)");
    ps.setInt(1, id);
    ps.setString(2, name);
    ps.setString(3, dept);
    
    int res = ps.executeUpdate();
    
    if(res>0){
        System.out.println("Inserted Succecfuly");
    }
    else{
        System.out.println("Insert Failled");
    }
    c.close();
    }
    
    public void displaydao() throws ClassNotFoundException, SQLException{
    Connection c = connect();
    Statement s = c.createStatement();
    ResultSet r = s.executeQuery("select * from students");
    
        System.out.println("--------------------------");
        System.out.println("ID NAME DEPARTMENT"); 
        System.out.println("--------------------------");
        
        while(r.next()){
            System.out.println(r.getInt ("sid") + " " + r.getString ("sname") + " " + r.getString("department"));
        }
        r.close();
        s.close();
        c.close();
    }
    
    public void updatedao(int id,String name) throws ClassNotFoundException, SQLException{
    Connection c = connect();
    PreparedStatement ps = c.prepareStatement("update students set sname=? where sid=?");
    ps.setString(1,name);
    ps.setInt(2, id);
    int res = ps.executeUpdate();
    
    if(res>0){
        System.out.println("Inserted Succecfuly");
    }
    else{
        System.out.println("Insert Failled");
    }
    c.close();
    }
    
    public void deletedao(int id) throws ClassNotFoundException, SQLException{
    Connection c = connect();
    PreparedStatement ps = c.prepareStatement("delete from students where sid=?");
    ps.setInt(1, id);
    int res = ps.executeUpdate();
    
    if(res>0){
        System.out.println("Inserted Succecfuly");
    }
    else{
        System.out.println("Insert Failled");
    }
    c.close();
    }
}
