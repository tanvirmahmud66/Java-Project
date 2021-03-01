package practicsjava;

import java.util.Scanner;

public class PetternsDemo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter line Number: ");
        int line = input.nextInt();

        //upper petterns
        for (int row = 1; row <= line; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //lower petterns
        for (int ro = line - 1; ro >= 1; ro--) {
            for (int co = 1; co <= ro; co++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
