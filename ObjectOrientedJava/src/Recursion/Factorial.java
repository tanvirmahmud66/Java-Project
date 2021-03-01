
package Recursion;

public class Factorial {
    
    int fact(int n){
       if(n==1) //base case
           return 1;
       else
           return n*fact(n-1); //recursive call
    }
    
    
    public static void main(String[] args) {
        
        Factorial ob = new Factorial();
        int result = ob.fact(5);
        System.out.println("Factorial of 5 = "+result);
        
        result = ob.fact(3);
        System.out.println("Factorial of 5 = "+result);
        
        result = ob.fact(7);
        System.out.println("Factorial of 5 = "+result);
    }
    
}
