package Day1007.bigfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    //생성자
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    //생성자 오버로딩
    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);;
    }

    //getter

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }





}
