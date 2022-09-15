package Strivers_DSA_Sheet;

import java.util.Arrays;

/**
 * MajorityElements
 */
public class MajorityElementsUsingSorting {

    public static void main(String[] args) {
        int arr[]= {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        Arrays.sort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
        int max = 0;
        int max_element = 0;
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                else{
                    break;
                }
            }
            if(max<count){
                max = count;
                max_element = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(max_element);
    }
}