package practicsjava;

import java.util.Scanner;

public class AttendenceDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x, y;
        System.out.print("Enter total class that held: ");
        x = input.nextDouble();

        System.out.print("Enter total class that attended: ");
        y = input.nextDouble();

        System.out.println("Percentage Of Attendence: " + ((y / x) * 100) + "%");

        if (((y / x) * 100) <= 75) {
            System.out.println("Permitted to attend in the Examination");
        } else {
            System.out.println("Not permitted to attend in the Examination");
        }

    }

}
