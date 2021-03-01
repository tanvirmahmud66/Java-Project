
package basicjava;


public class FormatSpecifier {
    public static void main(String[] args) {
        
        boolean b = true;
        char c = 'a';
        int i = 105445;
        short s = 3265;
        float f = 10.5454f;
        double d = 20.554545;
        
        
      System.out.printf("Boolean b = %b\n",b);
      System.out.printf("character c = %c\n",c);
      System.out.printf("integer i = %d\n",i);
      System.out.printf("short s = %d\n",s);
      System.out.printf("Float f = %.2f\n",f);
      System.out.printf("Double d = %.3f\n",d);
    }
    
}
