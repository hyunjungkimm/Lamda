package arraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayAsList2 {
    public static void main(String[] args) {
        String[] strs = {"alpha", "beta", "charlie"};
        System.out.println(Arrays.toString(strs));//[alpha, beta, charlie]

        List<String> lst = new ArrayList<String>(Arrays.asList(strs));
        System.out.println(lst);//[alpha, beta, charlie]

        lst.add("ttt");//이제 에러가 나지 않고 데이터를 추가시킬 수 있다.

        strs[0] += "88";
        lst.set(2, lst.get(2)+"99");
        System.out.println(Arrays.toString(strs));//[alpha88, beta, charlie]
        System.out.println(lst);//[alpha, beta, charlie99, ttt]

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list);//[1, 2, 3, 4, 5]
    }


}
