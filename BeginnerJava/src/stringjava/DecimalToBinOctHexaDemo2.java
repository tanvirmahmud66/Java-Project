
package stringjava;

import java.util.Scanner;

public class DecimalToBinOctHexaDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int decimal;
        System.out.print("Enter Decimal Number : ");
        decimal = input.nextInt();
        
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binart = "+binary);
        
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal = "+octal);
        
        String hexa = Integer.toHexString(decimal);
        System.out.println("HexaDecimal = "+hexa);
        
        
    }
    
}
