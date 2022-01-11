package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrint_5 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        map.forEach((key, value) ->
                System.out.println(key +" : " + value));
    }
}
