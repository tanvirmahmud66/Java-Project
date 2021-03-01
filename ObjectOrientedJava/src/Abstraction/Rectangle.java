
package Abstraction;

public class Rectangle extends Shape {
   Rectangle(double var1, double var2){
        super(var1,var2);
    }
    
    @Override
    void area(){
        double result = var1 * var2;
        System.out.println("Area of Rectangle: "+result);
    } 
}
