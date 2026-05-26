
package Date25th.May;


public class MotorCycle extends Vehicle {
    String type;

    public MotorCycle(String brand, int year,String type) {
        super(brand, year);
        this.type=type;
    }

    @Override
    void display() {
        super.display(); 
        System.out.println("Type :"+type);
    }
   
}
