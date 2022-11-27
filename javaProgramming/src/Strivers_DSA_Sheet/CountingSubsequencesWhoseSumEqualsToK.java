package Strivers_DSA_Sheet;

/**
 * CountingSubsequencesWhoseSumEqualsToK
 */
public class CountingSubsequencesWhoseSumEqualsToK {

    public static void main(String[] args) {
        int[] arr = {1,2,1,5,1,2};
        int k = 2;
        int count = countingSubsequences(arr,0,0,k);
        System.out.println(count);
    }

    private static int countingSubsequences(int[] arr, int index, int sum,int k) {
        if(index == arr.length){
            if(sum == k){
                return 1;
            }
            return 0;
        } 
        int l = countingSubsequences(arr, index+1, sum+arr[index],k);
        int r = countingSubsequences(arr, index+1, sum,k);
        return l+r;
    }
}