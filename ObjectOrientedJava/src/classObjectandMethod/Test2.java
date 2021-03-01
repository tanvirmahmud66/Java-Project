
package classObjectandMethod;

public class Test2 {

    public static void main(String[] args) {
        
        Car car = new Car();
        Bus bus = new Bus();
        
        
        car.name = "BMW";
        car.mileage = 220;
        car.passengerCap = 2;
        car.price = 1250000;
        car.display();
        
        bus.name = "Mercedes Benz";
        bus.mileage = 120;
        bus.passengerCap = 35;
        bus.price = 550000;
        bus.display();
        
        
    }
    
}
