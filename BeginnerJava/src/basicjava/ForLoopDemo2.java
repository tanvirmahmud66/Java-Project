
package basicjava;

import java.util.Scanner;

public class ForLoopDemo2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        int x = input.nextInt();
        
        for(int i = 1;i<=x;i++){
            System.out.println("Tanvir Mahmud Fahim: "+i);
        }        
    }
    
}
