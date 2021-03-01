
package LinkedListProject;

import java.util.LinkedList;

public class List {
    public static void main(String[] args) {
        
        //create linkedlist for student class
        LinkedList<Student> stu = new LinkedList<>();
        
        //create student
        Student s1 = new Student("Tanvir","CSE",1001);
        Student s2 = new Student("Mahmud","CSE",1002);
        Student s3 = new Student("Fahim","CSE",1003);
        Student s4 = new Student("Ayesha","CSE",1004);
        Student s5 = new Student("Tithi","CSE",1005);
        Student s6 = new Student("Rahim","EEE",2001);
        Student s7 = new Student("Karim","CEN",5034);
        Student s8 = new Student("Rumel","BBA",3013);
        
        //adding studnet into list
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        stu.add(s5);
        stu.add(s6);
        stu.add(s7);
        stu.add(s8);
        
        //Printing
        for(Student s: stu){
            System.out.println("Name: "+s.name+" Dept: "+s.dept+" ID: "+s.id);
        }
        
        
        
    }
}
