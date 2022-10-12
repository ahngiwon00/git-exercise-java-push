package Day1012.maxmin;

interface Compare{
    boolean doSomething(int valueA, int valueB);
}



public class MaxAndMin {

    private int getMaxOrMin(int[] arr, Compare compare){
        int tragetValue= arr[0];
        for(int i=1; i<arr.length; i++){
            boolean isSth= compare.doSomething(arr[i],tragetValue);
            //max인 경우 arr[i] > targetValue
            //min인 경우 arr[i] < targetValue
            if(isSth){
                tragetValue= arr[i];
            }
        }
        return tragetValue;

    }
    public int max(int[] arr){
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA>valueB;
            }
        });
    }
    public int min(int[] arr){
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA<valueB;
            }
        });
    }

    public static void main(String[] args) {
        int[] arr= new int[]{3,29,38,12,57,74,40,85,61};
        MaxAndMin maxAndMin = new MaxAndMin();
        int maxResult = maxAndMin.max(arr);
        System.out.println(maxResult);
        int minResult = maxAndMin.min(arr);
        System.out.println(minResult);
    }
}
