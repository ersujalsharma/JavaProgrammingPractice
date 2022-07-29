import java.util.Scanner;

public class Array8_ReverseOfAnArrayUsingOneArrayOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scanner.nextInt();
        }
        int i=0;
        int j=arr.length-1;
        while(i<j){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }
}
