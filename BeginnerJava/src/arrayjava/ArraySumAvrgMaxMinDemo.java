
package arrayjava;

import java.util.Scanner;

public class ArraySumAvrgMaxMinDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = input.nextInt();
        
        int number[] = new int[size];
        System.out.println("Enter Integer Value: ");
        
        //Taking Value
        for (int i = 0; i < number.length; i++) {
            number[i]=input.nextInt();
        }
        
        //Sum of all values
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i]; 
        }
        System.out.println("Sum of all values are: "+sum);
        
        //Agerage
        double avrg = 0;
        avrg = (double)sum/number.length;
        System.out.println("Average is: "+avrg);
        
        //Maximum Number of all value
        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if(max < number[i]){
                max = number[i];
            }                
        }
        System.out.println("Mximum Number of all value is: "+max);
        
        
        //Finding Minimum Number
        int min=number[0];
        for (int i = 1; i < number.length; i++) {
            if(min>number[i]){
                min = number[i];
            }
        }
        System.out.println("Minimum Number Of all Value is: "+min);     
        
    }
    
}
