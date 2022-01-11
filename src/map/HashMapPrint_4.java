package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPrint_4 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        Iterator<Map.Entry<Integer,String>>it = map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<Integer,String> entrySet = (Map.Entry<Integer, String>) it.next();

            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        }
    }
}
