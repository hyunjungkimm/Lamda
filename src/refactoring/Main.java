package refactoring;

public class Main {

    public static void doSomthing(Runnable r){
        r.run();
    }
    public static void doSomething(Task a){
        a.execute();
    }

    public static void main(String[] args) {
        //Task를 구현하는 익명 클래스를 전달 o
        doSomething(new Task(){
            public void execute(){
                System.out.println("Danger danger!!");
            }
        });

        //람다 - 메서드 호출시 Runnable 과 Task 모두 대상 형식이 될 수 있어서 문제 -> 누굴 가르키는지 알 수 없음
        doSomething(()-> System.out.println("Danger danger!!"));

        //명시적 형변환(모호함 제거)
        doSomething((Task)() -> System.out.println("Danger danger!!"));
    }




}
