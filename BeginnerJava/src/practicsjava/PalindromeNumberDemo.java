package practicsjava;

import java.util.Scanner;

public class PalindromeNumberDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(":::Check Palindrome Number:::");
        System.out.print("Enter any Number: ");
        int num1 = input.nextInt();

        int temp, r, num2 = 0;
        temp = num1;
        while (temp != 0) {
            r = temp % 10;
            num2 = num2 * 10 + r;
            temp = temp / 10;
        }
        if (num2 == num1) {
            System.out.println(num2 + " palindorme Number");
        } else {
            System.out.println(num2 + " Not Palindrome Number");
        }

    }

}
