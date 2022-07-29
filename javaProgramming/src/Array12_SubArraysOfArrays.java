import java.util.Scanner;

public class Array12_SubArraysOfArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for (int j = i; j < arr.length; j++) {
               for (int j2 = i; j2 <=j; j2++) {
                    System.out.print(arr[j2]+" ");
               }
               System.out.println();
            }
            
        }
    }
}
