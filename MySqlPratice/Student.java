
package MySqlPratice;

import java.sql.*;

public class Student {
    private int id;
    private String name;
    private String email;
    private String course;
    private double fee;

    public Student() {

    }

    public Student(int id, String name, String email, String course, double fee) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    } 
}
