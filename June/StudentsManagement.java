
package June;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentsManagement {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Students> als=new ArrayList<>();
        
        while(true){
            System.out.println("1.Add Student");
            System.out.println("2.View Students");
            System.out.println("3.Search Student");
            System.out.println("4.Update Marks");
            System.out.println("5.Delete Student");
            System.out.println("6.Exit");
            
            System.out.print("Enter your Choice:");
            int choice=sc.nextInt();
            
            switch(choice){
            
                case 1:
                    System.out.println("Roll No: ");
                    int roll=sc.nextInt();
                    
                    boolean exists=false;
                    for(Students s:als){
                    if(s.rollNo==roll){
                    exists=true;
                    break;
                    }
                    }
                    if(exists){
                        System.out.println("Roll Number alerady exista!");
                        break;
                    }
                    sc.nextLine();
                    System.out.println("Name: ");
                    String  name=sc.nextLine();
                    
                    System.out.println("Age: ");
                    int age=sc.nextInt();
                    
                    sc.nextLine();
                    System.out.println("Course: ");
                    String  course=sc.nextLine();
                    
                    System.out.println("Marks: ");
                    double marks=sc.nextDouble();
                    
                    als.add(new Students(roll,name,age,course,marks));
                    System.out.println("Studeny Added");
                    break;
                    
                case 2:
                    if(als.isEmpty()){
                        System.out.println("No Students Available");
                    }
                    else{
                    for(Students s: als){
                      s.display();
                    }
                    }
                    break;
                    
                case 3:
                    System.out.println("Enter Roll No: ");
                    roll=sc.nextInt();
                    
                    boolean found=false;
                    
                     for(Students s: als){
                         if(s.rollNo==roll){
                          s.display();
                          found=true;
                          break;
                         }
                    }
                     if(!found){
                         System.out.println("Student Not Found");
                     }
                     break;
                     
                case 4:
                   System.out.println("Enter Roll No: ");
                    roll=sc.nextInt();
                    
                     found=false;
                    
                    for(Students s:als){
                    if(s.rollNo==roll){
                        System.out.println("New Marks: ");
                        s.marks=sc.nextDouble();
                        System.out.println("Updated");
                        found=true;
                    }
                    }
                    if(!found){
                         System.out.println("Student Not Found");
                     }
                    break;
                    
                case 5:
                    System.out.print("Enter Roll No: ");
                     roll = sc.nextInt();
                    
                     /*ithu oru method
                     final int r=roll;
                    als.removeIf(s -> s.rollNo==r);
                    System.out.println("Deleted");*/
                     //ithu innoru method
                      found=false;
                     Students temp=null;
                     for(Students s:als){
                     if(s.rollNo==roll){
                     temp=s;
                     found=true;
                     break;
                     }
                     }
                     if(found){
                     als.remove(temp);
                         System.out.println("deleted");
                     }
                     else{
                         System.out.println("Student Not Found");
                     }
                     
                    break;
                case 6:
                    System.exit(0);
                    
                default  :
                    System.out.println("Invalid Choice! Please Enter 1 to 6");   
            }
        }
        
    }
}
