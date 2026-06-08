
package June;


public class Employee {
    
    int emId;
    String name;
    String department;
    double basicSalary;
    
    Employee(int emId,String name,String department,double basicSalery){
     this.emId=emId;
     this.name=name;
     this.department=department;
     this.basicSalary=basicSalery;    
     }  
     double calculateNetSalery(){
     double hra=basicSalary * 0.20;
     double da=basicSalary * 0.10;
     double pf=basicSalary * 0.05;
     
     return basicSalary+hra+da-pf;
     }
     void display(){
         System.out.println(emId + " " + name + " " + department + " " + basicSalary);
     }
    }
