/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supermarket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAO {
   public void addProduct(product product) {

    String sql = "INSERT INTO product(id, name, category, price, stock) VALUES (?, ?, ?, ?, ?)";

    try {
        Connection con = DBconnection.getConnection();

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, product.getProductId());
        ps.setString(2, product.getProductName());
        ps.setString(3, product.getCategory());
        ps.setDouble(4, product.getPrice());
        ps.setInt(5, product.getStock());

        ps.executeUpdate();

        System.out.println("Product Added Successfully");

    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
   public void viewProducts() {

    String sql = "SELECT * FROM product";

    try {
        Connection con = DBconnection.getConnection();

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            System.out.println("Product ID : " + rs.getInt("id"));
            System.out.println("Product Name : " + rs.getString("name"));
            System.out.println("Category : " + rs.getString("category"));
            System.out.println("Price : " + rs.getDouble("price"));
            System.out.println("Stock : " + rs.getInt("stock"));
            System.out.println("-----------------------------");

        }

    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
   public void updateProduct(product product) {

    String sql = "UPDATE product SET name = ?, category = ?, price = ?, stock = ? WHERE id = ?";

    try {
        Connection con = DBconnection.getConnection();

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, product.getProductName());
        ps.setString(2, product.getCategory());
        ps.setDouble(3, product.getPrice());
        ps.setInt(4, product.getStock());
        ps.setInt(5, product.getProductId());

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("Product Updated Successfully");
        } else {
            System.out.println("Product Not Found");
        }

    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
   public void deleteProduct(int productId) {

    String sql = "DELETE FROM product WHERE id = ?";

    try {
        Connection con = DBconnection.getConnection();

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, productId);

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("Product Deleted Successfully");
        } else {
            System.out.println("Product Not Found");
        }

    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
   public void purchaseProduct(int productId, int quantity) {

    String selectQuery = "SELECT stock FROM product WHERE id = ?";
    String updateQuery = "UPDATE product SET stock = ? WHERE id = ?";

    try {
        Connection con = DBconnection.getConnection();

        // Check Product
        PreparedStatement ps1 = con.prepareStatement(selectQuery);
        ps1.setInt(1, productId);

        ResultSet rs = ps1.executeQuery();

        if (rs.next()) {

            int stock = rs.getInt("stock");

            if (stock >= quantity) {

                int remainingStock = stock - quantity;

                PreparedStatement ps2 = con.prepareStatement(updateQuery);
                ps2.setInt(1, remainingStock);
                ps2.setInt(2, productId);

                ps2.executeUpdate();

                System.out.println("Purchase Successful");
                System.out.println("Remaining Stock : " + remainingStock);

            } else {

                System.out.println("Not enough stock available");

            }

        } else {

            System.out.println("Product not found");

        }

    } catch (SQLException e) {

        System.out.println(e.getMessage());

    }

}
}
