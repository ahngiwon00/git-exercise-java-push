package Day1006.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./a_file.txt");
        for(int i=0; i<2; i++){
            System.out.println((char) reader.read());
        }
       /* char c= (char) reader.read();
        System.out.println(c);*/

    }
}
