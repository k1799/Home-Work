
package Date25th.May;

public class VehicleManagent {
    public static void main(String[] args) {
        System.out.println("Vehicle Management System");
        CarDetail c=new CarDetail("Toyota",2020,7);
        MotorCycle m=new MotorCycle("Yamaha",2026,"Sport");
        c.display();
        m.display();
    }
}
