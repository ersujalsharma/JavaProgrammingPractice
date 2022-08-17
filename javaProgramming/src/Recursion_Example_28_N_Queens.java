import java.util.Scanner;

public class Recursion_Example_28_N_Queens {
    

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess,"",0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row == chess.length){
            System.out.println(qsf+".");
            return;
        }
        for (int col = 0; col < chess.length; col++) {
            if(isItTheSafePlaceForQueen(chess,row,col) == true){
                chess[row][col] =1;
                printNQueens(chess,qsf+row+"-"+col+", ",row+1);
                chess[row][col] =0;
            }
        }
    }
    private static boolean isItTheSafePlaceForQueen(int[][] chess, int row,int col){
        for (int i = row-1; i >=0 ; i--) {
            if(chess[i][col] == 1){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        for(int i = col-1;i>=0;i--){
            if(chess[row][i] == 1){
                return false;
            }
        }
        for (int i = row-1,j=col+1; j <chess.length && i>=0; i--,j++) {
            if(chess[i][j]==1){
                return false;
            }
        }
        return true;
    }
}
}
