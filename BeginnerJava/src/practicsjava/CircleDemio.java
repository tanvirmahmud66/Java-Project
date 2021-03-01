
package practicsjava;

import java.util.Scanner;


public class CircleDemio {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double radius , area;
        
        System.out.print("Enter Radious: ");
        radius = input.nextDouble();
        
        area = 3.1416 * radius * radius;
        System.out.println("Area is: "+area);
        
    }
    
}
