package Constructor;

public class Student {

    //only variable and method
    String name;
    String dept;
    String id;
    int batch;

    //peremeterize value get from main method
    void getinfo(String x, String y, String z, int n) {
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

        Student std1 = new Student();
        std1.getinfo("Tanvir Mahmud", "CSE", "CSE_06607742", 66);
        std1.display();

        Student std2 = new Student();
        std2.getinfo("Karim", "EEE", "EEE_06607742", 56);
        std2.display();

        Student std3 = new Student();
        std3.getinfo("Rahim", "CEN", "CEN_06607742", 70);
        std3.display();

        Student std4 = new Student();
        std4.getinfo("Salam", "ENG", "ENG_06607742", 69);
        std4.display();

        Student std5 = new Student();
        std5.getinfo("Ayesha", "CSE", "CSE_06607742", 68);
        std5.display();
    }

}
