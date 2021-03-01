
package Recursion;

public class Fibonaco {
    
    static int first = 0,second = 1,fibo = 0;
    static void fibo(int count){
        if(count>0){
            fibo  = first+second;
            first = second;
            second = fibo;
            System.out.print(" "+fibo);
            fibo(count-1);
        }
    }
    
    public static void main(String[] args) {
        int count = 15;
        System.out.print(first+" "+second);
        fibo(count-2);
    }
    
}
