package refactoring;

import javax.management.loading.MLetMBean;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Supplier;
import java.util.logging.Level;

public class Logger {
    public static void main(String[] args) throws IOException {

        String oneLine = processFile((BufferedReader b) -> b.readLine());//람다 전달
        String twoLine = processFile((BufferedReader b) -> b.readLine()+b.readLine());//다른 람다 전달

    }

    public static String processFile(BufferedReaderProcessor p) throws IOException{
        try(BufferedReader br= new BufferedReader(new FileReader("ModerJavaInAction/chap9/data.txt"))){
            return p.process(br);//인수로 전달된 BufferedReaderProcessor를 실행
        }
    }//IOException을 던질 수 있는 람다의 함수형 인터페이스
}
