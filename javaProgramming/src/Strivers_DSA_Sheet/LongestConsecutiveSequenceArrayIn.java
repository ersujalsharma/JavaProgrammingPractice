package Strivers_DSA_Sheet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceArrayIn {
    public static void main(String[] args) {
        int arr[] = {100,200,1,2,3,4};
        Arrays.sort(arr);
        int start = arr[0];
        int cur = 1;
        int ans = 1;
        // for(int i=1; i<arr.length;i++){
        //      if(arr[i] == start+1){
        //         cur++;
        //      }
        //      else if(arr[i] != start){
        //         cur = 1;
        //      }
        //      start = arr[i];
        //      ans = Math.max(ans,cur);
        // }
        // System.out.println(ans);
        Set<Integer> hashset = new HashSet<Integer>();
        for(int i: arr){
            hashset.add(i);
        }

        int maxstreak = Integer.MIN_VALUE;
        for(int nums: arr){
            if(!hashset.contains(nums-1)){
                int currentNUm = nums;
                int currentStreak = 1;
                while(hashset.contains(currentNUm+1)){
                    currentNUm+=1;
                    currentStreak++;
                }
                maxstreak = Math.max(maxstreak,currentStreak);
            }
        }
        System.out.println(maxstreak);
    }
}
