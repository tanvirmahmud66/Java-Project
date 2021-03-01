
package Anonymous;

public class TestDemo {
    public static void main(String[] args) {
        
        //anonymous class that has no name
        Dog ob = new Dog(){
            
            @Override
            void barking(){
                System.out.println("Dog cannot bark");
            }
            
        };
        
        ob.barking();
        
    }
}
