
package MySqlHomeWork;

import java.sql.*;

public class Dao {
    
    public Connection connect() throws ClassNotFoundException, SQLException{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pratice","root","Kannan@1799");
    return c;
    }
    
    public void insertdao(String name,String email,String course,double fees) throws ClassNotFoundException, SQLException{
    Connection c = connect();
    PreparedStatement ps = c.prepareStatement("insert into student(name,email,course,fee) values(?,?,?,?)");
    ps.setString(1, name);
    ps.setString(2, email);
    ps.setString(3, course);
    ps.setDouble(4, fees);
    
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
    ResultSet r = s.executeQuery("select * from student");
    
        System.out.println("--------------------------");
        System.out.println("ID NAME EMAIL COURSE FEES"); 
        System.out.println("--------------------------");
        
        while(r.next()){
            System.out.println(r.getInt ("id") + " " + r.getString ("name") + " " + r.getString("email") + " " + r.getString("course") + " " + r.getDouble("fee"));
        }
        r.close();
        s.close();
        c.close();
    }
    
    public void updatedao(int id,String name,String email,String course,double fees) throws ClassNotFoundException, SQLException{
    Connection c = connect();
    PreparedStatement ps = c.prepareStatement("update student set name=?,email=?,course=?,fee=? where id=?");
    ps.setString(1,name);
    ps.setString(2, email);
    ps.setString(3, course);
    ps.setDouble(4, fees);
    ps.setInt(5, id);
    
    
    int res = ps.executeUpdate();
    
    if(res>0){
        System.out.println("updated Succecfuly");
    }
    else{
        System.out.println("Insert Failled");
    }
    c.close();
    }
    
    public void deletedao(int id) throws ClassNotFoundException, SQLException{
    Connection c = connect();
    PreparedStatement ps = c.prepareStatement("delete from student where id=?");
    ps.setInt(1, id);
    int res = ps.executeUpdate();
    
    if(res>0){
        System.out.println("deleted Succecfuly");
    }
    else{
        System.out.println("delete Failled");
    }
    c.close();
    }
    
    public void searchdao(String email)
        throws ClassNotFoundException, SQLException {

    Connection c = connect();

    PreparedStatement ps = c.prepareStatement("select * from student where email=?");

    ps.setString(1, email);

    ResultSet r = ps.executeQuery();

    if (r.next()) {

        System.out.println("-----------------------------");
        System.out.println("Student Found");
        System.out.println("-----------------------------");

        System.out.println("ID      : " + r.getInt("id"));
        System.out.println("Name    : " + r.getString("name"));
        System.out.println("Email   : " + r.getString("email"));
        System.out.println("Course  : " + r.getString("course"));
        System.out.println("Fee     : " + r.getDouble("fee"));

    } else {

        System.out.println("Student Not Found");

    }

    r.close();
    ps.close();
    c.close();

}
}
