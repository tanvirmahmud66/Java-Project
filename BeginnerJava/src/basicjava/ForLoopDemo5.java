
package basicjava;

import java.util.Scanner;


public class ForLoopDemo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        System.out.print("Enter Power: ");
        int pow = input.nextInt();
        int result = 1;
        for(int i=1;i<=pow;i++){
            result *= num;
        }
        System.out.println("Result: "+result);
        
    }
}
