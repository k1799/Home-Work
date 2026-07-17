/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supermarket;

import java.util.Scanner;

/**
 *
 * @author KANNAN G
 */
public class Main {
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductService service = new ProductService();

        while (true) {

            System.out.println("\n===== Supermarket Management System =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Purchase Product");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Stock: ");
                    int stock = sc.nextInt();

                    product product = new product(id, name, category, price, stock);

                    service.addProduct(product);
                    break;

                case 2:

                    service.viewProducts();
                    break;

                case 3:

                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Product Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter New Category: ");
                    category = sc.nextLine();

                    System.out.print("Enter New Price: ");
                    price = sc.nextDouble();

                    System.out.print("Enter New Stock: ");
                    stock = sc.nextInt();

                    product = new product(id, name, category, price, stock);

                    service.updateProduct(product);
                    break;

                case 4:

                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();

                    service.deleteProduct(id);
                    break;

                case 5:

                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    service.purchaseProduct(id, quantity);
                    break;

                case 6:

                    System.out.println("Thank You...");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");

            }

        }

    }   
}
