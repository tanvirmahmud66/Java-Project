
package practicsjava;

import java.util.Scanner;


public class TemperatureConvert {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in); 
       double cels,ferh;
       
       System.out.print("Enter Celsius: ");
       cels = input.nextDouble();
       
       ferh = 1.8 * cels + 32;
       System.out.println("Ferenhiet: "+ferh);
    }
    
}
