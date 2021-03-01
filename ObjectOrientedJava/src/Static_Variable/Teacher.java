package Static_Variable;

public class Teacher {

    String name;
    String id;
    int phone;
    static String dept = "CSE";
    static String university = "SUB";

    Teacher(String n, String i, int p) {
        name = n;
        id = i;
        phone = p;
    }

    void displayInformation() {
        System.out.println("Teacher's Name: " + name);
        System.out.println("Teacher's ID: " + id);
        System.out.println("Teacher's Phone No.: " + phone);
        System.out.println("Teacher's Dept Name: " + dept);
        System.out.println("Teacher's University: " + university);
        System.out.println();
    }

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Shimanto", "CSE-101", 45874856);
        Teacher t2 = new Teacher("Robin", "CSE-102", 124487554);
        Teacher t3 = new Teacher("Shafi", "CSE-103", 26548548);
        Teacher t4 = new Teacher("Tanvir", "CSE-104", 12456455);
        Teacher t5 = new Teacher("Fahim", "CSE-105", 545865815);

        t1.displayInformation();
        t2.displayInformation();
        t3.displayInformation();
        t4.displayInformation();
        t5.displayInformation();

    }

}
