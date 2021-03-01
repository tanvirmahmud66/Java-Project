
package practicsjava;

import java.util.Scanner;

public class TringleDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        double base, hight, area;
        
        
        System.out.print("Enter Base: ");
        base = input.nextDouble();
       
        System.out.print("Enter hight: ");
        hight = input.nextDouble();
        
        area = 1.5 * base * hight;
        System.out.println("Area is: "+area);
                             
    }
    
}
