
package Abstraction.Interface.Multiple_Inheritance;

interface Tanvir{
    void engineer();
}

interface Mahmud{
    void engineer();
}

class Engineering implements Tanvir,Mahmud{
    @Override
    public void engineer(){
        System.out.println("I am an Engineering Student");
    }
}

public class TestDemo3 {
    public static void main(String[] args) {
        
        Engineering en = new Engineering();
        en.engineer();
        
    }
}
