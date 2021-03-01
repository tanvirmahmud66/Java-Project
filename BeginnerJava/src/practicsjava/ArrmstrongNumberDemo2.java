package practicsjava;

import java.util.Scanner;

public class ArrmstrongNumberDemo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();

        int r;
        int arm = 0;
        int temp;
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            arm = arm + r * r * r * r;//for Four disit Number
            temp = temp / 10;
        }
        if (arm == num) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

    }

}
