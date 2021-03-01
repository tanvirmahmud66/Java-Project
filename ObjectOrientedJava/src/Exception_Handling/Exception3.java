
package Exception_Handling;

public class Exception3 {
    public static void main(String[] args) {
        
        try{
            int a = 10;
            int b = 0;
            int result = a/b;
            System.out.println("Result: "+result);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: "+e);
        }
        
        finally{
            System.out.println("Tanvir Mahmud Fahim");
        }
        
    }
}
