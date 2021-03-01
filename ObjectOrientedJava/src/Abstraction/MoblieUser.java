
package Abstraction;

//abstract class
abstract public class MoblieUser {
    
    //non-abstract method
    void call(){
        System.out.println("Calling...");
    }
    
    abstract void sendMessage(); //abstract method
    
}
