package practicsjava;

import java.util.Scanner;

public class PrimeNumberDemo3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Starting Point: ");
        int s = input.nextInt();

        System.out.print("Enter finishing Point: ");
        int f = input.nextInt();

        int count = 0, totalprime = 0;

        for (int i = s; i <= f; i++) {
            for (int j = 2; j < i; j++) {
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
