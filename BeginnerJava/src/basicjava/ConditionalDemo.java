
package basicjava;

import java.util.Scanner;


public class ConditionalDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 Number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int large = (num1>num2) ? num1 : num2; //(condition) ? = like if and : = like else
        
        System.out.println("Large Number is = "+large);
                
    }
    
}
