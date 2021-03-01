
package AccessModifiers2;
import AccessModifiers1.Fox;
public class Test {
    public static void main(String[] args) {
        //we can not call a default member from deff. package
        Fox f = new Fox();
        //f.run(); error
        
    }
}
