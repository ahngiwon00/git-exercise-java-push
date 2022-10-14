package Day1012.bigdata;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineReader<T> {
    Parser<T> parser; //parser 인터페이스를 사용할 것이다라고 선언 (타입이 있는)

    public LineReader(Parser<T> parser) { //생성자 생성
        this.parser = parser;
    }

    List<T> readLine(String filename) throws IOException {
        List<T> result = new ArrayList<>(); //결과값 Array리스트 생성
        BufferedReader br= new BufferedReader(new FileReader(filename));//파일을 읽어오는 객체 생성
        br.readLine(); //첫줄은 지나침

        String str;
        while ((str = br.readLine()) != null) { //한줄씩 읽으면서 null까지 루프)

            result.add(parser.parse(str));
            // 한줄을 읽어드려 parser 메소드에서 추출된 값을 result인 Array리스트에 더해줌
            // 메인에서 LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
            //Parser<Hospital> parser = new HospitalParser();
            //parse.parse-> HospitalParser.parse(str)을 실행하게됨
        }
        return result; //타입이 병원인 리스트 값을 반환함
    }
}
