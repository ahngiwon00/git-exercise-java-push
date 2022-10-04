import java.util.Scanner;

public class Test {

    public void Soultion(int money){
        System.out.println("오만원권:" +money/50000);
        money=money%50000;
        System.out.println("만원권: "+money/10000);
        money=money%10000;
        System.out.println("오천원: "+money/5000);
        money=money%5000;
        System.out.println("천원: "+money/1000);
        money=money%1000;
        System.out.println("오백원: "+money/500);
        money=money%500;
        System.out.println("백원: "+money/100);
        money=money%100;
        System.out.println("오십원: "+money/50);
        money=money%50;
        System.out.println("십원: "+money/10);
        money=money%10;





    }
    public static void main(String[] args) {
        Test t = new Test();
        Scanner sc= new Scanner(System.in);
        int money= sc.nextInt();
        t.Soultion(money);

    }
}
