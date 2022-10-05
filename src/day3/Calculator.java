package day3;
interface Radom{
    public void RandomNumber();
}
public class Calculator implements Radom{
    private int a;
    private int b;

    @Override
    public void RandomNumber() {
        this.b=(int)(Math.random()*10);
    }


    public Calculator(int a) {
        this.a = a;
    }

    public void plus(){
        System.out.println(a+b);
    }
    public void minus(){
        System.out.println(a-b);
    }
    public void multiple(){
        System.out.println(a*b);
    }
    public void divide(){
        if(b==0)
            System.out.println("램덤숫자가 0입니다");
        else
            System.out.println((float) a/b);

    }

}
