package practicsjava;

import java.util.Scanner;

public class LoopDemo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.print("Enter Initial number: ");
        m = input.nextInt();
        System.out.print("Enter Final number: ");
        n = input.nextInt();

        int sum = 0;

        for (int i = m; i <= n; i++) {
            sum += i;
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("Sum is: " + sum);

    }

}
