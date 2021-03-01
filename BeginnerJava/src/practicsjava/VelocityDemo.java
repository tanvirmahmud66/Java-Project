
package practicsjava;

import java.util.Scanner;


public class VelocityDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dis, time;
        double velo;
        
        System.out.print("Enter Distance: ");
        dis = input.nextDouble();
        
        System.out.print("Enter time: ");
        time = input.nextDouble();
        
        
        velo = dis / time;
        System.out.println("Velocity Is: "+velo);
        
        
               
        
    }
    
}
