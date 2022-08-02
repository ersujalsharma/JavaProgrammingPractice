public class Arrays2D_6_ExitPointOfMatrix {
    public static void main(String[] args) {
        int arr[][] ={{0,0,1,0},{1,0,0,0},
        {0,0,0,0},{1,0,1,0}};
        int minrow = 0;
        int mincol = 0;
        int maxrow = arr.length-1;
        int maxcol = arr[0].length-1;
        int dir=0;
        while(minrow<=maxrow && mincol<=maxcol){
            // For Left To Right
            dir%=4;
            if (dir==0) {
                for (int j = mincol; j <= maxcol; j++) {
                    if(arr[minrow][j]==1){
                        System.out.print(arr[minrow][j]);
                        dir ++;
                    }
                    else{
                        System.out.print(arr[minrow][j]);
                    }
                    minrow++;
                }
            }
            if(dir==1){
                for (int i = minrow; i <= maxrow; i++) {
                    if(arr[i][maxcol]==1){
                        System.out.print(arr[i][maxcol]);
                        dir ++;
                    }
                    else{
                        System.out.print(arr[i][maxcol]);
                    }
                    maxcol--;
                }
            }
            if(dir==2){
                for (int j = maxcol; j >= mincol; j--) {
                    if(arr[maxrow][j]==1){
                        System.out.print(arr[maxrow][j]);
                        dir ++;
                    }
                    else{
                        System.out.print(arr[maxrow][j]);
                    }
                    maxrow--;
                }
            }
            if(dir==3){
                for (int i = maxrow; i >= minrow; i--) {
                    if(arr[i][mincol]==1){
                        System.out.print(arr[i][mincol]);
                        dir ++;
                    }
                    else{
                        System.out.print(arr[i][mincol]);
                    }
                    mincol++;
                }
            }
        }
    }
}
