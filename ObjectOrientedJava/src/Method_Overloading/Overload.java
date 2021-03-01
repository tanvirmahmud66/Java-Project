
package Method_Overloading;

public class Overload {
    
    
    void Play(){
        System.out.println("No perameter");
    }
    
    void play(int a, int b){
        int tanvir = a;
        int mahmud = b;
        
        System.out.println(tanvir);
        System.out.println(mahmud);
    }
    
    void play(double a){
        System.out.println("Double Number: "+a);
    }
    
    void play(float f){
        System.out.println("Float Number: "+f);
    }
    
    void play(int number){
        System.out.println(number);
    }
    
    public static void main(String[] args) {
        
        Overload ob = new Overload();
        ob.Play();
        ob.play(23.45);
        ob.play(45.3);
        ob.play(10003);
        ob.play(201, 202);
    }
}
