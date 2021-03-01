
package Method_Overriding;
// method name and perameter must be same
//have to use "@Override" before method in class
public class Test {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        t1.name = "Tanvir";
        t1.age = 23;
        t1.qualification = "B.Sc. in CSE";
        t1.displayInformation();
        
        Person p1 = new Person();
        p1.name = "Mahmud";
        p1.age = 26;
        p1.displayInformation();
        
        Student s1 = new Student();
        s1.name = "Fahim";
        s1.age = 24;
        s1.dept = "CSE";
        s1.batch = 66;
        s1.qualification = "HSC & SSC";
        s1.displayInformation();
        
        
    }
    
}
