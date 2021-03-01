
package practicsjava;

import java.util.Scanner;


public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,temp,sum=0,r;
        System.out.print("Enter Any Number: ");
        num = input.nextInt();
        
        temp = num;
        while(temp!=0){
            r = temp%10;
            sum += r;
            temp = temp/10;
            
        }
        System.out.println("Sum Of Digit: "+sum);
        
    }
    
}
