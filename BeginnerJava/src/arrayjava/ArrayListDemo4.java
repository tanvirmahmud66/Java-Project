package arrayjava;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(60);

        System.out.print(number + " ");
        System.out.println();
        System.out.print("Size of Arraylist: " + number.size());
        System.out.println();

        /*isEmpty method return true or false value depending on 
        element of arraylist are empty or not
        we have to take a boolean variable for true or false value*/
        boolean check = number.isEmpty();
        System.out.println("ArrayList is Empty: " + check);

        /*array.contains method check a pacific number that is into the arraylist or not
        it returns true or false value if pacific number is into the array list or not*/
        boolean contain = number.contains(40);
        System.out.println("40 is in the ArrayList: " + contain);
        boolean contain2 = number.contains(80);
        System.out.println("80 is in the ArrayList: " + contain2);

        //indexOf(element) to check index number of a pecific element of arraylist
        int index_pos = number.indexOf(50);
        System.out.println("Index Position of 50 is: " + index_pos);

        //replacing a pacific element in arralist, set(index_number, new element)
        number.set(3, 90);
        System.out.println("After replacing an element in ArrayList: ");
        System.out.print(number + " ");
        System.out.println();

        //get(index_number) to get an element of a pacific index in Arraylist
        int x = number.get(3);
        System.out.print("Element of Index 3 is: " + x);
        System.out.println();

        //Clear Method
        number.clear();
        System.out.print("after clear all Element of Arraylist: ");
        System.out.print(number + " ");
        System.out.println();
        System.out.print("Size of Arraylist: " + number.size());
        System.out.println();

        boolean check2 = number.isEmpty();
        System.out.println("ArrayList is Empty: " + check2);

    }

}
