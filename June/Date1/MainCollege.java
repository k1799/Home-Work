
package June.Date1;


public class MainCollege {
    public static void main(String[] args) {
        
        College c1=new College(25000);
        College c2=new College(30000);
        College c3=new College(35000);

        
        College.displayCollegeDetails();
        
        c1.displayStudentFee();
        c2.displayStudentFee();
        c3.displayStudentFee();

    }
   
}
