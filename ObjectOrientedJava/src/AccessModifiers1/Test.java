
package AccessModifiers1;

public class Test {
    public static void main(String[] args) {
        
        //private only use in class
        Dog ob = new Dog();
        //ob.display(); error
        
        //public use in every where
        Cat ob1 = new Cat();
        ob1.display();
        
        //protected 
        Bird b = new Bird();
        b.fly();
        
        //default can use only in same package
        Fox f = new Fox();
        f.run();
        
        
    }
}
