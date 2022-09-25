package Strivers_DSA_Sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumOptimized {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        int arr[] = {1,0,-1,0,-2,2};
        Arrays.sort(arr);
        int target = 0;
        for(int i=0;i<arr.length;i++){
            int target3 = target- arr[i];
            for (int j = i+1; j < arr.length; j++) {
                int target2 = target3 - arr[j];
                int front = j+1;
                int back = arr.length-1;
                while(front<back){
                    int two_sum = arr[front]+arr[back];
                    if(two_sum<target2) front++;
                    else if(two_sum>target2) back--;
                    else{
                        List<Integer> quad = new ArrayList<>();
                        quad.add(arr[i]);
                        quad.add(arr[j]);
                        quad.add(arr[front]);
                        quad.add(arr[back]);
                        res.add(quad);
                        while(front<back && arr[front] == quad.get(2)) front++;
                        while(front<back && arr[back] == quad.get(3)) back--;

                    }
                }
                while(j+1<arr.length && arr[j+1] == arr[j]) j++;
            }
            while(i+1<arr.length && arr[i+1] == arr[i]) i++;
        }
        System.out.println(res);
    }
}