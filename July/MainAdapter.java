
package July;


public class MainAdapter {
   
    public static void main(String[] args) {
        OldStudentMarks student = new OldStudentMarks(85);
        GradeSystem adapter = new GradeAdapter(student);
        System.out.println("Total Marks : " + student.getTotalMarks());
        System.out.println("Grade : " + adapter.getGrad());
    }
}
