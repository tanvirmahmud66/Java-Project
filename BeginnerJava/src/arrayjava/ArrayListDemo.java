package arrayjava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    //  ArrayList has nor fixed Array size

    public static void main(String[] args) {

        //Arraylist Declearation
        //ArraList<datatype>var_name = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();

        //present size of array before adding Element
        System.out.println("Size: " + number.size());

        //Adding Element in ArrayList
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(04, 50);//var_name.add(index_number,element)

        //printing ArrayList
        System.out.println(number);
        System.out.println("Size: " + number.size());

        //printing ArrayList Using for ecah loop
        System.out.print("Printing Array(for each loop): ");
        for (int x : number) {
            System.out.print(x + " ");
        }
        System.out.println();

        //Printing ArrayList using  Iterator
        System.out.print("Printing Array(Iteration): ");
        //Iteration var_name = Arraylist_var.iteration();
        Iterator itr = number.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        //Removing one Arraylist Element
        number.remove(2);

        System.out.println(number);//removing one element
        System.out.println("Size: " + number.size());
        
        //removing All Arraylist Element
        number.removeAll(number);
        System.out.println("After removing All: " + number);

        System.out.println();

    }

}
