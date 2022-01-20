package refactoring.designPattern.chain;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        ProcessingObject<String> p1 = new HeaderTextProcessing();
        ProcessingObject<String> p2 = new SpellCheckerProcessing();
        p1.setSuccessor(p2);// 두 작업 처리 객체를 연결한다.
        String result = p1.handle("Aren't labdas really sexy?!!");
        System.out.println(result);

        //람다
        UnaryOperator<String> headerProcessing = (String text) -> "From Raoul, Mario and Alan : " + text; //첫 번째 작업 처리 객체
        UnaryOperator<String> spellCheckerProcessing = (String text) -> text.replaceAll("labda", "lambda"); //두 번째 작업 처리 객체

        Function<String,String> pipeline =
                headerProcessing.andThen(spellCheckerProcessing); //동작 체인으로 두 함수를 조합한다.

        String resultLamda = pipeline.apply("Aren't labdas really sexy?!!");
        System.out.println(resultLamda);

    }
}
