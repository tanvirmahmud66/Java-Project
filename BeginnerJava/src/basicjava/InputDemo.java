
package basicjava;

import java.util.Scanner;

public class InputDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number = 120;
        
        System.out.print("Enter Any Number: ");
        number = input.nextInt();
        System.out.println("Number = "+number);
        
    }
    
}
