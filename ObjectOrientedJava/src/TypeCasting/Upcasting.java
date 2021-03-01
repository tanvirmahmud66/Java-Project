
package TypeCasting;

public class Upcasting {
    public static void main(String[] args) {
        
        //Upcasting
        //sub class into the super class
        Person p = new Student();
        p.display();
        
        //downcasting
        //super class into sub class
        Student s = (Student)new Person();
        s.display();
        //downcasting not possible in java that's why 
        //showing error
        
    }
}
