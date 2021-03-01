
package Polymorphism2;

public class Rectangular extends Shape {
    
    double lenght,width;
    
    Rectangular(double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }
    
    @Override
    double Area(){
        return lenght*width;
    }
    
            
    
}
