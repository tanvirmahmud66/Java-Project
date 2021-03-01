package practicsjava;

import java.util.Scanner;

public class PrimeNumberDemo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Initial Number: ");
        int m = input.nextInt();

        System.out.print("Enter Ending Number: ");
        int n = input.nextInt();

        int count = 0, totalprime = 0;

        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }

            }
            if (count == 0) {
                System.out.println(i);
                totalprime++;
            }
            count = 0;

        }

        System.out.println("Total Prime Number = " + totalprime);

    }

}
