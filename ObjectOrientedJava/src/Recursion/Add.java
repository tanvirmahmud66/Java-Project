
package Recursion;

public class Add {
    
    int add(int n){
        if(n==1) //base case
            return 1;//base case
        else
            return n+add(n-1);//recursion call
    }
    
    
    public static void main(String[] args) {
        Add ob = new Add();
        int result = ob.add(10);
        System.out.println("Recursive Add of 10: "+result);
    }
    
}
