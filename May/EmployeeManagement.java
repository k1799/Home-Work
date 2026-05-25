
package Date25th.May;


public class EmployeeManagement {
    public static void main(String[] args) {
        System.out.println("Employee Management System");
        EmployeeDetail e=new EmployeeDetail("Alice",50000);
        ManagerDetail m=new ManagerDetail("Bob",80000,"IT");
             e.display();
             System.out.println("");
             m.display();
             
    }
}
