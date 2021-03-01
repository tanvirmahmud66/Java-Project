package arrayjava;

public class ArrayDemo4 {

    public static void main(String[] args) {

        String names[] = {"Fahim", "Joy", "Shibly", "Shourov", "Gourov", "Sakib"};
        System.out.println(names.length + "\n");

        //General for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println();

        //for Each loop
        for (String x : names) {
            System.out.println(x);
        }

    }

}
