package practicsjava;

import java.util.Scanner;

public class LoopDemo3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int m, n;
            System.out.print("Enter initial Number: ");
            m = input.nextInt();
            System.out.print("Enter Final Number: ");
            n = input.nextInt();

            //Sum of Even Number
            int sum = 0;
            for (int i = m; i <= n; i++) {
                if (i % 2 == 0) {
                    sum += i;
                    System.out.print(i + " ");
                }

            }
            System.out.println();
            System.out.println("Sum of even Number is: " + sum);

            //Sum of Odd Number
            int sum2 = 0;
            for (int j = m; j <= n; j++) {
                if (j % 2 != 0) {
                    sum2 += j;
                    System.out.print(j + " ");
                }

            }
            System.out.println();
            System.out.println("Sum of Odd Number: " + sum2);
        }

    }

}
