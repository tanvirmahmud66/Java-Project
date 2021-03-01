package practicsjava;

import java.util.Scanner;

public class GradingSystemDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double marks;
        System.out.print("Enter Your Marks: ");

        marks = input.nextDouble();

        if (marks <= 100 && marks >= 80) {
            System.out.println("A");
        } else if (marks < 80 && marks >= 60) {
            System.out.println("B");
        } else if (marks < 60 && marks >= 50) {
            System.out.println("C");
        } else if (marks < 50 && marks >= 45) {
            System.out.println("D");
        } else if (marks < 45 && marks >= 25) {
            System.out.println("E");
        } else if (marks < 25) {
            System.out.println("F");
        } else {
            System.out.println("No correct Marks");
        }

    }

}
