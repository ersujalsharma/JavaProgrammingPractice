package Strivers_DSA_Sheet;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] reverseArray = new int[arr.length];
        int i=arr.length-1;
        int j=0;
        while(i>=0){
            reverseArray[j] = arr[i];
            j++;
            i--;
        }
        for (int k : reverseArray) {
            System.out.print(k+" ");
        }
    }
}
