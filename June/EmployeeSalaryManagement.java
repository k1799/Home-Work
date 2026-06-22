
package June;

import java.util.Scanner;


public class EmployeeSalaryManagement {
    
    Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        EmployeeSalaryManagement e=new EmployeeSalaryManagement();
        e.menu();
    }
      void menu(){  
        
        System.out.print("Enter number of employees: ");
        int n=sc.nextInt();
        int [] emId = new int[n];
        double[] salary = new double[n];
        int choice;
        do
        {
          System.out.println("1.Add Employee");
          System.out.println("2.Display");
          System.out.println("3.Search Employee");
          System.out.println("4.Highest Salary");
          System.out.println("5.Lowest Salary");
          System.out.println("6.Average Salary");
          System.out.println("7.Sort Salary");
          System.out.println("8.Exit");
        
          System.out.println("Enter Your Choice");
          choice=sc.nextInt();
          
          switch(choice){
              case 1:
                 addEmployee(emId,salary,n); 
                 break;
              case 2:
                  display(emId, salary, n);
                  break;
              case 3:
                  searchEmployee(emId, salary, n);
                  break;
              case 4:
                  highestSalary(emId, salary, n);
                  break;
              case 5:
                  lowestSalary(emId, salary, n);
                  break;
              case 6:
                  average(emId, salary, n);
                  break;
              case 7:
                  sortDescenting(emId, salary, n);
                  break;
              case 8:
                  System.out.println("Exited.....");
                  break;
              default :
                  System.out.println("Invalid choice choose 1 to 8");
                
          }
        }while(choice!=8);
      }
        
        //Input
        void addEmployee(int emId[],double salary[],int n){
           
        double sum = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Employee "+ (i + 1));
            
            System.out.println("Enter Employee Id: ");
             emId[i] = sc.nextInt();
            
            System.out.println("Enter Salary: ");
            salary[i] = sc.nextDouble();
            
            sum = sum + salary[i];
        }
        }
        
        //Display
        void display(int emId[],double salary[],int n){
        System.out.println("Employee Details");
        System.out.println("------------------");
        System.out.println("ID\tSalary");
        
        for (int i = 0; i < n; i++) {
            System.out.println(emId[i] + "\t" + salary[i]);
        }
        }
        
        //Highest Salary
        void highestSalary(int emId[],double salary[],int n){
        int maxIndex=0;
        
        for (int i = 0; i < n; i++) {
            if(salary[i] > salary[maxIndex]){
             maxIndex = i;   
            }
            }
           
           System.out.println("Highest Salary : " + salary[maxIndex]);
           System.out.println("Employee Id : " + emId[maxIndex]);
        }
           
           //Lowest Salary
        void lowestSalary(int emId[],double salary[],int n){
           int minIndex=0;
        
        for (int i = 0; i < n; i++) {
            if(salary[i] < salary[minIndex]){
             minIndex = i;   
            }
            }
           
           System.out.println("Loweest Salary : " + salary[minIndex]);
           System.out.println("Employee Id : " + emId[minIndex]);
        }
        
           //Average
        void average(int emId[],double salary[],int n){
            int sum=0;
            
           double avg = sum / n;
           
           System.out.println("Average Salary : " + avg);
            
           //Above 50000 Count
           int count = 0;
           
           for (int i = 0; i < n; i++) {
            if(salary[i] > 50000){
            count++;
            }
        }
           
           System.out.println("Employee earing above 50000 :" + count);
        
           //Below Average
           System.out.println("Employee below average Salary:");
           
           for (int i = 0; i < n; i++) {
            if(salary[i] < avg){
                System.out.println(emId[i] + " - " + salary[i]);
            }
        }
        }
           
           //Search Employee
        void searchEmployee(int emId[],double salary[],int n){
           System.out.println("Enter Employee Id to Search: ");
           int searchId = sc.nextInt();
           
           boolean found = false;
           
           for (int i = 0; i < n; i++) {
            if(emId[i] == searchId){
                System.out.println("Employee Found");
                System.out.println("Salary : " + salary[i]);
                found = true;
                break;
            }
        }
           if(!found){
               System.out.println("Employee Not Found");
           }
        }
        
           //Sorting Descenting
        void sortDescenting(int emId[],double salary[],int n){
           for (int i = 0; i < n - 1; i++) {
            
               for (int j = i + 1; j < n; j++) {
                   
                   if(salary[i] < salary[j]){
                   
                       double tempSalary = salary[i];
                       salary[i] = salary[j];
                       salary[j] = tempSalary;
                       
                       int tempId = emId[i];
                       emId[i] = emId[j];
                       emId[j] = tempId;
                   }
               }
        }
           
           System.out.println("Employe Sorted By Salary (Descending)");
           
           for (int i = 0; i < n; i++) {
               System.out.println(emId[i] + " - " + salary[i]);
        }
        }   
        
    }

