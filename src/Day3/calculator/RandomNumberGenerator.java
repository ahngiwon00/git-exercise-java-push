package Day3.calculator;

public class RandomNumberGenerator implements NumberGenerator{

    @Override
    public int generate(int a){
        return (int)(Math.random()*a);
    }

}
