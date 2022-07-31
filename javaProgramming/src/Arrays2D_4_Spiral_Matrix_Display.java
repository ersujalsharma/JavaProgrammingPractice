import java.util.Scanner;
public class Arrays2D_4_Spiral_Matrix_Display {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int minrow =0;
        int mincol =0;
        int maxrow =arr.length-1;
        int maxcol =arr[0].length-1;
        int size = n*n;
        while (size-->0) {
            // For left_Wall
            for (int i = minrow; i <=maxrow; i++) {
                System.out.print(arr[i][mincol]+"\t");
            }
            mincol++;
            // For Bottom Wall
            for (int i = mincol; i <=maxcol ; i++) {
                System.out.print(arr[maxrow][i]+"\t");
            }
            maxrow--;
            // RightWall
            for (int i = maxrow; i >=minrow; i--) {
                System.out.print(arr[i][maxcol]+"\t");
            }
            maxcol--;
            // Top Wall
            for (int i = maxcol; i >= mincol; i--) {
                System.out.print(arr[minrow][i]+"\t");
            }
            minrow++;
            }
    }
}

