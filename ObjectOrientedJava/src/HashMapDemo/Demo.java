
package HashMapDemo;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        
        //we can find value by the key
        //HashMap<key_type,value_type> HashMapName = new HashMap<>();
        HashMap<Integer,String> map = new HashMap<>();
        
        //put for data insertion
        map.put(101,"Fahim");
        map.put(102,"Ayesha");
        map.put(103,"Tithi");
        map.put(104,"Tanvir");
        map.put(105,"Mahmud");
        
        //get for finding value
        System.out.println(map.get(101));
        System.out.println(map.get(102));
        System.out.println(map.get(103));
        System.out.println(map.get(104));
        System.out.println(map.get(105));
        
    }
}
