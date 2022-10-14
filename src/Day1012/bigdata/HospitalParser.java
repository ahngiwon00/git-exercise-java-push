package Day1012.bigdata;

public class HospitalParser implements Parser<Hospital>{
    @Override
    public Hospital parse(String str){
        str=str.replace("\"","");//"A1233442" 이런씩으로 추출되기때문에 "문자를 지우는 로직
        String[] splitted = str.split(",");//,씩 끊어서 splitted배열에 넣음

        return new Hospital(splitted[0],splitted[1],splitted[2],splitted[6],splitted[10]);
    }
}
