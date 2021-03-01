package Constructor_Overloading;

public class Student {

    String name;
    String gender;
    String id;
    String dept;
    int batch;
    int phone;

    //Constructor Overloading
    //No peremeter Constructor
    Student() {
        System.out.println("No Information");
        System.out.println();
    }

    //two peremeterize Constructor
    Student(String x, String y) {
        name = x;
        id = y;
    }

    //four peremeterize constructor
    Student(String x, String y, String z, int p) {
        name = x;
        id = y;
        dept = z;
        phone = p;
    }

    Student(String x, String y, String z, String w, int n, int m) {
        name = x;
        gender = y;
        id = z;
        dept = w;
        batch = n;
        phone = m;
    }

    void display() {
        System.out.println("Student's Name: " + name);
        System.out.println("Student's Gender: " + gender);
        System.out.println("Student's Id: " + id);
        System.out.println("Student's Depertment: " + dept);
        System.out.println("Student's Batch No.: " + batch);
        System.out.println("Student's Phone No.: " + phone);
        System.out.println();
    }

    public static void main(String[] args) {

        Student std1 = new Student();

        Student std2 = new Student("Tanvir Mahmud", "CSE-06607742");
        std2.display();

        Student std3 = new Student("Sanjj Ayesha", "CSE-06807742", "CSE", 1701744799);
        std3.display();

        Student std4 = new Student("Tanvir Mahmud Fahim", "Male", "CSE-06607742", "CSE", 66, 1646976947);
        std4.display();

        Student std5 = new Student("Sanjj Ayesha", "Female", "CSE-06807742", "CSE", 68, 1646976947);
        std5.display();

    }

}
