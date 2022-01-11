package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrint {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        for(Map.Entry<Integer, String> entrySet : map.entrySet()){
            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        }
        //1 : Apple
        //2 : Banana
        //3 : Orange
    }
}
