
package arrayjava;

public class ArrayDemo6 {
    public static void main(String[] args) {
        
        int number[] = {1,2,5,1,2,4};
        
        //Array Number Element Changing
        number[0] = 8;
        
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println();
                
        //Array String Element Changing
        String names[] = {"Mahmud","Mahmud","Fahim"};
        names[0] = "Tanvir";
        
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+" ");
        }
        System.out.println();
        
        
    }
    
}
