package Day3.Calculator2;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new ByPassNumberCreator());
        calculator.plus(10);
    }
}
