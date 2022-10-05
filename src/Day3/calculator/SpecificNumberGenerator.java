package Day3.calculator;

public class SpecificNumberGenerator implements NumberGenerator{

    @Override
    public int generate(int a){
        return 2000*a;
    }
}
