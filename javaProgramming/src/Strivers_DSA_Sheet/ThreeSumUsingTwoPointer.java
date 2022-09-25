package Strivers_DSA_Sheet;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ThreeSumUsingTwoPointer
 */
public class ThreeSumUsingTwoPointer {

    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int lo = i+1;
            int hi = arr.length-1;
            int sum = 0 - arr[i];
            while(lo<hi){
                int current = arr[i]+arr[lo]+arr[hi];
                if(current == 0){
                    System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
                }
                else if(current>sum){
                    hi--;
                }
                else{
                    lo++;
                }
                lo++;
                hi--;
            }
        }
    }
}