package Constructor;

public class Teacher {

    String name;
    String gender, subject;
    String id;
    int age, phone;

    //Default Constructor
    Teacher() {
        System.out.println("No value");
    }

    //constructor(peremeterize)
    Teacher(String x, String y, String z, String w, int n, int m) {
        name = x;
        gender = y;
        subject = z;
        id = w;
        age = n;
        phone = m;
    }

    //display function no return value
    void display() {

        System.out.println("Teacher's Name: " + name);
        System.out.println("Teacher's Gender: " + gender);
        System.out.println("Teacher's Subject: " + subject);
        System.out.println("Teacher's id: " + id);
        System.out.println("Teacher's age: " + age);
        System.out.println("Teacher's Phone No.: " + phone);
        System.out.println();

    }

    public static void main(String[] args) {

        //Creating class object and Initializing values
        Teacher t1 = new Teacher("Tanvir Mahmud", "Male", "Programing", "CSE-742", 25, 1701744799);
        t1.display();

        Teacher t2 = new Teacher("Adnan Joy", "Male", "DEPT", "CSE-743", 25, 1701744788);
        t2.display();

        Teacher t3 = new Teacher("Abdur Rahim", "Male", "Non-depertmental", "CSE-540", 27, 1701755865);
        t3.display();

        Teacher t4 = new Teacher("Sanjj Ayesha", "Female", "Programing", "CSE-742", 22, 1701744799);
        t4.display();

        Teacher t5 = new Teacher();
        t5.display();

    }

}
