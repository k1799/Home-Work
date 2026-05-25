
package Date25th.May;


public class ManagerDetail extends EmployeeDetail{
    String department;
     ManagerDetail(String name, double salery,String department) {
        super(name, salery);
        this.department=department;
    }
    @Override
    void display(){
        System.out.println("Employee Name:"+name);
        System.out.println("Salery Rs."+salery);
        System.out.println("Department :"+department);
    }
}
