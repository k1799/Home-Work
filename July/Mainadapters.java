
package July;


public class Mainadapters {
   
    public static void main(String[] args) {
        OldMarkSystem oldSystem = new OldMarkSystem();
        GradeSystems adapter = new GradeAdapters(oldSystem);
        System.out.println("Total Marks : " + oldSystem.gettotalmarks());
        System.out.println("Grade : " + adapter.getgrade());
    }
}
