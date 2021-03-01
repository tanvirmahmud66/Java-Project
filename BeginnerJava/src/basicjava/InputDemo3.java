
package basicjava;

import java.util.Scanner;

public class InputDemo3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double number;
        
        System.out.print("Enter Any Double Number: ");
        
        number = input.nextDouble();
        System.out.println("Your Double Number is: "+number);
        
        Scanner string = new Scanner(System.in);
        String name;
        
        System.out.print("Enter Your name: ");
        name = string.nextLine();
        System.out.println("Welcome: "+name);
        
    }
    
}
