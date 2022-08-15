import java.util.Scanner;

public class Recursion_backtracking_Flood_fill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        int start_row =0;
        int start_col =0;
        String ans ="";
        printFloodFill(arr,start_row,start_col,n,m,ans);
    }

    private static void printFloodFill(int[][] arr, int start_row, int start_col, int n, int m, String ans) {
        if(start_col == m || start_row==n){
            System.out.println(ans);
            return;
        }    
        //
        //down row+1;
        printFloodFill(arr, start_row+1, start_col, n, m, "d"+ans);
        // up
        printFloodFill(arr, start_row-1, start_col, n, m, "t"+ans);
        // right col+1
        printFloodFill(arr, start_row, start_col+1, n, m, "r"+ans);
        // leftcol col-1
        printFloodFill(arr, start_row, start_col-1, n, m, ans);
    }
}
