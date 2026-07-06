
package June;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class BioData {
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        Scanner se = new Scanner(System.in);
        
        try{
        
        //personal Details
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            
            System.out.println("Enter Age: ");
            int age = se.nextInt();
            
            System.out.println("Genter: ");
            String gender = sc.nextLine();
            
            System.out.println("Enter Date of Birth(DD-MM-YY): ");
            String dob = sc.nextLine();
            
            System.out.println("Enter Blood Group: ");
            String bloodgroup = sc.nextLine();
            
            //Education Details
            System.out.println("Enter Your Qualification: ");
            String qualification = sc.nextLine();
            
            System.out.println("Enter Your College Name: ");
            String college = sc.nextLine();
            
            System.out.println("Enter Persentage/CGPA: ");
            String cgpa = sc.nextLine();
            
            //Professional Details
            System.out.println("Enter Skills: ");
            String skills = sc.nextLine();
            
            System.out.println("Enter Experience (in Years): ");
            String Experience = sc.nextLine();
            
            //Contact Details
            System.out.println("Enter Phone Number: ");
            String phone = sc.nextLine();
            
            System.out.println("Enter Your Email Id: ");
            String email = sc.nextLine();
            
            System.out.println("Enter Your Address: ");
            String address = sc.nextLine();
            
            //Family Details
            System.out.println("Enter Father Name: ");
            String fathername = sc.nextLine();
            
            System.out.println("Enter Mother Name: ");
            String mothername = sc.nextLine();
            
            //Create File if it does not exist
            File file = new File("biodata.txt");
            
            if(!file.exists()){
            file.createNewFile();
            }
            
            //Write data to file
            FileWriter fw =new FileWriter(file); 
            
            fw.write("===========BIO DATA ============\n\n");
            
            fw.write("Personal Details\n");
            fw.write("Name        : " + name + "\n");
            fw.write("Age         : " + age + "\n");
            fw.write("Gender      : " + gender + "\n");
            fw.write("DOB         : " + dob + "\n");
            fw.write("Blood Group : " + bloodgroup + "\n");
            
            fw.write("Education\n");
            fw.write("Qualification      : " + qualification + "\n");
            fw.write("College            : " + college + "\n");
            fw.write("CGPA               : " + cgpa + "\n");
            
            fw.write("Professional Details\n");
            fw.write("Skills      : " + skills + "\n");
            fw.write("Experience  : " + Experience + "\n");
            
            fw.write("Contact Details\n");
            fw.write("Phone       : " + phone + "\n");
            fw.write("Email       : " + email + "\n");
            fw.write("Address     : " + address + "\n");
            
            fw.write("Familly Details\n");
            fw.write("Father Name    : " + fathername + "\n");
            fw.write("Mother Name    : " + mothername + "\n");
            
            fw.write("========================================");
            
            fw.close();
            
            System.out.println("\nBoi Data Saved Successfully in biodata.txt");
            
        }
        catch(IOException e){
            System.out.println("Erroe: " + e.getMessage());
        }
        sc.close();
    }
}
