package Final_Keyword;

public class Staff extends Office {
    //display()

    /*final method can not be overriden
    but can be inherited
     */
    void display2() {
        super.display();
        System.out.println("Staff Information");
    }

}
