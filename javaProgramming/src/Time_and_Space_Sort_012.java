import java.util.Scanner;

public class Time_and_Space_Sort_012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }
        int i=0;
        int j=0;
        int k=arr.length-1;
        while(i<=k){
            if(arr[i] == 1){
                i++;
            }
            else if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2]+" ");
        }
    }
}
