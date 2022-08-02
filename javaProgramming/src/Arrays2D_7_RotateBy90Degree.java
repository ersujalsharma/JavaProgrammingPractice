import java.util.Scanner;

/**
 * Arrays2D_7_RotateBy90Degree
 */
public class Arrays2D_7_RotateBy90Degree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][]arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >=0; j--) {
                System.out.print(arr[j][i]+"\t");
            }
            System.out.println();
        }
    }
}