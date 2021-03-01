
package stringjava;

public class BinOctHexaToDecimalDemo {
    public static void main(String[] args) {
        
        String binary = "1010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal = "+decimal);
        
        String octal = "675";
        decimal = Integer.parseInt(octal, 8);
        System.out.println("Decimal = "+decimal);
        
        String hexa = "A";
        decimal = Integer.parseInt(hexa, 16);
        System.out.println("Decimal = "+decimal);
        
    }
    
}
