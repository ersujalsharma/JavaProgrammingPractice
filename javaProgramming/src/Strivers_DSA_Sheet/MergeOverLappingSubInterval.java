package Strivers_DSA_Sheet;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverLappingSubInterval {
    public static void main(String[] args) {
        int arr[][] = {{1,3},{3,6},{8,10},{9,9},{15,18}};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            int start = arr[i][0];
            int end = arr[i][1];
            if(list.size()!=0){
                if(start<=list.get(list.size()-1).get(1));
                continue;
            }
            for(int j = i+1;j<arr.length;j++){
                if(arr[j][0] <= end){
                    end = Math.max(end,arr[j][1]);
                }
            }
            end = Math.max(end,arr[i][1]
}
