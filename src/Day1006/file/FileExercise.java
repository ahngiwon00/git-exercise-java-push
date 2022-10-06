package Day1006.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExercise {

    public static void main(String[] args) throws FileNotFoundException {
        File dir= new File("./");
        File files[] = dir.listFiles();
        for(File file : files){
            System.out.println(file);
        }
    }
}
