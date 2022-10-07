package Day1007.bigfile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {

    public List<PopulationMove> readFileByLine(String filename) throws IOException {
        //삽으로 푼다
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String str;
        while ((str = reader.readLine()) != null) {
            //System.out.println(str);
            PopulationMove pm= parse(str);
            pml.add(pm);
        }

        reader.close();
        return pml;
    }
    public void readByChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String fileContents="";
        while (fileContents.length()<1_000_000){
            char c = (char)fileReader.read();
            fileContents += c;//한글자씩 옴기면 오래걸린다
            System.out.println(fileContents);
        }
    }

    public void readByLine2(String filename){
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public String readFileByALine(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String data=reader.readLine();
        return data;
    }



    public PopulationMove parse(String data){
        String[] datalist;
        datalist=data.split(",");
        //return new PopulationMove(datalist[6],datalist[0]);
        return new PopulationMove(datalist[0],datalist[1]);
    }

    public void createAFile(String filename){
        File file = new File(filename);
        try {
            file.createNewFile();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //List<String>을 지정한 파일에 write
    public void write(List<String> strs, String filename){
        File file = new File(filename);


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for(String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido()+","+ populationMove.getToSido()+"\n";
    }

    public static void main(String[] args) throws IOException {
        //String address = "C:\\Users\\SoMin\\Downloads\\2021_인구관련연간자료_20220927_66125.csv";
        String address = "./from_to.txt";
        PopulationStatistics populationStatistics=new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readFileByLine(address);


        /*List<String> strings = new ArrayList<>();
        for(PopulationMove pm : pml){
            //System.out.println("전입:"+pm.getFromSido()+"전출"+pm.getToSido());
            String fromTo= populationStatistics.fromToString(pm);
            strings.add(fromTo);
        }*/

        //populationStatistics.createAFile("from_to.txt");  //파일생성

        //populationStatistics.write(strings,"./from_to.txt");

        for(PopulationMove pm : pml){
            System.out.printf("전입:%s, 전출:%s\n",pm.getFromSido(),pm.getToSido());
        }


    }
}
