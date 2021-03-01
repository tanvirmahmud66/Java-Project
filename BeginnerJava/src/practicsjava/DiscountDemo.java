package practicsjava;

import java.util.Scanner;

public class DiscountDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Enter Quantity: ");
        x = input.nextInt();

        if ((x * 100) >= 1000) {
            System.out.println("Discount: " + (.1 * x * 100) + "\nTotal Cost: " + ((x * 100) - (.1 * x * 100)));
        } else {
            System.out.println("Total Cost: " + (x * 100));
            System.out.println("::::: No Discount :::::");
        }

    }

}
