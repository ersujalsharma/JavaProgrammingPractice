package Strivers_DSA_Sheet;

public class RotateAnArrayByUsingCircularMotion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 2;
        int temp[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            temp[(i+k)%arr.length] = arr[i];
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(temp[i]);
        }
    }
}
