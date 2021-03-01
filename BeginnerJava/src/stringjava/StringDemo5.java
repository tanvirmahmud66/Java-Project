
package stringjava;

public class StringDemo5 {
    public static void main(String[] args) {
        
        String name = "tanvir Mahmud";
        
        StringBuffer sb = new StringBuffer(name);
        
        System.out.println(sb);
        
        sb.append(" fahim ");
        sb.append(100);
        
        System.out.println(sb);
        
        //delete(initial, limit)
        sb.delete(0, 5);
        System.out.println(sb);                  
        
        //to change stirng lenth
        sb.setLength(8);
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
              
                
    }
    
}
