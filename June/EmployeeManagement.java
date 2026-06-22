
package June;

import java.util.Scanner;


public class EmployeeManagement {
 
    Scanner sc = new Scanner(System.in);
    Scanner se = new Scanner(System.in);
    
    Emplooyee e[] = new Emplooyee[100];//Maximum 100 employees
    int count = 0;//numbers of employee added
    
    public static void main(String[] args) {
     EmployeeManagement e = new EmployeeManagement();
     e.menu();
    }
    
    void menu(){
        boolean result = true;
        do{
            System.out.println("---Employee Management System---");
            System.out.println("1.Add Employee Details");
            System.out.println("2.View Employee Details");
            System.out.println("3.Search Employee Details");
            System.out.println("4.Exit");

            System.out.println("Enter Your Choice");
            int choice = sc.nextInt();
           
        switch (choice) {
            case 1:
                add();
                break;
                
            case 2:
                view();
                break;
                
            case 3:
                search();
                break;
               
            case 4:
                System.out.println("Exited....");
                result = false;
                break;
                
            default:
                System.out.println("Invalid Choice Choose 1 to 4");
        }
        
      }while(result);
    }
    
    void add(){
        
        if(count == e.length){
            System.out.println("Employee Storage Full");
            return;
        }
        System.out.println("Enter Employee Id");
        int id = sc.nextInt();
        
        //Duplicate Id Check
        for (int i = 0; i < count; i++) {
            if(e[i].id == id){
                System.out.println("Employee Id Already Exists!");
                return;
            }
        }
        
        System.out.println("Enter Employee Name");
        String name = se.nextLine();
        
        System.out.println("Enter Employee Department");
        String department = se.nextLine();
        
        e[count] = new Emplooyee(id, name, department);
        count++;
        System.out.println("Employee Added Successfully");

    }
    
    void view(){
       
       if(count == 0){
           System.out.println("No Employee found!");
       }
        System.out.println("---Employee Details---");
        for (int i = 0; i < count; i++) {
            System.out.println("Employee Id : " + e[i].id);
            System.out.println("Employee Name : " + e[i].name);
            System.out.println("Employee Department : " + e[i].department);
            
        }  
    }
    
    void search(){
        if(count == 0){
           System.out.println("No Employee found!");
       }
        System.out.println("Enter Searching Employee Id");
        int searchId = sc.nextInt();
        
    boolean found = false;
        for (int i = 0; i < count; i++) {
            if(e[i].id == searchId){
            System.out.println("Employee Id : " + e[i].id);
            System.out.println("Employee Name : " + e[i].name);
            System.out.println("Employee Department : " + e[i].department);
            found = true;
            break;
            }
        }
    if(!found){
            System.out.println("Employee Not Found");
        }
    }
}
