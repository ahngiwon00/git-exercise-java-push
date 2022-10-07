package Day1007.bigfile;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationReview {

    //한줄씩 출력하는 메소드
    public void readByLine2(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));

        String line;
        while((line= br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
    //List<PopulationMoveReview> 리턴하는 메소드
    public List<PopulationMoveReview> readByLine(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename)); //파일을 읽기 위해 사용
        List<PopulationMoveReview> pml = new ArrayList<>(); //PopulationMoveReview 타입인 배열리스트 생성

        String line;
        while((line= br.readLine())!=null){
            pml.add(parse(line));//PopulationMoveReview 타입인 배열리스트에 전입도시 전출도시 추출해서(parse 메소드 사용) 추가
        }
        br.close();

        /*for(int i=0; i<pml.size(); i++){ //배열이 잘 생성 되었나 확인 차 작성
            System.out.println(pml.get(i).getFromSido()+","+pml.get(i).getToSido());
        }*/
        return pml;
    }


    //data라는 문자열을 "," 잘라서 datas 배열에 넣는 메소드
    //리턴값이 PopulationMove 클래스 이다. PopulationMove 객체를 생성해서 리턴해준다.
    //PopulationMove 는 int 로 매개변수를 받기 때문에 String을 받을려면 오버로딩을 해야한다.
    public PopulationMoveReview parse(String data){
        String[] datas;
        datas=data.split(",");
        //return new PopulationMoveReview(datas[6],datas[0]); //인구관련연간자료_20220927_66125.csv 추출
        return new PopulationMoveReview(datas[0],datas[1]); //fromto_file.txt  추출
    }
    //파일 생성 메소드
    public void createAFile(String filename) throws IOException {
        File file = new File(filename);
        file.createNewFile();
    }

    //BufferWriter을 이용해 String리스트를 파일에 적는 메소드
    public void write(List<String> strs,String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for(String str : strs){
            writer.write(str);
        }
        writer.close();
    }

    // ex)KEY:서울,부산 VALUE:카운트샘
   public Map<String,Integer> getMoveCntMap(List<PopulationMoveReview> pml){
        Map<String, Integer> map = new HashMap<>();
        for(PopulationMoveReview pm : pml){
            String key = pm.getFromSido() + "," + pm.getToSido();
            map.put(key,map.getOrDefault(key,0)+1);
        }
        return map;
    }









    public static void main(String[] args) throws IOException {
        String address = "C:\\Users\\SoMin\\Downloads\\2021_인구관련연간자료_20220927_66125.csv";
        PopulationReview pr = new PopulationReview();

        //pr.createAFile("fromto_file.txt"); //파일생성
        String address1="./fromto_file.txt"; //생성한파일주소

        /*//address 파일을 읽고 전입도시 전출도시를 추출한 리스트를 만드는 메소드 실행
        List<PopulationMoveReview> pml= pr.readByLine(address);
        //전입도시 전출도시를 추출한 리스트(타입:PopulationMoveReview)를 String타입인 strs리스트로 옴김
        List<String> strfromto = new ArrayList<>();
        for(PopulationMoveReview pm : pml){
            strfromto.add(pm.getFromSido()+","+ pm.getToSido()+"\n");
        }
        pr.write(strfromto,address1);//옴긴 strs리스트를 파일에 적는 메소드 실행*/

        List<PopulationMoveReview> pml= pr.readByLine(address1);

        Map<String, Integer> map = pr.getMoveCntMap(pml); //map 객체 생성 후 getMoveCntMap실행
        List<String> strheatmap = new ArrayList<>(); // map의 키와 벨류 값을 옴길 string리스트 생성
        pr.createAFile("review_heatmap.txt");
        String address2 = "./review_heatmap.txt";
        for(String key : map.keySet()){ //map 키 값만 꺼냄
            String[] fromto = key.split(","); //from,to 를 분리해서 배열에 넣음
            String s = String.format("[%s, %s, %d]\n",fromto[0],fromto[1],map.get(key));
            strheatmap.add(s);
        }
        pr.write(strheatmap,address2);

    }

}
