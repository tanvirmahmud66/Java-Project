package Final_Keyword;

public class University2 {

    static final int trim; // static blank final variable

    //to initialize static blank final variable 
    //use static block
    static {
        trim = 12;
    }

    void display2() {
        System.out.println(trim);
    }

}
