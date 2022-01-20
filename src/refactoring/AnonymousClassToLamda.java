package refactoring;

public class AnonymousClassToLamda {
    public static void main(String[] args) {
        /*람다 - 변수를 가릴 수 없다.
        int a = 10;
        Runnable r1 = () -> {
            int a = 2;//( 컴파일 에러 )
            System.out.println(a);
        };
        */
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                int a = 2;// 모든 것이 잘 작동한다.
                System.out.println(a);
            }
        };

        r2.run();
    }

    //익명 클래스를 사용한 이전 코드
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello");
        }
    };
    //람다 표현식을 사용한 최신 코드
    Runnable runnable2 = () -> System.out.println("Hello");




}
