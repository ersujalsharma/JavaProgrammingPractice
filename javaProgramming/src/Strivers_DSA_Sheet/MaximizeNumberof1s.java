package Strivers_DSA_Sheet;

public class MaximizeNumberof1s {
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,9};
        int max = Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     int sum =0;
        //     for (int j = i; j < arr.length; j++) {
        //         sum+= arr[j];
        //         if(sum == 10){
        //             max = Math.max(max,(j-i+1));
        //         }
        //         for (int j2 = i; j2 <= j; j2++) {
        //             System.out.print(arr[j2]+" ");
        //         }
        //         System.out.println();
        //     }
        // }
        // System.out.println(max);
        int start = 0;
        int end = -1;
        int sum =0;
        int k = 10;
        int n = arr.length;
        while(start<n){
            while((end+1<n) && (sum+arr[end+1]<=k)){
                sum+=arr[++end];
            }
            if(sum == k){
                max = max > (end-start+1)?max:(end-start+1);
            }
            sum-=arr[start];
            start++;
        }
        System.out.println(max);
    }
}
