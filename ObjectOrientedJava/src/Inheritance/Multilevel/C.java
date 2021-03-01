
package Inheritance.Multilevel;

public class C extends B{
    
    String country;
    int nationalID;
    
    void display2(){
        display1();
        System.out.println(country);
        System.out.println(nationalID);
        System.out.println();
    }
}
