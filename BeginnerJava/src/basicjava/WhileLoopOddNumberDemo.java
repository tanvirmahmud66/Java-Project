
package basicjava;

import java.util.Scanner;


public class WhileLoopOddNumberDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Limitation: ");
        int lim = input.nextInt();
        
        System.out.println("ODD NUMBER ARE: ");
        int i=1;
        while(i<=lim){
            
            System.out.println(i);
            i += 2;
        }
    }
    
}
