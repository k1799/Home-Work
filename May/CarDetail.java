
package Date25th.May;


public class CarDetail extends Vehicle {
    int seats;
     CarDetail(String brand, int year, int seats) {
        super(brand, year);
        this.seats=seats;
    }

    @Override
    void display() {
        super.display(); 
        System.out.println("No Of Seats :"+seats);
    }
    
}
