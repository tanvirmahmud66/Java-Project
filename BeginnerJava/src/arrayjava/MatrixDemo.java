package arrayjava;

import java.util.Scanner;

public class MatrixDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[][] = new int[3][3];
        int diagonal = 0;
        int upper = 0, lower = 0;

        //input of a Matrix
        System.out.println("Enter a Matrix element: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                a[row][col] = input.nextInt();

            }
        }
        System.out.println();

        //printing of a Matrix
        System.out.println("A =  ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + a[row][col] + " ");

            }
            System.out.println();
        }

        //Sum of Diagonal Element
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    diagonal += a[row][col];
                }
                if (row < col) {
                    upper += a[row][col];
                }
                if (row > col) {
                    lower += a[row][col];
                }

            }
        }
        System.out.println("Sum of Diagonal Element: " + diagonal);
        System.out.println("Sum of Upper Element: " + upper);
        System.out.println("Sum of lower Element: " + lower);

    }

}
