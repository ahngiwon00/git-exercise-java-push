package even_odd2;

import java.util.Scanner;

public class Main {

    public void printEvenOdd(int num){
        if(num%2==0){
            System.out.print("짝수");
        }
        else
            System.out.print("홀수");
    }


    public void printEvenOdd(int num1,int num2){
        if((num1+num2)%2==0){
            System.out.println("짝수");
        }
        else
            System.out.println("홀수");
    }



    public static void main(String[] args) {
        Main t= new Main();
        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        t.printEvenOdd(num1);
        System.out.print("+");
        t.printEvenOdd(num2);
        System.out.print("=");
        t.printEvenOdd(num1,num2);

    }


}
