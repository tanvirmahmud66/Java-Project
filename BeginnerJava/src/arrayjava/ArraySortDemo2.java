
package arrayjava;

import java.util.Arrays;

public class ArraySortDemo2 {
    public static void main(String[] args) {
        
        int number[] = {1,2,3,5,4,8,6,41,23,1,54};
        
        Arrays.sort(number);
        
        System.out.print("Accending: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println();
        
        
        System.out.print("Decending: ");
        for (int j = 10; j >= 0; j--) {
            System.out.print(number[j]+" ");
        }
        
        
        
        System.out.println();         
    }
    
}
