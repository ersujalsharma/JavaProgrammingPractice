package Strivers_DSA_Sheet;

import java.util.HashMap;

public class CountNumbersofSubArraysWithGivenXoRK {
    public static void main(String[] args) {
        int arr[]= {4,2,2,6,4};
        HashMap<Integer,Integer> visited = new HashMap<>();
        int k = 6;
        int sum =0;
        int count=0;
        int i=0;
        while(i<arr.length){
            sum ^= arr[i]; 
            if(visited.containsKey(sum^k)){
                count+= visited.get(sum^k);
            }
            if(sum == k){
                count++;
            } 
            if(visited.containsKey(sum)){
                visited.put(sum, visited.get(sum)+1);
            }
            else{
                visited.put(sum,1); 
            }
            i++;
        }
        System.out.println(count);
        
    }
}
