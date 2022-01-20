package refactoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class CaloricDish {
    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );

        //람다
        Map<CaloricLevel, List<Dish>> dishesCarloricLevel =
                menu.stream()
                        .collect(groupingBy(dish -> {
                            if(dish.getCalories() <= 400) return CaloricLevel.DIET;
                            else if(dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        }));
        //메서드 참조
        //람다 표현식을 별도의 메서드로 추출한다음에 groupingBy에 인수로 전달 o -> 코드 간결, 의도 명확
        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel =
                menu.stream()
                        .collect(groupingBy(Dish::getCaloricLevel));

        System.out.println(dishesByCaloricLevel);

        //저수준 리듀싱 연산
        int totalCalories = menu.stream()
                .map(Dish::getCalories)
                .reduce(0, (c1,c2)-> c1+c2);
        //내장 컬렉터 -> 문제를 명확하게 설명
        int totalCalories2 = menu.stream()
                .collect(summingInt(Dish::getCalories));
        System.out.println(totalCalories + " = " + totalCalories2);

        //컬렉션 코드 -> 스트림 API
        List<String> dishNames = new ArrayList<>();
        for(Dish dish : menu){
            if(dish.getCalories() > 300){
                dishNames.add(dish.getName());
            }
        }

        menu.parallelStream()
                .filter(d -> d.getCalories() > 300)
                .map(Dish::getName)
                .collect(toList());

    }
}
