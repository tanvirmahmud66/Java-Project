package Super_key;

public class Student extends Person {

    String dept;

    @Override
    void display() {
        super.display();
        System.out.println(dept);
    }
}
