
package Anonymous;

public class Test {
    public static void main(String[] args) {
        
        //aonymous class that has no name
        Person ob = new Person(){
        
            @Override
            void display(){
            
                System.out.println("I am Test Class");
                
            }
        
        };
        
        ob.display();
        
    }
}
