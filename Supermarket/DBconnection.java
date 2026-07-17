/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/supermarket";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "your_password";

    public static Connection getConnection() {

        Connection con = null;

        try {
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Database Connected Successfully...");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return con;
    } 
}
