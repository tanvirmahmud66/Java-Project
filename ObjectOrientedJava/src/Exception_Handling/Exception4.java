
package Exception_Handling;

public class Exception4 {
    public static void main(String[] args) {
        
        try{
            int a[] = new int[5];
            a[5] = 10;
        }catch(ArithmeticException e1){
            System.out.println("Exception: "+e1);
        }catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Exception: "+e2);
        }
        
        finally{
            System.out.println("Tanvir Mahmud Fahim");
        }
        
    }
}
