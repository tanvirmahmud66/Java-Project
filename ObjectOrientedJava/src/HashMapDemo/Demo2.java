
package HashMapDemo;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        
        HashMap<Integer,String> customer = new HashMap<>();
        
        customer.put(1,"Fahim");
        customer.put(2,"Tanvir");
        customer.put(3,"Mahmud");
        
        
        System.out.println(customer.get(1));
        System.out.println(customer.get(2));
        System.out.println(customer.get(3));
        
    }
}
