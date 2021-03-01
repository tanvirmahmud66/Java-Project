
package practicsjava;

import java.util.Scanner;


public class TemperatureDemo2 {
  
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       double ferh,cels,x = 0.56;
       
       System.out.print("Enter Ferenhiet: ");
       ferh = input.nextDouble();
       
       cels = ferh - 32;
       cels *= x; 
       System.out.println("Celsius: "+cels);
    }
    
}
