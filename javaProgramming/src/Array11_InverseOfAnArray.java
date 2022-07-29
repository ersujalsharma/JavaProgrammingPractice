import java.util.Scanner;

public class Array11_InverseOfAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        int inversed_Array[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            inversed_Array[arr[i]]=i;
        }
        for (int i : inversed_Array) {
            System.out.print(i+" ");
        }
    }
}
