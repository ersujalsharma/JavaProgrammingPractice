package Strivers_DSA_Sheet;

import java.util.HashSet;

/**
 * RemoveDuplicatesinArray
 */
public class RemoveDuplicatesinArray {

    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,2,2,2,2,2,3,3,3,4};
        HashSet<Integer> hashset = new HashSet<>();
        for (int i : arr) {
            hashset.add(i);
        }
        int size = hashset.size();
        int j =0;
        for (Integer integer : hashset) {
            arr[j++] = integer;
        }
        for (int a : arr) {
            System.out.print(a+" ");
        }
        System.out.println(size);
    }
}