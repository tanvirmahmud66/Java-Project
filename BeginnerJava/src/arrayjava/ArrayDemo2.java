
package arrayjava;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number[] = new int[10];
        System.out.println("Enter Value: ");
        for (int i = 0; i < 10; i++) {
            number[i]=input.nextInt();
        }
        System.out.println();
        
        for (int j = 0; j < 10; j++) {
            System.out.println(number[j]);
        }
        
    }
    
}
