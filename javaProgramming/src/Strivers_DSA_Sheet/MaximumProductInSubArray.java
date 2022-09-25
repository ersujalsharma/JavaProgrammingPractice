package Strivers_DSA_Sheet;

public class MaximumProductInSubArray {
    public static void main(String[] args) {
        int arr[] = {1,2,-3,0,-4,-5};
        int max = Integer.MIN_VALUE;
        // for(int i=0;i<arr.length-1;i++){
        //     int prod = 1;
        //     prod*=arr[i];
        //     for(int j = i+1;j<arr.length;j++){
        //         prod *=arr[j];
        //         max = Math.max(prod,max);
        //     }
        // }
        // System.out.println(max);
        // int prod1 = arr[0];
        // int prod2 = arr[0];
        // int result = arr[0];
        // for(int i=1;i<arr.length;i++){
        //     int temp = Math.max(arr[i],Math.max(prod1*arr[i],prod2*arr[i]));
        //     prod2 = Math.min(arr[i],Math.min(prod1*arr[i],prod2*arr[i]));
        //     prod1 = temp;
        //     result = Math.max(result,prod1);
        // }
        // System.out.println(result);
        int answer = maxProductSubArray(arr);
        System.out.println(answer);
    }

    private static int maxProductSubArray(int[] arr) {
        int maxLeft = arr[0];
        int maxRight = arr[0];
        boolean zeroPresent = false;
        int prod =1;
        for(int i:arr){
            prod*=i;
            if(i==0){
                zeroPresent = true;
                prod = 1;
                continue;
            }
            maxLeft = Math.max(maxLeft, prod);
        }
        // prod =1;
        // for(int j = arr.length-1;j>=0;j--){
        //     prod *= arr[j];
        //     if(arr[j] == 0){
        //         zeroPresent = true;
        //         prod = 1;
        //         continue;
        //     }
        //     maxRight = Math.max(maxRight,prod);
        // }
        if(zeroPresent) return Math.max(maxLeft,maxRight);
        return Math.max(maxLeft,maxRight);
    }
}
