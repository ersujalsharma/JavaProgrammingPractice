public class Arrays2D_6_ExitPointOfMatrix {
    public static void main(String[] args) {
        int arr[][] ={{0,0,1,0},{1,0,0,0},
        {0,0,0,0},{1,0,1,0}};
        int minrow = 0;
        int mincol = 0;
        int maxrow = arr.length-1;
        int maxcol = arr[0].length-1;
        while (minrow<=maxrow && mincol<=maxcol) {
            for(int i=mincol;i<=maxcol;i++){
                if(arr[minrow][i]==1){
                    System.out.print(arr[minrow][i]+" ");
                    break;
                }
                else{
                    System.out.print(arr[minrow][i]+" ");
                }
            }
            minrow++;
            // Right Wall
            for (int i = minrow; i <= maxrow; i++) {
                if(arr[i][maxcol]==1){
                    System.out.print(arr[i][maxcol]+" ");
                    break;
                }
                else{
                    System.out.print(arr[i][maxcol]+" ");
                }
            }
            maxcol--;
            // Bottom
            for (int i = maxcol; i >= mincol; i--) {
                if(arr[maxrow][i]==1){
                    System.out.print(arr[maxrow][i]+" ");
                    break;
                }
                else{
                    System.out.print(arr[maxrow][i]+" ");
                }
            }
            maxrow--;
            //Left
            for (int i = maxrow; i >= minrow; i--) {
                if(arr[i][mincol]==1){
                    System.out.print(arr[i][mincol]+" ");
                    break;
                }
                else{
                    System.out.print(arr[i][mincol]+" ");
                }
            }
            mincol++;
        }
    }
}
