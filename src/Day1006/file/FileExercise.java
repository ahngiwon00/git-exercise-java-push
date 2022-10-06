package Day1006.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExercise {

    public static void main(String[] args) throws FileNotFoundException {
        File dir= new File("./"); // ./->현재디렉토리 뜻함
        File files[] = dir.listFiles();
        //listFiles() : 디렉토리 경로에 있는 파일들을 배열로 리턴
        for(File file : files){
            System.out.println(file);
        }
    }
}

/*
.\.git
        .\.gitignore
        .\.idea
        .\a_file.txt
        .\java-project-exercise.iml
        .\out
        .\src
*/
