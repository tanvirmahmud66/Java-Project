
package Abstraction;

public class Test {
    public static void main(String[] args) {
        
        MoblieUser mu; //reference variable of super class
        

        //refer object of sub class by using reference variable
        mu = new Tanvir();
        mu.sendMessage();
        
        mu = new Fahim();
        mu.sendMessage();
        mu.call();
        
        mu = new Ayesha();
        mu.sendMessage();
        
        
    }
}
