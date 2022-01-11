package lamda.runnable;

import lamda.predicate.Predicate;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void process(Runnable r){
        r.run();
    }
    public static void main(String[] args) {
        //람다 사용
        Runnable r1 = () -> System.out.println("Hello World 1");

        //익명 클래스 사용
        Runnable r2 = new Runnable(){
            public void run(){
                System.out.println("Hello World 2");
            }
        };

        process(r1);//Hello World 1
        process(r2);//Hello World 2
        process(()-> System.out.println("Hello world 3"));//직접 전달한 람다표현식으로 'Hello World 3'출력

        process(() ->System.out.println("This is awesome!"));


    }



}
