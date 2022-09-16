package Strivers_DSA_Sheet;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1,7,3,9};
        int start = 0;
        int end = -1;
        int sum = 0;
        int max = 0;
        while(start<arr.length){
            while(end+1<arr.length && sum+arr[end+1]<=10){
                sum+=arr[++end];
            }
            if(sum == 10){
                max = Math.max(max,end-start+1);
            }
            start-=arr[start];
            start++;
        }
    }
}
