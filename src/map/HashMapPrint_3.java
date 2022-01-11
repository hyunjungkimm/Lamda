package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapPrint_3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        Collection<String> values = map.values();
        System.out.println(values);
    }
}
