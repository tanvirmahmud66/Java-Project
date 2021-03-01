
package Abstraction.Interface.Multiple_Inheritance;

interface A{
    void play();
}

interface B{
    void play();
}

class C implements A,B{
    @Override
    public void play(){
        System.out.println("Hello, i am from C class");
    }
}

public class Test {
    public static void main(String[] args) {
        
        C ob = new C();
        ob.play();
        
    }
}
