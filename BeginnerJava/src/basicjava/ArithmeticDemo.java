
package basicjava;

import java.util.Scanner;


public class ArithmeticDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1,num2,result;
       
        System.out.print("Enter First Number: ");
        num1 = input.nextInt();
        
        System.out.print("Enter Second Number: ");
        num2 = input.nextInt();
        
        result = num1 + num2;
        System.out.println("Sum = "+result);
        
        result = num1 - num2;
        System.out.println("Sub = "+result);
        
        result = num1 * num2;
        System.out.println("Mul = "+result);
        
        double result2 = (double) num1 / num2;
        System.out.println("div = "+result2);
        
        result = num1 % num2;
        System.out.println("Reminder = "+result);
                                   
    }
    
}
