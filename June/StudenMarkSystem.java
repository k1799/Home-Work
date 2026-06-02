
package June;

import java.util.Scanner;


public class StudenMarkSystem {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int marks=-1;
        
        while(true){
            System.out.println("1.Enter Marks");
            System.out.println("2.Display Marks");
            System.out.println("3.Exit");
            System.out.println("Enter Your Choice:");
            
            int choice=sc.nextInt();
            
            switch (choice){
                case 1:
                    try{
                        System.out.print("Enter Marks:");
                        int m=sc.nextInt();
                        
                        if(m<0 || m>100){
                        throw new IllegalArgumentException("Marks Must be between 0 and 100");
                        }
                        marks=m;
                        System.out.println("Marks Stored Sucessfully");
                    }
                    catch(IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case 2:
                    if(marks==-1){
                        System.out.println("No Marks Available");
                    }
                    else{
                        System.out.println("Students Marks: "+marks);
                    }
                    break;
                    
                case 3:
                    System.out.println("Exited");
            
                default:
                System.out.println("Invalid Choice");
            }
        }
    }
}
