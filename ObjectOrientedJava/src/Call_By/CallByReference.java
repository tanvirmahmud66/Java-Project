
package Call_By;

public class CallByReference {
    
    String name;
    
    void change(CallByReference ob2){
        ob2.name = "Ayesha";
    }
    
    
    public static void main(String[] args) {
        
        CallByReference ob1 = new CallByReference();
        ob1.name = "Fahim";
        System.out.println("Before Calling: "+ob1.name);
        
        ob1.change(ob1);
        System.out.println("After Calling: "+ob1.name);
        //objective data save in heap memory
        
    }
    
}
