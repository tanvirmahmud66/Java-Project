package Encapsulation;

public class Encapsulation_Test2 {

    public static void main(String[] args) {

        Student ob1 = new Student();
        ob1.setName("Tanvir");
        ob1.setRoll(42);
        System.out.println("Name: " + ob1.getName());
        System.out.println("Roll: " + ob1.getRoll());

    }
}
