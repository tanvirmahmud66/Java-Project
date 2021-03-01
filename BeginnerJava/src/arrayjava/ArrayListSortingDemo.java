
package arrayjava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingDemo {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(5);
        number.add(15);
        number.add(-8);
        number.add(0);
        number.add(25);
        number.add(36);
        number.add(22);
        System.out.println(number+" ");
        
        //Sorting ArrayList Decending Order
        Collections.sort(number, Collections.reverseOrder());
        System.out.print("Decending: ");
        System.out.println(number+" ");
        
        //Sorting ArrayList Accending Order
        Collections.sort(number);
        System.out.print("Accending: ");
        System.out.println(number+" ");
        
    }
    
}
