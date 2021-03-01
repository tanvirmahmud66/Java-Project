package practicsjava;

import java.util.Scanner;

public class ArmstrongNumberDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Emter Number: ");
        int num = input.nextInt();

        int temp, r, arm = 0;
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            arm = arm + r * r * r;//for three digit number
            temp = temp / 10;
        }
        if (arm == num) {
            System.out.println(arm + " Number is Armstrong Number.");
        } else {
            System.out.println(arm + " Number is not Armstrong Number.");
        }

    }

}
