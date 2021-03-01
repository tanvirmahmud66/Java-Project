package basicjava;

import java.util.Scanner;

public class IfElseStatementDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z;
        System.out.print("Enter 1st Man Age: ");
        x = input.nextInt();

        System.out.print("Enter 2nd Man Age: ");
        y = input.nextInt();

        System.out.print("Enter 3rd Man Age: ");
        z = input.nextInt();

        if (x > y && x > z) {
            System.out.println("1st Man: Senior");
            if (y > z) {
                System.out.println("3rd Man: Junior");
            } else {
                System.out.println("2nd Man: Junior");
            }
        } else if (y > x && y > z) {
            System.out.println("2nd Man: Senior");
            if (x > z) {
                System.out.println("3rd Man: Junior");
            } else {
                System.out.println("1st Man: Junior");
            }
        } else if (z > x && z > y) {
            System.out.println("3rd Man: Senior");
            if (x > y) {
                System.out.println("2nd Man: Junior");
            } else {
                System.out.println("1st Man: Junior");
            }
        } else {
            System.out.println("Age are Equal");
        }

    }

}
