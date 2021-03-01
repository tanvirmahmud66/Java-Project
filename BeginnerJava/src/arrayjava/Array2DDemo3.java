package arrayjava;

import java.util.Scanner;

public class Array2DDemo3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int size = input.nextInt();

        int a[][] = new int[size][];
        int k = 0;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size + 1; col++) {
                a[row] = new int[col];
            }
        }

        //Assigning value
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < row + 1; col++) {
                a[row][col] = k;
                k++;
            }
        }

        //printing
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }

    }

}
