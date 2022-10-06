package Day1006.collectionset;

import java.util.HashSet;
import java.util.Set;

public class AlphabetWithoutDuplicate {
    public static void main(String[] args) {
        AlphabetGenerator alphabetGenerator= new AlphabetGenerator();
        Set<Character> set = new HashSet<>();

        for(int i=0; i<50; i++){
            set.add(alphabetGenerator.generator());
        }
        for(char x : set)
            System.out.println(x);
        System.out.println(set.size());

    }


}
