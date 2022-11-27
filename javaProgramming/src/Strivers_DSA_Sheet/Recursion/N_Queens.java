package Strivers_DSA_Sheet.Recursion;

import java.util.ArrayList;

public class N_Queens {
    public static void main(String[] args) {
        int n = 4;
        int chess[][] = new int[n][n];
        boolean[] cols = new boolean[n];
        boolean[] nordia = new boolean[2*n-1];
        boolean[] revdia = new boolean[2*n-1];
        solve(chess,0,n,cols,nordia,revdia);
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess[0].length;j++){
                System.out.print(chess[i][j]+"\t");
            }
            System.out.println();
        }
    }

    private static void solve(int[][] chess, int row, int n, boolean[] cols,
    boolean[] nordia,boolean[] revdia) {
        if(row == n){
            return;
        }
        for(int col = 0;col<n;col++){
            if(cols[col] == false && nordia[row+col] == false && revdia[row-col+n-1] == false){
                chess[row][col] = 1;
                cols[col] = true;
                nordia[row+col] = true; 
                revdia[row-col+n-1] = true;
                solve(chess,row+1,n,cols,nordia,revdia);
                revdia[row-col+n-1] = false;
                nordia[row+col] = false;
                cols[col] = false;
                chess[row][col] = 0;
            }
        }
    }
}
