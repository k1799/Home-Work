
package Date25th.May;


public class EmployeeDetail {
   String name;
   double salery;
   EmployeeDetail(String name,double salery){
         this.name=name;
         this.salery=salery;
   }

    EmployeeDetail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    void display(){
        System.out.println("Employee Name:"+name);
        System.out.println("Salery Rs."+salery);
    }
   
}
