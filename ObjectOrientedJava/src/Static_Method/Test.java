
package Static_Method;

public class Test {
    public static void main(String[] args) {
        
        StaticMethod ob1 = new StaticMethod();
        ob1.display1();
        
        
        //no need to create oject for non static method
        StaticMethod.display2();
        
    }
    
}
