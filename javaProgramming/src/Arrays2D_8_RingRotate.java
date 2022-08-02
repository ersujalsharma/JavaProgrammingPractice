import java.util.Scanner;

public class Arrays2D_8_RingRotate {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        int s = 1;
        int r = 5;
        int []oned = FindingShellTo2dArray(arr,s);
        rotate(oned,r);
        fillShellFromOneD(arr,s,oned);
        display(arr);
    }

    private static void display(int[][] arr) {
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
          System.out.print(arr[i][j]+"\t");
        }
        System.out.println();
      }
    }

    private static void fillShellFromOneD(int[][] arr, int s, int[] oned) {
      int minr = s - 1;
      int minc = s - 1;
      int maxr = arr.length - s;
      int maxc = arr[0].length - s;
  
      int index = 0;
      for (int i = minc; i <= maxc; i++) {
        arr[minr][i]=oned[index];
        index++;
      }
      minr++;
      for (int i = minr; i < maxr; i++) {
        arr[i][maxc] = oned[index] ;
        index++;
      }
      maxc--;
      for (int i = maxc; i > minc; i--) {
        arr[maxr][i] = oned[index] ;
        index++;
      }
      maxr--;
      for (int i = maxr; i > minr; i--) {
        arr[i][minc] = oned[index] ;
        index++;
      }
    }

    private static void rotate(int[] oned, int r) {
      r = r % oned.length;
      if(r<0){
        r+=oned.length;
      }
      reverse(oned,0,oned.length-r-1);
      reverse(oned,oned.length-r,oned.length-1);
      reverse(oned,0,oned.length-1);

    }

    private static void reverse(int[] oned, int i, int j) {
      while (i<j) {
        int temp = oned[i];
        oned[i] = oned[j];
        oned[j] = temp;
        i++;
        j--;
      } 
    }

    private static int[] FindingShellTo2dArray(int[][] arr, int s) {
      int minr = s-1;
      int minc = s-1;
      int maxr = arr.length-s;
      int maxc = arr[0].length-s;
      int size = 2*(maxr-minr) + 2*(maxc-minc);
      int OneD[] = new int[size];
      int index = 0;
        for (int j = minc; j <= maxc; j++) {
          OneD[index] = arr[minr][j];
          index++;
        }
        minr++;
        for (int i = minr; i <= maxr; i++) {
          OneD[index] = arr[i][maxc];
          index++;
        }
        maxc--;
        for (int i=maxc; i > minc; i--) {
          OneD[index] = arr[maxr][i];
          index++;
        }
        maxr--;
        for (int i =maxr; i > minr; i--) {
          OneD[index] = arr[i][minc];
        }
      return OneD;
    }
}
 