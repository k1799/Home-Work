
package June.Date1;


public class College {
    
    static final String collegeName="XYZ Engineering College";
    final int registrationFee;
    static int totalStudents =0;
    
    College(int fee){
    registrationFee=fee;
    totalStudents++;
    }
    
    static void displayCollegeDetails(){
        System.out.println("College Name: "+collegeName);
        System.out.println("Total Students: "+totalStudents);
    }
    
    void displayStudentFee(){
        System.out.println("Student Registration Fee: "+registrationFee);
        
    }
}
