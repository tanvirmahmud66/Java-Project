package Hierarchical_Inheritance;
//child or drive class

public class Student extends Person {

    //name,gander,age,DisplayInfo1
    String id;
    String dept;
    char section;

    void displayinfo2() {
        System.out.println(":::Student Information::::");
        DisplayInfo1();
        System.out.println("Id: " + id);
        System.out.println("Depertment: " + dept);
        System.out.println("Section: " + section);
        System.out.println();
    }
}
