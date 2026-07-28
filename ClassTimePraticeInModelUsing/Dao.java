/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassTimePraticeInModelUsing;

import java.sql.*;

public class Dao {
   
    public Connection connect() throws ClassNotFoundException, SQLException{
     Class.forName("org.postgresql.Driver");
     Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Pratice","postgres","kannan");
    return c;
    }
    
    public void insert(Model m) throws ClassNotFoundException, SQLException{
    Connection con = connect();
    PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
    ps.setInt(1,m.getId());
    ps.setString(2,m.getName());
    ps.setInt(3,m.getAge());
    ps.setLong(4,m.getPhonenumber());
    int rs = ps.executeUpdate();
    if(rs>0){
        System.out.println("Inserted");
    }
    else{
        System.out.println("Not Inserted");
    }
    }
    
    public void update(Model m) throws ClassNotFoundException, SQLException{
    Connection c = connect();
    PreparedStatement p = c.prepareStatement("update employee set name=? where id=?");
    p.setString(1,m.getName());
    p.setInt(2,m.getId());
   int rs = p.executeUpdate();
   if(rs>0){
        System.out.println("updated");
    }
    else{
        System.out.println("Not updated");
    }
    }
    
    public void display() throws ClassNotFoundException, SQLException {

    Connection con = connect();

    PreparedStatement ps = con.prepareStatement("select * from employee");

    ResultSet rs = ps.executeQuery();

    while(rs.next()){

        System.out.println("ID : " + rs.getInt("id"));
        System.out.println("Name : " + rs.getString("name"));
        System.out.println("Age : " + rs.getInt("age"));
        System.out.println("Phone Number : " + rs.getLong("phone"));
        System.out.println("------------------------");
    }

}
}
