
package practicsjava;

import java.util.Scanner;

public class SeriesDemo8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Last Number: ");
        double n = input.nextInt();
        double mul = 1;
        
        
        for (double i = 1.5; i <= n; i++) {
            mul *= i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Mul = "+mul);
    }
    
}
