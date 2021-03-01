
package basicjava;

import java.text.DecimalFormat;

public class DecimalNumberFormat {
    public static void main(String[] args) {
        
        DecimalFormat ob = new DecimalFormat("0.000");
        DecimalFormat ob2 = new DecimalFormat("0.00");
        double x = 25.3543445;
        System.out.println("Before X: "+x);
        System.out.println("After X: "+ob.format(x));
        System.out.println("2nd After X: "+ob2.format(x));
        
    }
}
