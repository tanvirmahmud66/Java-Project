
package basicjava;

import java.util.Scanner;


public class DoWhileOddNumberDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        
        
        System.out.println("Odd Number are: ");
        int i = 1;
        do{
            System.out.println(i);
            i += 2;
        }while(i<=num);
        
        
    }
    
}
