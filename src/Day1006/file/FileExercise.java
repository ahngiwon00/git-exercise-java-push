package Day1006.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {
    public void printFiles(){
        File dir= new File("./"); // ./->현재디렉토리 뜻함
        File files[] = dir.listFiles();
        //listFiles() : 디렉토리 경로에 있는 파일들을 배열로 리턴
        for(File file : files){
            System.out.println(file);
        }
    }

    public char readAChar(String filename) throws IOException{
        FileReader fileReader= new FileReader(filename);
        return (char) fileReader.read();
    }

    public String read2Chars(String filename) throws IOException{
        FileReader fileReader= new FileReader(filename);
        String str= "";
        str+=(char)fileReader.read();
        str+=(char)fileReader.read();
        return str;
    }
    public String readNChars(String filename,int num) throws IOException {
        FileReader fileReader= new FileReader(filename);
        String str="";
        for(int i=0; i<num; i++){
            int asciiCd=fileReader.read();
            if(asciiCd==-1){
                return str;
            }
            str+=(char)asciiCd;
        }
        return str;
    }

    public static void main(String[] args) throws IOException {

        FileExercise fileExercise = new FileExercise();
        char c = fileExercise.readAChar("a_file.txt");
        System.out.println(c);
        String str= fileExercise.read2Chars("a_file.txt");
        System.out.println(str);
        String str1= fileExercise.readNChars("a_file.txt",20);
        System.out.println(str1);
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
