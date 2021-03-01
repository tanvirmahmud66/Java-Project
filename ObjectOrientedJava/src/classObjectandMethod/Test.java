
package classObjectandMethod;

public class Test {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher(); //object declear and creat
        
        teacher1.name = "Tanvir Mahmud";
        teacher1.gender = "Male";
        teacher1.age = 23;
        teacher1.subject = "OOP";
        teacher1.phone = 1701744799;
        
        
        System.out.println("Teacher's Name: "+teacher1.name);
        System.out.println("Teacher's Gender: "+teacher1.gender);
        System.out.println("Teacher's Age: "+teacher1.age);
        System.out.println("Teacher's Subject: "+teacher1.subject);
        System.out.println("Teacher's Phone Number: "+teacher1.phone);
        
        
        System.out.println();
        
        Teacher teacher2 = new Teacher(); //object declear and creat
        
        teacher2.name = "Sanjj Ayesha";
        teacher2.gender = "Female";
        teacher2.age = 20;
        teacher2.subject = "Math";
        teacher2.phone = 1646976947;
        
        
        System.out.println("Teacher's Name: "+teacher2.name);
        System.out.println("Teacher's Gender: "+teacher2.gender);
        System.out.println("Teacher's Age: "+teacher2.age);
        System.out.println("Teacher's Subject: "+teacher2.subject);
        System.out.println("Teacher's Phone Number: "+teacher2.phone);
        
        System.out.println();
        
        
        Student stu1 = new Student(); //object declear and creat
        
        stu1.name = "Fahim";
        stu1.dept = "Computer Science & Engineering";
        stu1.id = "CSE 06607742";
        stu1.age = 23;
        stu1.phone = 1701744799;
        
        
        System.out.println("Student's Name: "+stu1.name);
        System.out.println("Student's Dept: "+stu1.dept);
        System.out.println("Student's Id: "+stu1.id);
        System.out.println("Student's Age: "+stu1.age);
        System.out.println("Student's Phone No.: "+stu1.phone);
        
        
        System.out.println();
        
        
        Student stu2 = new Student(); //object declear and creat
        
        stu2.name = "Ayesha";
        stu2.dept = "Computer Science & Engineering";
        stu2.id = "CSE 06607741";
        stu2.age = 20;
        stu2.phone = 1646976947;
        
        
        System.out.println("Student's Name: "+stu2.name);
        System.out.println("Student's Dept: "+stu2.dept);
        System.out.println("Student's Id: "+stu2.id);
        System.out.println("Student's Age: "+stu2.age);
        System.out.println("Student's Phone No.: "+stu2.phone);
        
        
    }
    
}
