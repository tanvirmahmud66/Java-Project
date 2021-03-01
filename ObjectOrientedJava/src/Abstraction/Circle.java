
package Abstraction;

public class Circle extends Shape {
    
    Circle(double r){
        super(r,r);
    }
    
    @Override
    void area(){
        double result = 3.1416* var1* var2;
        System.out.println("Area of Circle: "+result);
    }
    
}
