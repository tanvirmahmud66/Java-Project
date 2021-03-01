package practicsjava;

import java.util.Scanner;

public class MultiplicationTableDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number for multiplication table: ");
            int num = input.nextInt();

            int mul = 0;

            for (int i = 1; i <= 10; i++) {

                mul = num * i;
                System.out.println(num + "x" + i + " = " + mul);

            }
            System.out.println();
        }

    }

}
