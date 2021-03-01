package arrayjava;

import java.util.Scanner;

public class ArrayCopyDemo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = input.nextInt();

        int x[] = new int[size];
        int y[] = new int[x.length];

        //taking value of old Array Value
        System.out.println("Enter First Array Value: ");
        for (int i = 0; i < x.length; i++) {
            x[i] = input.nextInt();
        }

        //cpoy Array value from old to new Array
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
        }

        //displaying value of old Array
        System.out.print("\nOld Array X: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();

        //displaying value of new Array
        System.out.print("New Array Y: ");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + " ");
        }
        System.out.println();

    }

}
