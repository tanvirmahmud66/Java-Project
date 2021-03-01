package practicsjava;

import java.util.Scanner;

public class FactorialValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A number: ");
        int num = input.nextInt();
        int result = 1;
        for (int i = num; i >= 1; i--) {
            result = result * i;
        }
        System.out.println("Factorial of " + num + " = " + result);

    }

}
