
package Recursion;

public class Example {
    
    static int count = 0;
    
    static void p(){
        count++;
        if(count<=5){
            System.out.println("Hello world");
            p();
        }
    }
    
    
    public static void main(String[] args) {
       p();//no need to declearing object bcz of static method
        
    }
}
