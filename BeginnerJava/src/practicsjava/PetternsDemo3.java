package practicsjava;

import java.util.Scanner;

public class PetternsDemo3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter line Number: ");
        int line = input.nextInt();

        for (int row = 1; row <= line; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
