package basicjava;

import java.util.Scanner;

public class ControlStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("1 - Addition");
        System.out.println("2 - Substitution");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        System.out.print("Choose Your Option: ");
        num = input.nextInt();

        if (num == 1) {

            System.out.println("Addition");

            double num1, num2, result;

            System.out.print("Enter First Number: ");
            num1 = input.nextDouble();

            System.out.print("Enter Second Number: ");
            num2 = input.nextDouble();

            result = num1 + num2;
            System.out.println("Sum Is: " + result);

            if (result % 2 == 0) {
                System.out.println("Result Is Even Number");
            } else {
                System.out.println("Result Is Odd Number");
            }
        } else if (num == 2) {
            System.out.println("Substitution");

            double num1, num2, result;

            System.out.print("Enter First Number: ");
            num1 = input.nextDouble();

            System.out.print("Enter Second Number: ");
            num2 = input.nextDouble();

            result = num1 - num2;
            System.out.println("Sub Is: " + result);

            if (result % 2 == 0) {
                System.out.println("Result Is Even Number");
            } else {
                System.out.println("Result Is Odd Number");
            }
        } else if (num == 3) {
            System.out.println("Multiplication");

            double num1, num2, result;

            System.out.print("Enter First Number: ");
            num1 = input.nextDouble();

            System.out.print("Enter Second Number: ");
            num2 = input.nextDouble();

            result = num1 * num2;
            System.out.println("Mul Is: " + result);

            if (result % 2 == 0) {
                System.out.println("Result Is Even Number");
            } else {
                System.out.println("Result Is Odd Number");
            }
        } else if (num == 4) {
            System.out.println("Division");

            double num1, num2, result;

            System.out.print("Enter First Number: ");
            num1 = input.nextDouble();

            System.out.print("Enter Second Number: ");
            num2 = input.nextDouble();

            result = num1 / num2;
            System.out.println("Div Is: " + result);

            if (result % 2 == 0) {
                System.out.println("Result Is Even Number");
            } else {
                System.out.println("Result Is Odd Number");
            }
        } else {
            System.out.println("Program Terminate");
        }

    }

}
