package Day1006.collectionmap;

import java.util.HashMap;

public class MapExercise2 {

    boolean isAlphabet(char c){
        if(c>='a'&&c<='z'||c>='A'&&c<='Z')
            return true;
        else
            return false;
    }

    public void alphaCount(){

    }
    public static void main(String[] args) {
        MapExercise2 mapExercise2 = new MapExercise2();
        String repoAddr ="https://github.com/KimGunWoo9595/Lion_Java_Pratice".toLowerCase();

        HashMap<Character, Integer> alphabetCnt = new HashMap<>();

        for(int i=0; i<repoAddr.length(); i++){
            if (mapExercise2.isAlphabet(repoAddr.charAt(i))) {
                alphabetCnt.put(repoAddr.charAt(i),alphabetCnt.getOrDefault(repoAddr.charAt(i),0)+1);
            //getOrDefault(key, Default-value) 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환한다.
            }
            System.out.println(alphabetCnt);
        }
    }
}
