
package Package1;
import Package2.*;

public class Cat {
    public static void main(String[] args) {
        
        /*we can create object of Cat class
        because they all are in same packages called 
        Package1
        */ 
        
        Dog dog = new Dog();
        Monkey monkey = new Monkey();
    }
}
