public class Recursion_Example_11_MaxOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
    int index=0;
    int max = maxOfAnArray(arr,index);
    System.out.println(max);
    }

    private static int maxOfAnArray(int[] arr, int index) {
        if(index>=arr.length){
            return Integer.MIN_VALUE;
        }
        int misa = maxOfAnArray(arr, index+1);
        if(arr[index]>misa){
            return arr[index];
        }
        return misa;
    }
    
    
}
