package Strivers_DSA_Sheet;

import java.util.Arrays;

public class FindLargestElementInArray {
    // public static void main(String[] args) {
    //     int[] arr = {2,5,1,3,0};
    //     Arrays.sort(arr);
    //     System.out.println(arr[arr.length-1]);
    // }
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if(i>max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }
        System.out.println(max);
        System.out.println(min);
        int secondsmallest = Integer.MAX_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i:arr){
            if(i<secondsmallest && i != min){
                secondsmallest = i;
            }
            if(i>secondlargest && i != max){
                secondlargest = i;
            }
        }
            System.out.println(secondlargest);
            System.out.println(secondsmallest);
    }
}
