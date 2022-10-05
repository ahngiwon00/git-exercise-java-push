package Day3.calculator;

public class Calculator {
    //NunberMaker에서 만들어준 숫자를 가지고 사칙연산한 결과를 출력한다
    private NumberGenerator numberGenerator; //인터페이스 사용 할 것이다 라고 선언

    public Calculator(NumberGenerator numberGenerator) { //numbergenerator di를 받을수 있게 끔 파라미터를 뚫어준 생성자
        this.numberGenerator = numberGenerator;
    }

    public void plus(int a){
        int result = a+this.numberGenerator.generate(10);
        System.out.println(result);
    }
}
