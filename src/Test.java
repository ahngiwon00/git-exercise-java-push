import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int money=25430;
        int c50000= 50000;
        int c10000= 10000;
        int c5000= 5000;
        int c1000 = 1000;
        int c500= 500;
        int c100= 100;
        int c50= 50;
        int c10= 10;

        System.out.println("오만원권:"+money/c50000+" 나머지:"+money%c50000);
        money=money%c50000;
        System.out.println("만원권: "+money/c10000+" 나머지:"+money%c10000);
        money=money%c10000;
        System.out.println("오천원: "+money/c5000+" 나머지:"+money%c5000);
        money=money%c5000;
        System.out.println("천원: "+money/c1000+" 나머지:"+money%c1000);
        money=money%c1000;
        System.out.println("오백원: "+money/c500+" 나머지:"+money%c500);
        money=money%c500;
        System.out.println("백원: "+money/c100+" 나머지:"+money%c100);
        money=money%c100;
        System.out.println("오십원: "+money/c50+" 나머지:"+money%c50);
        money=money%c50;
        System.out.println("십원: "+money/c10+" 나머지:"+money%c10);
        money=money%c10;


    }
}
