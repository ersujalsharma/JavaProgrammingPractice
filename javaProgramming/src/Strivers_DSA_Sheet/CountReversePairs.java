package Strivers_DSA_Sheet;

import java.util.ArrayList;

public class CountReversePairs {
    public static void main(String[] args) {
        int arr[] = {1,3,2,3,1};
        int ans = reversePair(arr);
        System.out.println(ans);
    }

    private static int reversePair(int[] arr) {
        return mergeSort(arr,0,arr.length-1);
        
    }

    private static int mergeSort(int[] arr, int i, int j) {
        int ans =0;
        if(i<j){
            int mid= i+(j-i)/2;
            ans += mergeSort(arr, i, mid);
            ans += mergeSort(arr, mid+1, j);
            ans += merge(arr,i,mid,j);
        }
        return ans;
    }

    private static int merge(int[] arr, int low, int mid, int high) {
        int count = 0;
        int j = mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high&& arr[i] >(2*(long)arr[j])){
                j++;
            }
            count += j-(mid+1);
        }
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low ,right =mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
            }
        }
        while(left<=mid){
            temp.add(arr[left++]);
        }
        while(right<=high){
            temp.add(arr[right++]);
        }
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
        return count;
    }
    
}
