import java.util.Scanner;

public class Recursion_Example_9_DisplayAnArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int index=0;
        displayArray(arr,index);
    }

    private static void displayArray(int[] arr, int index) {
        if(index>=arr.length){
            return;
        }
        System.out.println(arr[index]);
        displayArray(arr, index+1);
    }
}
