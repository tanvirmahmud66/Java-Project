package practicsjava;

import java.util.Scanner;

public class PalindromeNumberDemo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int num = input.nextInt();

        int temp, r, result = 0;
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            result = result * 10 + r;
            temp = temp / 10;
        }
        if (result == num) {
            System.out.println(result + " Number Is Palindrome");
        } else {
            System.out.println(result + " Number Is Not Plindrome");
        }

    }

}
