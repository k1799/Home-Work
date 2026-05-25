
package Date25th.May;


public class Vehicle {
    String brand;
    int year;
    Vehicle(String brand,int year){
        this.brand=brand;
        this.year=year;
    }
    void display(){
        System.out.println("Brand Name :"+brand);
        System.out.println("Year :"+year);
    }
}
