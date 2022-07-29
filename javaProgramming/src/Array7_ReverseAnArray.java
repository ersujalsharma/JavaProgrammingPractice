import java.util.Scanner;

public class Array7_ReverseAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr1[] = new int[size];
        int reversearray[] = new int[size];
        for (int i = 0,j=reversearray.length-1; i < reversearray.length&& j>=00; i++,j--) {
            arr1[i] = scanner.nextInt();
            reversearray[j] = arr1[i];
        }
        for (int i : reversearray) {
            System.out.print(i+" ");
        }
        }
    }
