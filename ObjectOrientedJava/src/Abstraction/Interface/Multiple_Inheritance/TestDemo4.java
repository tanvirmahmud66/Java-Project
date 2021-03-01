package Abstraction.Interface.Multiple_Inheritance;

interface T {

    public abstract void play();
}

interface M {

    public abstract void play();
}

class F implements T, M {

    @Override
    public void play() {
        System.out.println("F can play Football");
    }
}

public class TestDemo4 {

    public static void main(String[] args) {

        F ob = new F();
        ob.play();

    }
}
