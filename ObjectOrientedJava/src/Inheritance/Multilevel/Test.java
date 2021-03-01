
package Inheritance.Multilevel;

public class Test {
    public static void main(String[] args) {
        
        C ob1 = new C();
        
        
        ob1.name = "Tanvir Mahmud Fahim";
        ob1.age = 23;
        ob1.profession = "Student";
        ob1.country = "Bangladesh";
        ob1.nationalID = 345435353;
        
        ob1.display2();
        
        B ob2 = new B();
        
        ob2.name = "Ayesha";
        ob2.age = 21;
        ob2.profession = "Teacher";
        
        ob2.display1();
        
        
    }
}
