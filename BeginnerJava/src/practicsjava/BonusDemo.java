package practicsjava;

import java.util.Scanner;

public class BonusDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Enter Salary: ");
        x = input.nextInt();

        System.out.print("Enter Year of Service: ");
        y = input.nextInt();

        if (y > 5) {
            System.out.println("Net Bonus: " + (.05 * x));
            System.out.println("Total Salary: " + ((.05 * x) + x));
        } else {
            System.out.println("::::No Bonus::::");
        }

    }

}
