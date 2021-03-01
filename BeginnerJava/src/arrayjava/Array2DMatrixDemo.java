package arrayjava;

import java.util.Scanner;

public class Array2DMatrixDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a[][] = new int[2][3];//[row][column]
        int b[][] = new int[2][3];//[row][column]
        int sum[][] = new int[2][3];//[row][column]
        int sub[][] = new int[2][3];//[row][column]
        int mul[][] = new int[2][3];//[row][column]

        //input for a Matrix
        System.out.println("Enter element for a Matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] = ", row, col);
                a[row][col] = input.nextInt();
            }
        }

        //input for b Matrix
        System.out.println("Enter element for b Matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d] = ", row, col);
                b[row][col] = input.nextInt();
            }
        }

        System.out.println();
        //printing a Matrix
        System.out.println("A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + a[row][col] + " ");
            }
            System.out.println();
        }

        //printing a Matrix
        System.out.println("B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + b[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //sum of two Matrix
        System.out.println("A + B =  ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                sum[row][col] = a[row][col] + b[row][col];
                System.out.print("\t" + sum[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //sub of two Matrix
        System.out.println("A - B =  ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                sub[row][col] = a[row][col] - b[row][col];
                System.out.print("\t" + sub[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //mul of two Matrix
        System.out.println("A * B =  ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                mul[row][col] = a[row][col] * b[row][col];
                System.out.print("\t" + mul[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
