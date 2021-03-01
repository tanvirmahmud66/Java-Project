package practicsjava;

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pascal Traignle length: ");
        int length = sc.nextInt();
        int array[][] = new int[length][length];

        if (length > -1 && length < 20) {

            for (int i = 0; i < length; i++) {
                array[0][i] = 1;
                array[i][0] = 1;
            }

            for (int row = 1; row < length; row++) {
                for (int column = 1; column < length - row; column++) {
                    array[row][column] = array[row][column - 1] + array[row - 1][column];
                }
            }

            //printing Array list
            for (int row = 0; row < length; row++) {
                for (int column = 0; column < length - row; column++) {
                    System.out.print(array[row][column]+"\t");
                }
                System.out.println("\n");
            }

        }else{
            System.out.println("Invalid Input");
        }
    }
}
