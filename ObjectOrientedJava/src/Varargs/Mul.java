
package Varargs;

public class Mul {
    
    void Mul(int...num){
        int mul  = 1;
        
        for(int x: num){
            mul *= x;
        }
        System.out.println(mul);
    }
    
    
    public static void main(String[] args) {
        
        Mul ob = new Mul();
        ob.Mul(1,2,3,4,5);
        
    }
}
