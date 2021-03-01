
package arrayjava;

import java.util.Scanner;

public class ArraySumAvrgDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How Many Variable you want: ");
        int var = input.nextInt();
        
        int number[] = new int[var];
        //Input Number in All variable
        System.out.println("Enter Value: ");
        for (int i = 0; i < number.length ; i++) {
            number[i] = input.nextInt();
        }
        
        
        int sum=0;
        //sum of all variable value
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.println("Sum is: "+sum);
        
        
        //average of all input value
        double avrg= 0;        
        avrg = (double)sum/number.length;
        System.out.println("Average is: "+avrg);
    }
}
