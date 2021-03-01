
package Method_Overriding;

public class Student extends Teacher {
    
    String dept;
    int batch;
    
    @Override
    void displayInformation(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(dept);
        System.out.println(batch);
        System.out.println(qualification);        
        System.out.println();
    }
    
}
