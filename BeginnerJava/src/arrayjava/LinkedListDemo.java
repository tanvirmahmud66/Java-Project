
package arrayjava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        
        LinkedList<String> countryName = new LinkedList<>();
        
        //value initializing
        countryName.add("Bangladesh");
        countryName.add("India");
        countryName.add("Afghanistan");
        countryName.add("Pakistan");
        countryName.add("Kepal");
        countryName.add("Vutan");
        
        System.out.println(countryName);
        
        for(String name: countryName){
            System.out.print(name+ ", ");
        }System.out.println("");
        
        Iterator itr = countryName.iterator();
        
        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }System.out.println("");
        
    }
}
