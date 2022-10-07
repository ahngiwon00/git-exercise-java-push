package Day1007.fileSolid;

import Day1007.fileSolid.DoSomething;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLineContext<T> {
    DoSomething<T> doSomething;

    public List<T> readFileByLine(String filename) throws IOException {
        //삽으로 푼다
        List<T> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
            //PopulationMove pm= parse(str);
        }

        reader.close();
        return result;
    }
}
