package lamda.predicate;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> results = new ArrayList<>();
        for(T t: list){
            if(p.test(t)){
                results.add(t);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> listOfStrings= new ArrayList<>();
        listOfStrings.add("a");

        List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);
        System.out.println(nonEmpty);
    }
}
