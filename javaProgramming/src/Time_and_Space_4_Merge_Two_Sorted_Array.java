import java.util.Scanner;

public class Time_and_Space_4_Merge_Two_Sorted_Array {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    //write your code here
    int i=0,j=0,index=0;
    int[] arr = new int[a.length+b.length];
    while(i<a.length && j<b.length){
      if(a[i]<b[j]){
        arr[index] = a[i];
        i++;
      }
      else {
        arr[index] = a[j];
        j++;
      }
      index++;
    }

    while(i<a.length){
      arr[index] = a[i];
      i++;
      index++;
    }
    
    while(j<b.length){
      arr[index] = b[j];
      j++;
      index++;
    }
    return arr;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}
