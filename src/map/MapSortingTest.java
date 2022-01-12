package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapSortingTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 65);
        map.put("C", 67);
        map.put("D", 68);
        map.put("B", 66);

        //value 기준으로 정렬
        //오름차순
        List<String> keySet = new ArrayList<>(map.keySet());

        keySet.sort((o1, o2) -> map.get(o1) - map.get(o2));

        for(String key : keySet){
            System.out.println(key + " , " + map.get(key) );
        }
        System.out.println("--------------");
        //내림차순
        List<String> keySet2 = new ArrayList<>(map.keySet());
        keySet2.sort((o1,o2)-> map.get(o2) - map.get(o1));

        for(String key : keySet2){
            System.out.println(key + " , " + map.get(key));
        }


    }
}
