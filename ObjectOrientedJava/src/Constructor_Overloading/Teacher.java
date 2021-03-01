package Constructor_Overloading;

public class Teacher {

    String name, gender, sub, id;
    int phone;

    //Constructor OverLoading
    //Default Constructor
    Teacher() {
        System.out.println("No Information");
        System.out.println();
    }

    //two peremeterize constructor
    Teacher(String x, String y) {
        name = x;
        gender = y;
    }

    //Three Peremeter Constructor
    Teacher(String x, String y, String z) {
        name = x;
        id = y;
        sub = z;
    }

    Teacher(String x, String y, String z, String w, int n) {
        name = x;
        gender = y;
        sub = z;
        id = w;
        phone = n;
    }

    //Displaying information
    void display() {
        System.out.println("Teacher's Name: " + name);
        System.out.println("Teacher's Gender: " + gender);
        System.out.println("Teacher's Subject: " + sub);
        System.out.println("Teacher's ID: " + id);
        System.out.println("Teacher's Phone No.: " + phone);
        System.out.println();
    }

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();

        Teacher teacher2 = new Teacher("Tanvir Mahmud", "Male");
        teacher2.display();

        Teacher teacher3 = new Teacher("Sanjj Ayesha", "CSE-06807742", "Programing");
        teacher3.display();

        Teacher teacher4 = new Teacher("Tanvir Mahmud Fahim", "Male", "Programing", "CSE-06607742", 1701744799);
        teacher4.display();

    }

}
