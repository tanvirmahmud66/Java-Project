
package Method_Overriding;

public class Teacher extends Person {
    
    String qualification;
    
    @Override
    void displayInformation(){
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(qualification);
        System.out.println();
        
    }
}
