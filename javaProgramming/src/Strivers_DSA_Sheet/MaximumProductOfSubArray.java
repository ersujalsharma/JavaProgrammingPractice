package Strivers_DSA_Sheet;

public class MaximumProductOfSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        int min = arr[0];
        int max = arr[0];
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp = min;
                min = max;
                max = temp;
            }
            max = Math.max(arr[i],max*arr[i]);
            min = Math.min(arr[i],min*arr[i]);
            ans = Math.max(max,ans);
        }
        System.out.println(ans);
    }
}
