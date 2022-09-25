package Strivers_DSA_Sheet;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        int arr[][] = new int[7][7];
        arr[0][0] = 1;
        for(int i =1;i<arr.length;i++){
            for(int j =0;j<=i;j++){
                if(j==0){
                    arr[i][j] = arr[i-1][j];
                }
                else{
                    arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
