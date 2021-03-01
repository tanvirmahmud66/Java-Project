
package practicsjava;

import java.util.Scanner;

public class SeriesDemo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Last Number: ");
        int n = input.nextInt();
        int sum = 0;
        
        
        for (int i = 2; i <= n; i+=2) {
            sum += i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sum = "+sum);
    }
    
}
