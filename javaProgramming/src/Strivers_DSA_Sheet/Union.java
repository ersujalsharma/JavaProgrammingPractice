package Strivers_DSA_Sheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        int[] arr2 = {1,2,3,5};
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for (int i : arr) {
            hashmap.put(i,0);
        }
        for (int i : arr2) {
            hashmap.put(i,0);
        }
        System.out.println(hashmap);
        Set<Integer> hashset = new HashSet<>();
        for (int i : arr) {
            hashset.add(i);
        }
        for (int i : arr2) {
            hashset.add(i);
        }
        System.out.println(hashset);
        ArrayList<Integer> union = new ArrayList<>();
        int i=0,j=0;
        while(i<arr.length && j<arr2.length){
            if(arr[i] <= arr2[j]){
                if(union.size()==0 || union.get(union.size()-1) != arr[i])
                    union.add(arr[i]);
                i++;
            }else{
                if(union.size()==0 || union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
            while(i<arr.length){
                if(union.get(union.size()-1) != arr[i]){
                    union.add(arr[i]);
                }
                i++;
            }
            while(j<arr2.length){
                if(union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
            System.out.println(union);
            
    }
}
