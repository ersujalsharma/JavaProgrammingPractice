package Strivers_DSA_Sheet;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * RepeatingAndMissingNumbers
 */
public class RepeatingAndMissingNumbers {

    public static void main(String[] args) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int arr[] = {3,1,2,5,4,6,7,5};
        for (int i : arr) {
            if(hashmap.containsKey(i)){
                hashmap.put(i,hashmap.get(i)+1);
            }
            else{
                hashmap.put(i,1);
            }
        }
        for(int i : hashmap.keySet()){
            if(hashmap.get(i)>1){
                arrayList.add(i);
            }
        }
        for (int i = 1; i <= arr.length; i++) {
            if(hashmap.containsKey(i) == false){
                arrayList.add(i);
            }
        }
        System.out.println(arrayList);
        int[] substitute = new int[arr.length+1];
        for (int i : arr) {
            substitute[i]++;
        }
        for (int i : substitute) {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i =1;i<substitute.length;i++){
            if(substitute[i] >1){
                System.out.println("Repeating Element "+i);
            }
            if(substitute[i]== 0){
                System.out.println("Missing Element " +i);
            }
        }
    }
}