/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supermarket;

/**
 *
 * @author KANNAN G
 */
public class ProductService {
     ProductDAO dao = new ProductDAO();

    // Add Product
    public void addProduct(product product) {

        if (product.getPrice() <= 0) {
            System.out.println("Price must be greater than 0");
            return;
        }

        if (product.getStock() < 0) {
            System.out.println("Stock cannot be negative");
            return;
        }

        dao. addProduct (product);
    }

    // View Products
    public void viewProducts() {
        dao.viewProducts();
    }

    // Update Product
    public void updateProduct(product product) {

        if (product.getPrice() <= 0) {
            System.out.println("Price must be greater than 0");
            return;
        }

        if (product.getStock() < 0) {
            System.out.println("Stock cannot be negative");
            return;
        }

        dao.updateProduct(product);
    }

    // Delete Product
    public void deleteProduct(int productId) {
        dao.deleteProduct(productId);
    }

    // Purchase Product
    public void purchaseProduct(int productId, int quantity) {

        if (quantity <= 0) {
            System.out.println("Purchase quantity must be greater than 0");
            return;
        }

        dao.purchaseProduct(productId, quantity);
    }
}
