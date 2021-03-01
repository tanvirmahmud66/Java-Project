package Exception;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        int count = 1;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Please Enter num1: ");
                int num1 = sc.nextInt();
                System.out.print("Please Enter num2: ");
                int num2 = sc.nextInt();
                int result = num1 / num2;
                System.out.println("Result:" + num1 + "/" + num2 + " = " + result);
                count++;
            } catch (Exception a) {
                System.out.println("Exception: " + a);
                System.out.println("You must enter integer. plaese try again.");
            }
        } while (count == 1);

    }
}
