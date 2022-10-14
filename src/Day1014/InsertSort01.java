package Day1014;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort01 {
    public int[] insertSort(int[] arr){
        for(int i =1; i<arr.length; i++){
            int key=arr[i];
            for(int j=i-1; j>=0; j--){
                if(arr[j]>arr[j+1]){
                    arr[j+1]=arr[j];
                    arr[j]=key;
                    key=arr[j];

                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        InsertSort01 insertSort01=new InsertSort01();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int a : insertSort01.insertSort(arr))
            System.out.println(a);


    }
}
