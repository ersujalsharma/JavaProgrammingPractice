package Strivers_DSA_Sheet;

public class LongestSubArrayWithGivenSumK {
    public static void main(String[] args) {
        int arr[] = {7,1,6,0};
        int max = Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     int sum =0;
        //     for (int j = i; j < arr.length; j++) {
        //         sum+=arr[j];
        //         if(sum == 7){
        //             max = Math.max(max,(j-i+1));
        //         }
        //     }
        // }
        // System.out.println(max);
        int end = -1;
        int start = 0;
        int sum =0;
        while(start<arr.length){
            while(end+1 <arr.length && sum+arr[end+1] <= 7){
                sum += arr[++end];
            }
            if(sum == 7){
                max = Math.max(max,(end-start+1));
            }
            sum-=arr[start];
            start++;
        }
        System.out.println(max);
    }
}
