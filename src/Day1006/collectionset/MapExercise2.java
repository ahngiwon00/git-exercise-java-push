package Day1006.collectionset;

import java.util.HashMap;

public class MapExercise2 {
    public static void main(String[] args) {
        String repoAddr ="https://github.com/KimGunWoo9595/Lion_Java_Pratice";
        HashMap<Character, Integer> alphabetCnt = new HashMap<>();
        repoAddr= repoAddr.toLowerCase();
        for(int i=0; i<repoAddr.length(); i++){
            if (repoAddr.charAt(i) >= 97 && repoAddr.charAt(i) < 122) {
                alphabetCnt.put(repoAddr.charAt(i),alphabetCnt.getOrDefault(repoAddr.charAt(i),0)+1);
            }
            System.out.println(alphabetCnt);
        }

    }

}
