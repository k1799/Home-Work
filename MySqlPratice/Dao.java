
package MySqlPratice;

import java.sql.*;

public class Dao {
   Database db = new Database();

    // Insert
    public void insertdao(Student s)
            throws ClassNotFoundException, SQLException {

        Connection c = db.connect();

        PreparedStatement ps = c.prepareStatement(
                "INSERT INTO student(name,email,course,fee) VALUES(?,?,?,?)");

        ps.setString(1, s.getName());
        ps.setString(2, s.getEmail());
        ps.setString(3, s.getCourse());
        ps.setDouble(4, s.getFee());

        int res = ps.executeUpdate();

        if (res > 0) {
            System.out.println("Inserted Successfully");
        } else {
            System.out.println("Insert Failed");
        }

        ps.close();
        c.close();
    }

    // Display
    public void displaydao()
            throws ClassNotFoundException, SQLException {

        Connection c = db.connect();

        Statement st = c.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM student");

        System.out.println("-----------------------------------------------");
        System.out.println("ID\tNAME\tEMAIL\tCOURSE\tFEE");
        System.out.println("-----------------------------------------------");

        while (rs.next()) {

            System.out.println(
                    rs.getInt("id") + "\t"
                    + rs.getString("name") + "\t"
                    + rs.getString("email") + "\t"
                    + rs.getString("course") + "\t"
                    + rs.getDouble("fee"));

        }

        rs.close();
        st.close();
        c.close();
    }

    // Update
    public void updatedao(int id, String name)
            throws ClassNotFoundException, SQLException {

        Connection c = db.connect();

        PreparedStatement ps = c.prepareStatement(
                "UPDATE student SET name=? WHERE id=?");

        ps.setString(1, name);
        ps.setInt(2, id);

        int res = ps.executeUpdate();

        if (res > 0) {
            System.out.println("Updated Successfully");
        } else {
            System.out.println("Update Failed");
        }

        ps.close();
        c.close();
    }

    // Delete
    public void deletedao(int id)
            throws ClassNotFoundException, SQLException {

        Connection c = db.connect();

        PreparedStatement ps = c.prepareStatement(
                "DELETE FROM student WHERE id=?");

        ps.setInt(1, id);

        int res = ps.executeUpdate();

        if (res > 0) {
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("Delete Failed");
        }

        ps.close();
        c.close();
    }

    // Search
    public void searchdao(String email)
            throws ClassNotFoundException, SQLException {

        Connection c = db.connect();

        PreparedStatement ps = c.prepareStatement(
                "SELECT * FROM student WHERE email=?");

        ps.setString(1, email);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            System.out.println("\n------ Student Found ------");

            System.out.println("ID      : " + rs.getInt("id"));
            System.out.println("Name    : " + rs.getString("name"));
            System.out.println("Email   : " + rs.getString("email"));
            System.out.println("Course  : " + rs.getString("course"));
            System.out.println("Fee     : " + rs.getDouble("fee"));

        } else {

            System.out.println("Student Not Found");

        }

        rs.close();
        ps.close();
        c.close();
    }  
}
