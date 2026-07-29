
package July;


public class GradeAdapter implements GradeSystem{

    private OldStudentMarks oldmarks;

    public GradeAdapter(OldStudentMarks oldmarks) {
        this.oldmarks = oldmarks;
    }
    
    @Override
    public String getGrad() {
        int marks = oldmarks.getTotalMarks();
        if(marks>=90)
           return "A";
        else if(marks>=80)
            return "B";
        else if(marks>=70)
            return "C";
        else if(marks>=60)
            return "D";
        else
            return "F";
    }
    
}
