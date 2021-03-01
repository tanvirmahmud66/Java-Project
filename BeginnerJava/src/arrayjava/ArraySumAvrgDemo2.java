
package arrayjava;

import java.util.Scanner;

public class ArraySumAvrgDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        int len = input.nextInt();
        
        float number[] = new float[len];
        
        //for take All Float Input
        System.out.println("Enter Float Number: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextFloat();
        }
        
        //sum al value
        float sum = 0f;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.println("Sum of All Float Value: "+sum);
        
        
        //Average of all float Value
        float avrg = 0f;
        avrg = sum/number.length;
        System.out.println("Average Of All Float Value is: "+avrg);
        
    }
    
}
