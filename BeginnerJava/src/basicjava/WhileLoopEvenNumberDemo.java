
package basicjava;

import java.util.Scanner;


public class WhileLoopEvenNumberDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Limit Number: ");
        int lim = input.nextInt();
        
        System.out.println("Even Number Down Bellow: ");
        int i=2;
        while(i<=lim){
            System.out.println(i);
            i+=2;
        }
        
    }
    
}
