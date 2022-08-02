import java.util.Scanner;

public class Arrays2D_RingRotate {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        int s = 1;
        int r = 4;
        int minrow = s-1;
        int mincol = s-1;
        int maxrow = arr.length;
        int maxcol = arr[0].length;
        int size = 2*(maxrow-minrow) +2*(maxcol-mincol);
        int []OneDArray = new int [size];
        int index=0;
        //Left TO Right Top Wall
        for (int i = mincol; i < maxcol; i++) {
            OneDArray[index] = arr[minrow][i];
            index++;
        }
        maxrow+=1;
        //Top To bottom Right Wall
        for (int i = minrow; i < maxrow; i++) {
            OneDArray[index] = arr[i][maxcol];
            index++;
        }
        maxcol-=1;
        // Right to Left Bottom Wall
        for (int i = maxcol; i > mincol; i--) {
            OneDArray[index] = arr[maxrow][i];
            index++;
        }
        maxrow-=1;
        // Bottom to Top Left Wall;
        for (int i = maxrow; i > minrow; i--) {
            OneDArray[index] = arr[i][mincol]; 
            index++;
        }
        
        for (int i = 0; i < OneDArray.length; i++) {
            System.out.print(OneDArray[i]+"\t");
        }
    }
}
 