package Constructor;

public class StudentDemo {

    //only variable and method
    String name;
    String dept;
    String id;
    int batch;

    //peremeterize Constructor
    StudentDemo(String x, String y, String z, int n) {

        name = x;
        dept = y;
        id = z;
        batch = n;

    }

    void display() {
        System.out.println("Student's Name: " + name);
        System.out.println("Student's Dept.: " + dept);
        System.out.println("Student's Id: " + id);
        System.out.println("Student's Batch: " + batch);
        System.out.println();
    }

    public static void main(String[] args) {

        StudentDemo std1 = new StudentDemo("Tanvir Mahmud", "CSE", "CSE_06607742", 66);
        std1.display();

        StudentDemo std2 = new StudentDemo("Karim", "EEE", "EEE_06607742", 56);
        std2.display();

        StudentDemo std3 = new StudentDemo("Rahim", "CEN", "CEN_06607742", 70);
        std3.display();

        StudentDemo std4 = new StudentDemo("Salam", "ENG", "ENG_06607742", 69);
        std4.display();

        StudentDemo std5 = new StudentDemo("Ayesha", "CSE", "CSE_06607742", 68);
        std5.display();

    }
}
