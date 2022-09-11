package Strivers_DSA_Sheet;


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
		int arr[] = {10,5,10,15,10,5};
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(hashMap.containsKey(arr[i])){
				int val = hashMap.get(arr[i]);
				val++;
				hashMap.put(arr[i], val);
			}
			else{
				hashMap.put(arr[i],1);
			}
		}
		System.out.println(hashMap);
	 }
}