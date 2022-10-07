package Day1006.collectionmap;

import java.util.HashMap;

public class MapExercise3 {
    String address;
    HashMap<Character,Integer> alphacnt;

    public MapExercise3(String address, HashMap<Character, Integer> alphacnt) {
        this.address = address;
        this.alphacnt = alphacnt;
    }

    boolean isAlphabet(char c){
        if(c>='a'&&c<='z'||c>='A'&&c<='Z')
            return true;
        else
            return false;
    }
    public void alphaCount(){
        for(int i=0; i<this.address.length(); i++){
            if(isAlphabet(this.address.charAt(i)))
                alphacnt.put(this.address.charAt(i),
                        alphacnt.getOrDefault(this.address.charAt(i),0)+1);
        }

    }

    public static void main(String[] args) {
        String address="dsadddddsssaaads";
        MapExercise3 mapExercise3= new MapExercise3(address,new HashMap<>());
        mapExercise3.alphaCount();
        System.out.println(mapExercise3.alphacnt);

    }
}
