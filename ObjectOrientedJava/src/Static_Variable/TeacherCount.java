package Static_Variable;

public class TeacherCount {

    static int count = 0;
    static String university = "SUB";
    int phone;
    String name, id, dept;

    TeacherCount(String x, String y, String z, int p) {
        name = x;
        id = y;
        dept = z;
        phone = p;
        count++;
    }

    void totalTeacher() {
        System.out.println("Total Teacher: " + count);
    }

    void display() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher id: " + id);
        System.out.println("Teacher Phone No.: " + phone);
        System.out.println("Teacher Dept Name: " + dept);
        System.out.println("Teacher University Name: " + university);
        System.out.println();
    }

    public static void main(String[] args) {

        TeacherCount ob1 = new TeacherCount("Tanvir Mahmud Fahim", "CSE-101", "CSE", 12345);
        TeacherCount ob2 = new TeacherCount("Sanjj Ayesha", "CSE-102", "CSE", 54321);
        TeacherCount ob3 = new TeacherCount("Romana Sharmin Rumki", "EEE-501", "EEE", 78345);
        TeacherCount ob4 = new TeacherCount("Abdur Rashid", "CEN-302", "CEN", 14578);
        TeacherCount ob5 = new TeacherCount("Mahmuda Begum", "PHR-603", "PHR", 25445);
        TeacherCount ob6 = new TeacherCount("Ayesha Akter", "CSE-105", "CSE", 12145);
        TeacherCount ob7 = new TeacherCount("Maliha Mahbub", "CSE-108", "CSE", 14545);

        ob1.display();
        ob2.display();
        ob3.display();
        ob4.display();
        ob5.display();
        ob6.display();
        ob7.display();
        ob7.totalTeacher();

    }

}
