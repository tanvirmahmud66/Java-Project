
package Varargs;

public class Add {
    
    void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    
    void add(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }
    
    
    void add(int num1, int num2, int num3,int num4){
        System.out.println(num1+num2+num3+num4);
    }
    
    public static void main(String[] args) {
        
        Add ob = new Add();
        ob.add(10, 50);
        ob.add(10, 25, 65);
        ob.add(10, 20, 30, 40);
        
    }
    
}
