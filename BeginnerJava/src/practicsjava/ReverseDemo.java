package practicsjava;

import java.util.Scanner;

public class ReverseDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        int num = input.nextInt();
        int r;
        int temp = num;

        while (temp != 0) {
            r = temp % 10;
            System.out.print(r + " ");
            temp = temp / 10;
        }
        System.out.println();

    }

}
