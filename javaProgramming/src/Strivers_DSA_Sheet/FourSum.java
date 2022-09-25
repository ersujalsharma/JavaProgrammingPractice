package Strivers_DSA_Sheet;

import java.util.Arrays;

/**
 * 4Sum
 */
public class FourSum {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = {1,0,-1,0,-2,2};
        Arrays.sort(arr);
        int target = 0;
        for(int i=0;i<arr.length;i++){
            for (int j = i+1; j < arr.length; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {
                    int left = target - (arr[i]+arr[j]+arr[j2]);
                    if(binarySearch(arr,j2+1,arr.length-1,left)){
                        System.out.println("Found");
                    }
                }
            }
        }
    }

    private static boolean binarySearch(int[] arr, int i, int j, int left) {
        while(i<j){
            int mid = (i+j)/2;
            if(arr[mid]==left){
                return true;
            }
            else if(arr[mid]<left){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return false;
    }
}