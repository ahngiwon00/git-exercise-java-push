package Day1006.collectionset;

public class AlphabetGenerator {

    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    public char generator() {
        char a = 'A';
        return (char)(a + randomNumberGenerator.generate(26)) ;
    }


}
