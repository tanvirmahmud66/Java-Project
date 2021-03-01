
package basicjava;

import java.util.Scanner;


public class ForLoopDemo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter Positive Number: ");
        num = input.nextInt();
        
        
        /*for(int i=1;i<=10;i++){
            num *= i;
            System.out.println(num);
        }*/
        
        for(int i=1;i<=10;i++){
            System.out.println(num*i);
        }
        
    }
    
}
