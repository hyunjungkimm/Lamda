package lamda.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static <T,R> List<R> map(List<T> list, Function<T, R> f){
        List<R> result = new ArrayList<>();
        for(T t: list){
            result.add(f.apply(t));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> l = map(
                Arrays.asList("lambdas", "in", "action"),
                (String s) -> s.length()
                );

        System.out.println(l);//[7, 2, 6]

    }
}
