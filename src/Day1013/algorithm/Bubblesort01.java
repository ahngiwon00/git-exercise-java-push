package Day1013.algorithm;

public class Bubblesort01 {

    public int[] sort(int[] arr){
        int tmp;
        for(int i=0; i<arr.length-1; i++){

            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        //오름차순
        Bubblesort01 bubblesort01 = new Bubblesort01();
        for(int a : bubblesort01.sort(arr))
            System.out.println(a);
    }
}
