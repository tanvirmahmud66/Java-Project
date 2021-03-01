
package Inheritance.PrivateData;

public class Test {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        t1.setName("Tanvir Mahmud Fahim");
        t1.setAge(23);
        t1.setQualification("B.Sc. in CSE");
        
        t1.display1();
        
        Student st1 = new Student();
        st1.setName("Ayesha Akter");
        st1.setAge(21);
        st1.setBatch("68-s-A");
        
        st1.display2();
        
    }
    
}
