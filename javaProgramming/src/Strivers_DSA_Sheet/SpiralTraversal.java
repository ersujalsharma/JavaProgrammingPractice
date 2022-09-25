package Strivers_DSA_Sheet;

public class SpiralTraversal {
    public static void main(String[] args) {
        int arr[][] = 
        {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int minrow = 0;
        int maxrow = arr.length-1;
        int mincol = 0;
        int maxcol = arr[0].length-1;
        int size = (arr.length*arr[0].length)-1;
        while((minrow < maxrow && mincol < maxcol))){
            //up Wall from left to right
            for(int j=mincol;j<=maxcol;j++){
                System.out.print(arr[minrow][j]+", ");
            }
            minrow++;
            // right wall;
            for(int i=minrow ;i<=maxrow;i++){
                System.out.print(arr[i][maxcol]+", ");
            }
            maxcol--;
            for (int j = maxcol; j >=mincol; j--) {
                System.out.print(arr[maxrow][j]+", ");
            }
            maxrow--;
            for (int i = maxrow; i >= minrow; i--) {
                System.out.print(arr[i][mincol]+", ");
            }
            mincol++;
        }
    }
}
