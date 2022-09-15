package Strivers_DSA_Sheet;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1};
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
