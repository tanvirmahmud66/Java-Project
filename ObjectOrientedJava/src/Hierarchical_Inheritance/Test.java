package Hierarchical_Inheritance;

public class Test {

    public static void main(String[] args) {

        Student ob1 = new Student();
        ob1.name = "Tanvir";
        ob1.gander = "Male";
        ob1.age = 23;
        ob1.id = "CSE-06607742";
        ob1.dept = "CSE";
        ob1.section = 'D';
        ob1.displayinfo2();

        Student ob2 = new Student();
        ob2.name = "Ayesha";
        ob2.gander = "Female";
        ob2.age = 21;
        ob2.id = "CSE-06807742";
        ob2.dept = "CSE";
        ob2.section = 'A';
        ob2.displayinfo2();

        Teacher t1 = new Teacher();
        t1.name = "Tanvir Mahmud Fahim";
        t1.gander = "Male";
        t1.age = 25;
        t1.dept = "CSE";
        t1.courseCode = 101;
        t1.DisplayInfo3();

        Teacher t2 = new Teacher();
        t2.name = "Ayesha Akter";
        t2.gander = "Female";
        t2.age = 23;
        t2.dept = "CSE";
        t2.courseCode = 102;
        t2.DisplayInfo3();
        
        Teacher t3 = new Teacher();
        t3.name = "Tanvir Mahmud Fahim";
        t3.gander = "Male";
        t3.age = 34;
        t3.dept = "EEE";
        t3.courseCode = 501;
        t3.DisplayInfo3();

    }

}
