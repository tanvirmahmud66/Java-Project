
package practicsjava;

import java.util.Scanner;

public class SeriesDemo6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Last Number: ");
        int n = input.nextInt();
        int mul = 1;
        
        
        for (int i = 1; i <= n; i++) {
            mul *= i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Mul = "+mul);
    }
    
}
