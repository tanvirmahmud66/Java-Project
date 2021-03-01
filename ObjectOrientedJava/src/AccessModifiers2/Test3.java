
package AccessModifiers2;
import AccessModifiers1.Bird;

/*if we want to call protected member from different package
we have to inherit the class thn we can call
*/

public class Test3 extends Bird {
    public static void main(String[] args) {
        //have to make object for Test3 class
        
        Test3 b = new Test3();
        
        b.fly();
    }
}
