package arrayjava;

import java.util.Scanner;

public class ArrayLeftRotateDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int size = input.nextInt();

        int a[] = new int[size];

        //taking value in array index
        System.out.println("Enter Array Value: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }

        //displaying Array Element
        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        
        //rotation will follow the recent previous rotated array for the infinity loop
        while (true) {
            //input how many time to rotate
            System.out.print("How Many time you Want to Rotate: ");
            int n = input.nextInt();            

            for (int i = 0; i < n; i++) {
                int j, first = a[0];

                //rotating value by one
                for (j = 0; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }

                //puting first value in last index
                a[j] = first;
            }

            //diplaying array after rotating
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            System.out.println();

        }

    }

}
