
package Recursion;

public class Printing {
    
    
    String print(){
        System.out.println("Hello World");
        
        return print();
    }
    
    
    public static void main(String[] args) {
        Printing ob = new Printing();
        ob.print();
    }
    
}
