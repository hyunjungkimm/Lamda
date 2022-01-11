package map;

import java.awt.print.Pageable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPrint_2 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        Set<Integer> KeySet = map.keySet();
        for(Integer key : KeySet) {
            System.out.println(key + " : " +map.get(key));
        }
    }
}
