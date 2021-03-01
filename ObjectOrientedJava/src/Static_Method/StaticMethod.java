
package Static_Method;

public class StaticMethod {
   
    void display1(){
        System.out.println("I am non Static Method");
    }
    
    static void display2(){
        System.out.println("I am static Method");
    }
    
    //static method restiction
    
    /*can't call nonstatic method in static method
    but we can call static method in non static method.
    but we can also call static method in static method.
    
    same for variable
    */
    
}
