
package Super_key;

public class B extends A {
    int x = 5;
    
    void display(){
        System.out.println(x); // int x = 5
        System.out.println(super.x); //int x = 10
    }
}
