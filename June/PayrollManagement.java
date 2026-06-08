
package June;

import java.util.ArrayList;
import java.util.Scanner;


public class PayrollManagement {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Employee> employees=new ArrayList<>();
        
        while(true){
            System.out.println("1.Add Employee");
            System.out.println("2.View Employees");
            System.out.println("3.Search Employee");
            System.out.println("4.Update Salery");
            System.out.println("5.Calculate Net Salery");
            System.out.println("6.Delete Employee");
            System.out.println("7.Exit");
            
            System.out.println("Enter Your Choice");
            int choice=sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.print("Employee Id: ");
                    int id=sc.nextInt();
                    
                    boolean exists=false;
                    for(Employee e:employees){
                    if(e.emId==id){
                    exists=true;
                    break;
                    }
                    }
                    if(exists){
                        System.out.println("Employee Id Alerady Exists");
                        break;
                    }
                    
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name=sc.nextLine();
                    
                    System.out.print("Department: ");
                    String dept=sc.nextLine();
                    
                    System.out.print("Basic Salary:");
                    double salary=sc.nextDouble();
                    
                    employees.add(new Employee(id,name,dept,salary));
                    System.out.println("Employee Added");
                    break;
                case 2:
                    if(employees.isEmpty()){
                        System.out.println("Employee Not Available");
                    }
                    else{
                    for(Employee e:employees){
                    e.display();
                    }
                    }
                    break;
                case 3:
                    System.out.println("Employee Id");
                    id=sc.nextInt();
                    
                    boolean found=false;
                    for(Employee e:employees){
                    if(e.emId==id){
                     e.display();
                     found=true;
                     break;
                    }
                    }
                    if(!found){
                        System.out.println("Employee Not Found");
                    }
                    break;
                case 4:
                    System.out.println("Employee Id");
                    id=sc.nextInt();
                    
                    found=false;
                    for(Employee e:employees){ 
                    if(e.emId==id){
                        found=true;
                        System.out.println("New Salary");
                        e.basicSalary=sc.nextDouble();
                        System.out.println("Updated");
                    }
                    }
                    if(!found){
                        System.out.println("Employee Not Found");
                    }
                    break;
                case 5:
                   System.out.println("Employee Id");
                    id=sc.nextInt();
                    
                     found=false; 
                     for(Employee e:employees){
                     if(e.emId==id){
                         found=true;
                         System.out.println("Net Salary = "+e.calculateNetSalery());
                     }
                     }
                     if(!found){
                        System.out.println("Employee Not Found");
                    }
                     break;
                case 6:
                    System.out.println("Employee Id");
                    id=sc.nextInt();
                    
                     found=false;
                     /*ithu lamda method
                     employees.removeIf(e->e.emId==id);
                     System.out.println("Deleted");*/
                     
                     //ithu innoru mathod
                    Employee temp=null;
                     for(Employee e:employees){
                     if(e.emId==id){
                     temp=e;
                     found=true;
                     break;
                     }
                     }
                     if(found){
                     employees.remove(temp);
                         System.out.println("deleted");
                     }
                     else{
                         System.out.println("Employee Not Found");
                     }
                     
                    break; 
                case 7:
                    System.exit(0);
                default :
                    System.out.println("Invalid Choice! Please Enter 1 to 7");
       
            }
        }
    }
}
