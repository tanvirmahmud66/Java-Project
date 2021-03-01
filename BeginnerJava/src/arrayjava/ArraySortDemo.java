package arrayjava;

import java.util.Arrays;

public class ArraySortDemo {

    public static void main(String[] args) {

        int number[] = {10, 23, 5, -5, 35};

        Arrays.sort(number);//sort methods

        //Accending order
        System.out.println("Accending Order: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(number[i] + " ");
        }

        System.out.println();

        //decending order
        System.out.println("Deccending Order: ");
        for (int j = 4; j >= 0; j--) {
            System.out.print(number[j] + " ");
        }
        System.out.println();
        System.out.println();

        //String sorting 
        String names[] = {"tanvir", "Mahmud", "Fahim", "Shibly", "joy", "sakib", "shourov", "gourov"};

        Arrays.sort(names); //Sorting Array

        //Accending Order
        System.out.println("Accending Order: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(names[i]);
        }
        System.out.println();

        //Decending Order
        System.out.println("Decending Order: ");
        for (int i = 7; i >= 0; i--) {
            System.out.println(names[i]);
        }
        System.out.println();

        System.out.println();
    }

}
