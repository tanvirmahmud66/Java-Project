
package practicsjava;

import java.util.Scanner;


public class AccelerationDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double velo, time;
        double accel;
        
        System.out.print("Enter Velocity: ");
        velo = input.nextDouble();
        
        System.out.print("Enter Time: ");
        time = input.nextDouble();
        
        accel = velo / time;
        System.out.println("Acceloration is: "+accel);
                
                
    }
    
}
