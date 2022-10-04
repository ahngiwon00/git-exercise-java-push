import java.util.Scanner;

public class Test {

    public void Soultion(int money){

        /*int[] currentType= new int[]{50000,10000,5000,1000,500,100,50,10};
        for(int i=0; i<currentType.length; i++){
            System.out.println(currentType[i]+":" +money/currentType[i]);
            money=money%currentType[i];

        }*/

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
    public static void main(String[] args) {
        Test t = new Test();
        Scanner sc= new Scanner(System.in);
        int money= sc.nextInt();
        t.Soultion(money);

    }
}
