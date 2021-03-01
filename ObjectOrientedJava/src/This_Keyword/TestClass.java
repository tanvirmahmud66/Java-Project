package This_Keyword;

public class TestClass {

    void Fahim() {
        System.out.println("I am Fahim");
    }

    void Ayesha() {
        this.Fahim();//we can call method by using this keyword
        System.out.println("I am Ayesha");
    }
}

//but compiler can autmetic create this keyword when if we don't use this keyword
