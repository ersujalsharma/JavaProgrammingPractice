package Strivers_DSA_Sheet;

public class RotatedMatrix90degree {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int temp[][] = new int[3][3];
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                temp[j][arr.length-i-1] = arr[i][j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(temp[i][j]); 
            }
        }
    }
}
