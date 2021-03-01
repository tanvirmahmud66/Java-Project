
package basicjava;

import java.util.Scanner;


public class DoWhileLoopEvenNumberDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        
        System.out.println("Even umber are: ");
        int i=2;
        do{
            System.out.println(i);
            i += 2;
        }while(i<=num);
    }
    
}
