package Strivers_DSA_Sheet.Recursion;

public class ReverseAnArrayUsingRecursion {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int i = 0;
        int j = arr.length-1;
        reverseArrayByRecursionUsingOnePoiner(arr,i);
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }

    private static void reverse(int[] arr, int i, int j) {
        if(i>=j){
            return;
        }
        swap(arr,i,j);
        reverse(arr, i+1, j-1);
    }

    private static void reverseArrayByRecursionUsingOnePoiner(int[] arr,int i){
        if(i>=arr.length/2){
            return;
        }
        swap(arr, i,arr.length-i-1);
        reverseArrayByRecursionUsingOnePoiner(arr, i+1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
