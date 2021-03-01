
package Abstraction.Interface;

public class Test {
    public static void main(String[] args) {
        //we can not create object for interface
        //like : Animal ob = new Animal();
        
        Dog ob = new Dog();
        ob.eat();
        
        Cat ob2 = new Cat();
        ob2.eat();
        
    }
}
