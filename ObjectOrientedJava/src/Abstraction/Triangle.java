
package Abstraction;

public class Triangle extends Shape {
    
    Triangle(double var1, double var2){
        super(var1,var2);
    }
    
    @Override
    void area(){
        double result = 0.5 * var1 * var2;
        System.out.println("Area of Triangle: "+result);
    }
    
}
