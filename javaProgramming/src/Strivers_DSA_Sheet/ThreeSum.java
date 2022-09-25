package Strivers_DSA_Sheet;

import java.util.ArrayList;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    ArrayList<Integer> list = new ArrayList<>();
                    if(arr[i]+arr[j]+arr[k] == 0){
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                    }
                    if(list.size()!=0){
                        ans.add(list);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
