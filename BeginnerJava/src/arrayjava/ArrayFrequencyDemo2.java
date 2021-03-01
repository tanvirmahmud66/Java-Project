package arrayjava;

import java.util.Scanner;

public class ArrayFrequencyDemo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Array size: ");
        int size = input.nextInt();

        int arr[] = new int[size];
        int fre[] = new int[arr.length];

        //Input value in first array
        System.out.println("Enter Array value: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println();

        //displaying value of first array
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //frequuency checking(how many time have use one element in the array)
        int visit = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    //to avoid counting same element
                    fre[j] = visit;
                }
            }
            if (fre[i] != visit) {
                fre[i] = count;
            }
        }

        //displaying frequency
        System.out.println("Frequency of array: ");
        for (int i = 0; i < fre.length; i++) {
            if (fre[i] != visit) {
                System.out.print(fre[i] + " ");
            }
        }

    }

}
