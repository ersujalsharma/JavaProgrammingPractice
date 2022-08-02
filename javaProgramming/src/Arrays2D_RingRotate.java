import java.util.Scanner;

public class Arrays2D_RingRotate {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        int s = 1;
        int r = 4;
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;
        int size = 2*(maxr-minr) + 2*(maxc-minc);
        int []oned = new int [size];
        int index=0;
        //Left TO Right Top Wall
        for (int i = minr, j = minc; i <= maxr; i++) {
            oned[index] = arr[i][j];
            index++;
        }
    
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
        oned[index] = arr[i][j];
        index++;
        }
    
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
        oned[index] = arr[i][j];
        index++;
        }
    
        for (int i = minr, j = maxc - 1; j > minc; j--) {
        oned[index] = arr[i][j];
        index++;
        }
        

        minr = s - 1;
        minc = s - 1;
        maxr = arr.length - s;
        maxc = arr[0].length - s;

        index = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
        arr[i][j] = oned[index];
        index++;
        }

        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
        arr[i][j] = oned[index];
        index++;
        }

        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
        arr[i][j] = oned[index];
        index++;
        }

        for (int i = minr, j = maxc - 1; j > minc; j--) {
        arr[i][j] = oned[index];
        index++;
        }
    }
    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          i++;
          j--;
        }
      }
}
 