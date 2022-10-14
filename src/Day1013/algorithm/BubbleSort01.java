package Day1013.algorithm;

public class BubbleSort01 {
    public int[] BbSort01(int[] arr){
        int tmp;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j-1]>arr[j]){
                    tmp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        //오름차순
        BubbleSort01 bubbleSort01 = new BubbleSort01();
        for(int a : bubbleSort01.BbSort01(arr))
            System.out.println(a);
    }
}
