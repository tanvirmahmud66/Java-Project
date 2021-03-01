
package Call_By;

public class CallByValue {
    
    void change(int i)//formal peremeter
    {
        i = 20;
        System.out.println(i);
    }
    
    
    public static void main(String[] args) {
        
        CallByValue ob1 = new CallByValue();
        int x = 10; //premetive dada, save in stack memory 
        System.out.println("Before calling: "+x);
        
        ob1.change(x); //actual peremeter and doesn't affect for formal peremeter
        System.out.println("After Calling: "+x);
        
    }
    
}
