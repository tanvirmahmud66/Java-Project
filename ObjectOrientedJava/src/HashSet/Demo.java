
package HashSet;

import java.util.HashSet;


public class Demo {
    public static void main(String[] args) {
        
        HashSet<String> countryName = new HashSet<>();
        
        countryName.add("Bangladesh");
        countryName.add("India");
        countryName.add("Pakistan");
        countryName.add("Abghanistan");
        countryName.add("Nepal");
        //countryName.add("Bangladesh");
        //HsahSet never listed the same value/attribuite 
        
        System.out.println(countryName);
        System.out.println(countryName.size());
        
        
    }
}
