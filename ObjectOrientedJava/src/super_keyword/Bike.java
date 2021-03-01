package super_keyword;

public class Bike extends Vehicle {

    int gear;
    double speed;

    Bike(String c, double w, int g, double s) {
        super(c, w);
        gear = g;
        speed = s;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Gear: " + gear);
        System.out.println("Speed: " + speed);
        System.out.println();
    }
}
