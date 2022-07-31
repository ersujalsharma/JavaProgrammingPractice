import java.util.Scanner;
public class Arrays2D_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int arr1[][] = new int[row][col];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }
        int arr2[][] = new int[row][col];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }
        int newArray[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                for (int j2 = 0; j2 < col; j2++) {
                    newArray[i][j] += arr1[i][j2]*arr2[j2][j]; 
                }
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                System.out.print(newArray[i][j]+" ");
            }
            System.out.println(); 
        }
    }
}