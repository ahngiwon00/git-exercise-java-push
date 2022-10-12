package Day1012.bigdata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename="C:\\Users\\SoMin\\Downloads\\서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals =hospitalLineReader.readLine(filename);

        List<String> hospitalList = new ArrayList<>();
        for(Hospital hospital : hospitals){
            hospitalList.add(hospital.toSqlString());
        }
        createFile createFile = new createFile();
        createFile.createAFile("sqlFile");

        fileWrite fileWrite = new fileWrite();
        fileWrite.write(hospitalList,"sqlFile");


    }
}
