package Day1006.collectionset;

import java.util.HashSet;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator= new RandomNumberGenerator();
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<50; i++){
            set.add(randomNumberGenerator.generate(20));
        }
        for(int x : set){
            System.out.println(x);
        }
        System.out.println(set.size());


    }
}
