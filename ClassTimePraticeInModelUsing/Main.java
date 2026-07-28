/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassTimePraticeInModelUsing;

import java.sql.SQLException;
import java.util.Scanner;

// ithu sir model vachu eppadi database ku anupurathunu and database la irrunthu inga eppadi print pananum nu sonaru and model ethuku na parameter narya vangama ora clas kula vaika
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Scanner sc = new Scanner(System.in);
        //Scanner se = new Scanner(System.in);
        
//        System.out.print("Enter id : ");
//        int id = sc.nextInt();
//        System.out.print("Enter name : ");
//        String name = se.nextLine();
//        System.out.print("Enter age : ");
//        int age = sc.nextInt();
//        System.out.print("Enter phone : ");
//        long phone = sc.nextLong();
        
        //Model m = new Model(id,name,age,phone);
        //Model m = new Model(id,name);
        
        Service s = new Service();
        //s.insert(m);
        //s.update(m);
        s.display();//ithula display chatgpt sonathu
    }
  
}
