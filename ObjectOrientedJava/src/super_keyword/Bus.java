package super_keyword;

public class Bus extends Vehicle {

    int sit;

    Bus(String c, double w, int si) {
        super(c, w);
        sit = si;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Total Sit Number: " + sit);
        System.out.println();
    }
}
