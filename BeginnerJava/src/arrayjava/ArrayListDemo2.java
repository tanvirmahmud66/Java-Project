package arrayjava;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("tanvir");
        names.add("mahmud");
        names.add("fahim");
        names.add("shibli");
        names.add("joy");
        names.add("rahim");

        System.out.println(names);
        System.out.println("size: " + names.size());

        //for each loop
        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("size: " + names.size());

        //Iterator
        Iterator itr = names.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println("size: " + names.size());

        //removing one element
        names.remove(2);
        System.out.println(names + "");
        System.out.println("size: " + names.size());

        //removing all element
        names.removeAll(names);
        System.out.println(names + " ");
        System.out.println("size: " + names.size());

        System.out.println();
    }

}
