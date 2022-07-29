import java.util.Scanner;

public class Array10_RotationOfAnArrayByDivideAndConquer {
    private static void reverse(int[] arr ,int i,int j){
        while(i<j){
            arr[i] = arr[i]+arr[j];
            arr[j] = arr[i]-arr[j];
            arr[i] = arr[i]-arr[j];
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int RotationNumber=scanner.nextInt();
        RotationNumber%=size;
        if(RotationNumber<0){
            RotationNumber+=size;
        }
        int i=0;
        int j=arr.length;
        reverse(arr, i, j-RotationNumber-1);
        reverse(arr, j-RotationNumber,j-1 );
        reverse(arr, i, j-1);
        for (int j2 : arr) {
            System.out.print(j2+" ");
        }
    }
}
