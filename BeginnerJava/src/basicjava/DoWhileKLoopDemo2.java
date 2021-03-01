
package basicjava;

import java.util.Scanner;


public class DoWhileKLoopDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Limitation: ");
        int lim = input.nextInt();
        
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=lim);
        
        
    }
    
}
