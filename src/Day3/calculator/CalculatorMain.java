package Day3.calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Calculator randomNumbercalculator= new Calculator(numberGenerator);
        randomNumbercalculator.plus(20);

    }

}
