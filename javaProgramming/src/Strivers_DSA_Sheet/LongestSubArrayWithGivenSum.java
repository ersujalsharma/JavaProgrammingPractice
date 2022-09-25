package Strivers_DSA_Sheet;

public class LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,7,3,9};
        int k =10;
        int start = 0;
        int end = -1;
        int sum =0;
        while(start<arr.length){
            while((end+1<arr.length) && sum+arr[end+1] <= k){
                sum+=arr[++end];
                if(sum == k){
                    for(int i =start;i<=end;i++){
                        System.out.println(arr[i]);
                    }
                }
            }
            sum -= arr[start];
            start++;
        }
    }
}
