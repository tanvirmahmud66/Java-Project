
package Abstraction;

public class TestDemo {
    public static void main(String[] args) {
        
        Shape ob; //reference variable of super class
        
        ob = new Triangle(5,6);
        ob.area();
        
        ob = new Rectangle(5,6);
        ob.area();
        
        ob = new Circle(5);
        ob.area();
        
    }
}
