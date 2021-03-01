
package TypeCasting;

public class TestDemo2 {
    public static void main(String[] args) {
        
        int a = 10;
        System.out.println("a: "+a);
        double b = a;
        System.out.println("Before Type Casting: "+b);
        
        //type Casting
        int c =(int)b;
        System.out.println("After Type Casting: "+c);
        
    }
}
