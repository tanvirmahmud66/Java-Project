
package stringjava;

public class PrimitiveToStringToPrimitiveDemo {
    public static void main(String[] args) {
        
        //Primitive to String
        int x = 100;
        String s = Integer.toString(x);
        System.out.println("S = "+s);
        
        double z = 15.23;
        String s2 = Double.toString(z);
        System.out.println("S2 = "+z);
        
        boolean b = true;
        String s3 = Boolean.toString(b);
        System.out.println("s3 = "+b);
        
        //String to Primitive
        String f = "123";
        int i = Integer.parseInt(f);
        System.out.println("i = "+i);
        
        double d = Double.parseDouble(f);
        System.out.println("d = "+d);
        
        int j = Integer.valueOf(f);
        System.out.println("j = "+j);       
                
        
    }
}
