package Day1005.calculator;

public class RandomNumberGenerator implements NumberGenerator{
    //0~a까지의 하나의 난수를 받는

    @Override
    public int generate(int a){
        return (int)(Math.random()*a);
    }

}
