
package StaticBlock;

public class StaticBlock {
    
    static String name;
    static int id;
    
    //Static block for initialize static variable
    static{
        name = "Tanvir Mahmud";
        id = 105;
    }
    
    static void display(){
        System.out.println("Name: "+name);
        System.out.println("ID : "+id);
    }
    
    
}
