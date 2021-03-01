package Hierarchical_Inheritance;
//child or derive class

public class Teacher extends Person {

    String dept;
    int courseCode;

    void DisplayInfo3() {
        System.out.println(":::Teacher Information:::");
        DisplayInfo1();
        System.out.println("Depertment: " + dept);
        System.out.println("Course Code: " + courseCode);
        System.out.println();
    }
}
