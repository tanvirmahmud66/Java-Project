package super_keyword;

public class Car extends Vehicle {

    //color,weight,display(),constructor
    int gear;

    Car(String c, double w, int g) {
        super(c, w);
        gear = g;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Gear: " + gear);
        System.out.println();
    }
}
