package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MapSortingTest2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 65);
        map.put("C", 67);
        map.put("E", 90);
        map.put("D", 68);
        map.put("B", 66);
        map.put("Z", 1);

        //key 값으로 정렬
        //오름차순
        List<String> keySet = new ArrayList<>(map.keySet());

        Collections.sort(keySet);

        for(String key : keySet){
            System.out.println(key + ", " + map.get(key));
        }

        System.out.println("-------------");
        //내림차순
        keySet.sort(Collections.reverseOrder());

        for(String key : keySet){
            System.out.println(key + " , " + map.get(key));
        }
    }
}
