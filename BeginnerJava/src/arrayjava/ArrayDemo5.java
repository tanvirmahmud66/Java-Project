package arrayjava;

import java.util.Scanner;

public class ArrayDemo5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array size: " + num.length);

        //Printing value of Array
        for (int x : num) {
            System.out.println(x);
        }

        //Sum of all Atribiutes
        int sum = 0;
        //using for each loop
        for (int s : num) {
            sum += s;
        }
        System.out.println("Sum of all Atribiutes: " + sum);

    }

}
