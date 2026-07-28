/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassTimePraticeInModelUsing;

import java.sql.SQLException;

/**
 *
 * @author KANNAN G
 */
public class Service {
    Dao d = new Dao();
    public void insert(Model m) throws ClassNotFoundException, SQLException{
    d.insert(m);
    }
    public void update(Model m) throws ClassNotFoundException, SQLException{
    d.update(m);
    }
     public void display() throws ClassNotFoundException, SQLException{
    d.display();
    }
}
