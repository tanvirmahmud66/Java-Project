
package Exception_Handling;

public class Exception2 {
    public static void main(String[] args) {
        
        try{
            int a = 10;
            int b = 0;
            int result = a/b;
            System.out.println("Result: "+result);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: "+e);
        }catch(ArithmeticException e2){
            System.out.println("Exception: "+e2);
        }
        System.out.println("Tanvir Mahmud Fahim");
        
        
    }
}
