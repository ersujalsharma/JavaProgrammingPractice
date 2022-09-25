package Strivers_DSA_Sheet;

import java.util.ArrayList;

public class PeakElementInArray {
    public static void main(String[] args) {
        int []arr = {3,5,4,1,1};
        ArrayList<Integer> list = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        //     if(i ==0){
        //         if(arr[i]>=arr[i+1]){
        //             list.add(arr[i]);
        //         }
        //     }
        //     else if(i == arr.length-1){
        //         if(arr[i] >= arr[i-1]){
        //             list.add(arr[i]);
        //         }
        //     }
        //     else{
        //         if(arr[i-1]<=arr[i] && arr[i]>=arr[i+1]){
        //             list.add(arr[i]);
        //         }
        //     }
        // }
        // System.out.println(list);
        int start = 0;
        int end = arr.length-1;
        int ans=0;
        while(start<end){
            int mid = (start+end)/2;
            if(mid ==0){
                ans = arr[0]>=arr[1] ? arr[0] : arr[1];
                break;
            }
            if(mid == arr.length-1){
                ans = arr[arr.length-1] >= arr[arr.length-2] ? arr[arr.length-1] : arr[arr.length-2];
                break; 
            }
            if(arr[mid] >= arr[mid-1] && arr[mid]>= arr[mid+1]){
                ans = arr[mid];
                break;
            }
            if(arr[mid]<arr[mid-1]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        System.out.println(arr[start+1]);
    }
}
