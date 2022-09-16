package Strivers_DSA_Sheet;

import java.util.ArrayList;
import java.util.List;

public class PermutationUsingRecursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        List<List<Integer>> list =new ArrayList<>();
        findpermutation(arr,0,list);
        System.out.println(list);
    }

    private static void findpermutation(int[] arr, int index, List<List<Integer>> list) {
        
        if(index == arr.length){
            ArrayList<Integer> innerlist = new ArrayList();
            for(int i:arr){
                innerlist.add(i);
            }
            list.add(innerlist);
            return;
        }

        for(int i = index ;i<arr.length;i++){
            swap(arr,i,index);
            findpermutation(arr, index+1, list);
            swap(arr,i,index);
        }
    }

    private static void swap(int[] arr, int i, int index) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}
