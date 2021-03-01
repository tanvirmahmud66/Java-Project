
package Abstraction.Interface.Multiple_Inheritance;


/*Java cann't support muliple inheritance 
but in interface it support multiple inheritance*/

public class Animal implements Dog,Cat {
    
    @Override
    public void eat(){
        System.out.println("All Animal Can Eat");
    }
    
}
