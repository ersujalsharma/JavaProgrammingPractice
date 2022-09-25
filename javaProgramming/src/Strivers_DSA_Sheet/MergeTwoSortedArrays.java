package Strivers_DSA_Sheet;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1,4,8,10};
        int arr2[] = {2,3,9};
        // int k;
        // for(int i=0;i<arr1.length;i++){
        //     if(arr1[i]>arr2[0]){
        //         int temp = arr1[i];
        //         arr1[i] = arr2[0];
        //         arr2[0] = temp; 
        //     }
        //     int first = arr2[0];
        //     for(k = 1;k<arr2.length&& arr2[k]<first;k++){
        //         arr2[k-1] = arr2[k];
        //     }
        //     arr2[k-1] = first; 
        // }
        // for(int i:arr1){
        //     System.out.println(i);
        // }
        // for(int j:arr2){
        //     System.out.println(j);
        // }
        int gap = arr1.length+arr2.length/2;
        while(gap>0){
            int i=0;
            int j = gap;
            while(j<(arr1.length+arr2.length)){
                if(j<arr1.length){
                    swap(arr1[i],arr1[j]);
                }
                else if(j>=arr1.length && i<arr1.length && arr1[i]>arr2[j-arr1.length]){
                    swap(arr1[i],arr2[j-arr1.length]);
                }
                else if(j>=arr1.length && i>=arr1.length && arr2[i-arr1.length]>arr2[j-arr1.length]){
                    swap(arr1[i-arr1.length],arr2[j-arr1.length]);
                }
                j++;
                i++;
            }
            if(gap == 1){
                gap =0;
            }
            else{
                gap = gap/2;
            }
        }
    }
    
}
