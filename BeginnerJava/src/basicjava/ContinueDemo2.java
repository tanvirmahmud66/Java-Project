
package basicjava;


public class ContinueDemo2 {
    public static void main(String[] args) {
        
        for(int i=1;i<=100;i+=2){
            if(i==10){
                continue;
            }
            System.out.println(i);
        }
        
    }
    
}
