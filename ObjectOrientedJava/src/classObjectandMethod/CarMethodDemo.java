package classObjectandMethod;

public class CarMethodDemo {

    String name, brand, mileage, type;
    int personCap;

    void display() {

        System.out.println("Car Name: " + name);
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Type: " + type);
        System.out.println("Car Mileage: " + mileage);
        System.out.println("Car Person Capacity: " + personCap);
        System.out.println();

    }

    public static void main(String[] args) {

        CarMethodDemo car1 = new CarMethodDemo();

        car1.name = "MX G-25";
        car1.brand = "BMW";
        car1.type = "Super Car";
        car1.mileage = "250 mile/h";
        car1.personCap = 2;
        car1.display();

        CarMethodDemo car2 = new CarMethodDemo();

        car2.name = "A1 Ambition Hatchback";
        car2.brand = "AUDI";
        car2.type = "Family Car";
        car2.mileage = "120 mile/h";
        car2.personCap = 4;
        car2.display();

        CarMethodDemo car3 = new CarMethodDemo();

        car3.name = "Huracan LP 610";
        car3.brand = "LAMBERGINI";
        car3.type = "Super Car";
        car3.mileage = "450 mile/h";
        car3.personCap = 2;
        car3.display();

        CarMethodDemo car4 = new CarMethodDemo();

        car4.name = "AMG GT R";
        car4.brand = "Mercedes Benz";
        car4.type = "Super Car";
        car4.mileage = "550 mile/h";
        car4.personCap = 2;
        car4.display();

    }

}
