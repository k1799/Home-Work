
package MySqlPratice;

import java.sql.*;

public class Database {
    public Connection connect() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Pratice",
                "root",
                "Kannan@1799");

        return c;
    }
}
