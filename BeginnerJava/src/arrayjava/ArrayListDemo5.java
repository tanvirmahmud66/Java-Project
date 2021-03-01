package arrayjava;

import java.util.ArrayList;

public class ArrayListDemo5 {

    public static void main(String[] args) {

        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        number1.add(50);
        System.out.println(number1 + " ");

        number2.add(11);
        number2.add(22);
        number2.add(33);
        number2.add(44);
        number2.add(55);
        System.out.println(number2 + " ");

        //add of element of number1 va in to the var number3 by addAll method
        number3.addAll(number1);
        System.out.println(number3 + " ");

        //to check ArrayList Equality
        boolean check = number1.equals(number3);
        System.out.println("Number1 = Number3: " + check);

        check = number1.equals(number2);
        System.out.println("Number1 = Number2: " + check);

    }

}
