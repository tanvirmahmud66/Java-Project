
package Abstraction;

abstract public class Shape {
    
    double var1, var2;
    
    Shape(double var1, double var2){
        this.var1 = var1;
        this.var2 = var2;
    }
    
    
    abstract void area();
    
}
