
package basicjava;

public class Debuging {
    public static void main(String[] args) {
        
        /*select line then go to Debug->New watch->add what you want to watch 
        that is how to work like sum/i
        thne point out previous line that's call break ow go 
        to gebug again and run debug file
        and for forwarding go on button step_over
        */
        
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        
        System.out.println("Sum is: "+sum);
    }
    
}
