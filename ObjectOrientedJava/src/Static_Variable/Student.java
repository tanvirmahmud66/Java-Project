package Static_Variable;

public class Student {

    String name; //Instance variable
    int id; //Instance variable
    static String universityName = "SUB"; //Static variable
    //Static variable relate with class not with object

    Student(String x, int n) {
        name = x;
        id = n;
    }

    void displayInformation() {
        System.out.println("Student's Name: " + name);
        System.out.println("Student's ID: " + id);
        System.out.println("Student's University Name: " + universityName);
        System.out.println();
    }

    public static void main(String[] args) {

        Student s1 = new Student("Tanvir Mahmud", 101);
        Student s2 = new Student("Sanjj Ayesha", 102);

        s1.displayInformation();
        s2.displayInformation();

    }
}
