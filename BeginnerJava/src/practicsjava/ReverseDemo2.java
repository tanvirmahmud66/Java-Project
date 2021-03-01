package practicsjava;

import java.util.Scanner;

public class ReverseDemo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, temp, sum = 0, r;
        System.out.print("Enter any Number: ");
        num = input.nextInt();

        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        System.out.println("Reverse is: " + sum);
    }

}
