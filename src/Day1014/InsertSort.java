package Day1014;

import java.util.Arrays;

public class InsertSort {
    public int[] insertSort(int[] arr){
        for(int i =1; i<arr.length; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8, 5, 6, 2, 4};
        InsertSort is = new InsertSort();
        System.out.println(Arrays.toString(is.insertSort(arr)));
    }
}
