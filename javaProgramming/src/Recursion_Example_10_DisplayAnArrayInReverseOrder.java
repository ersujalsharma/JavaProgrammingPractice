public class Recursion_Example_10_DisplayAnArrayInReverseOrder {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i=0;
        displayArrayInReverseOrder(arr,i);
    }

    private static void displayArrayInReverseOrder(int[] arr, int i) {
        if(i == arr.length){
            return;
        }
        displayArrayInReverseOrder(arr, i+1);
        System.out.println(arr[i]);
    }
}
