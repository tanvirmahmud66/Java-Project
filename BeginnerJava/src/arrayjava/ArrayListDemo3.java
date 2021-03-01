package arrayjava;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("Size: " + num.size());
        num.add(10);
        num.add(11);
        num.add(12);
        num.add(13);
        num.add(14);
        num.add(15);
        num.add(16);

        System.out.println(num);
        System.out.println("Size: " + num.size());

        num.remove(3);
        System.out.println(num + " ");
        System.out.println("Size: " + num.size());
        
        

    }

}
