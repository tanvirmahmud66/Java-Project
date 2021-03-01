
package Polymorphism2;

public class Test {
    public static void main(String[] args) {
        
        //cteaing 3 reference object of super class using array
        Shape s[] = new Shape[3];
        
        s[0] = new Shape();
        s[1] = new Triangle(23,12);
        s[2] = new Rectangular(45,64);
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i].Area());
        }
        
    }
}
