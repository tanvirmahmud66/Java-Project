
package stringjava;

public class DecimalToBinOctHexaDemo {
    public static void main(String[] args) {
        
        int decimal = 15;
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binart = "+binary);
        
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal = "+octal);
        
        String hexa = Integer.toHexString(decimal);
        System.out.println("HexaDecimal = "+hexa);
        
        
        
    }
    
}
