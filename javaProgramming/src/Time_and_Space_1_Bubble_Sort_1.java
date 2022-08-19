import java.util.Scanner;

public class Time_and_Space_1_Bubble_Sort_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println("Ek E");
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}