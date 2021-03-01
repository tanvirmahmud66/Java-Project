package practicsjava;

import java.util.Scanner;

public class ServicePlaceSellection {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        char sex, marital;

        System.out.print("Enter Age(20-60): ");
        age = input.nextInt();

        System.out.print("Enter Sex(M/F): ");
        sex = input.next().charAt(0);

        System.out.print("Enter Marital Status(Y/N): ");
        marital = input.next().charAt(0);

        switch (sex) {
            case 'm':
                if (20 <= age && age <= 40 && ((marital == 'y') || (marital == 'n'))) {
                    System.out.println("He may work in Anywhere.");
                } else if (40 < age && age <= 60) {
                    System.out.println("He will work in Urban areas only.");
                } else {
                    System.out.println("ERROR");
                }
                break;
            case 'f':
                if (marital == 'y' || marital == 'n') {
                    System.out.println("She will work only in urban areas.");
                } else {
                    System.out.println("ERROR");
                }
                break;
            default:
                System.out.println("ERROR");
        }

    }

}
