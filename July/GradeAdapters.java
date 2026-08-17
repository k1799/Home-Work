/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package July;

/**
 *
 * @author KANNAN G
 */
public class GradeAdapters implements GradeSystems{
    
    private OldMarkSystem oldSystem;

    public GradeAdapters(OldMarkSystem oldSystem) {
        this.oldSystem = oldSystem;
    }
    
    @Override
    public String getgrade() {
    int total = oldSystem.gettotalmarks();
    if(total>=270){
     return "A";
    }
    else if(total>=240){
     return "B";
    }
    else if(total>=210){
     return "C";
    }
    else if(total>=180){
     return "D";
     }
    else {
    return "F";
    }
    }
    
}
