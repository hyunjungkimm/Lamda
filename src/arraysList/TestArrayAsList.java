package arraysList;

import java.util.Arrays;
import java.util.List;

public class TestArrayAsList {
    public static void main(String[] args) {
        String[] strs = {"alpha", "beta", "charlie"};
        System.out.println(Arrays.toString(strs));//[alpha, beta, charlie]

        List<String> lst = Arrays.asList(strs);//new ArrayList<>(); 대신에 사용
        System.out.println(lst);//[alpha, beta, charlie]

        //lst.add("ttt");//error : asList()로 List를 생성하면 원소를 새롭게 추가x

        strs[0] += "88";
        lst.set(2, lst.get(2) + "99");
        System.out.println(Arrays.toString(strs));//[alpha88, beta, charlie99]
        System.out.println(lst);//[alpha88, beta, charlie99]

        List<Integer> lsInt = Arrays.asList(22,44,11,33);
        System.out.println(lsInt);//[22, 44, 11, 33]
    }
}
