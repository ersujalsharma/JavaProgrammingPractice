package Strivers_DSA_Sheet;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2,-1,-3,-4,-1,-2,-1,-5,-4};
        int max_sum = Integer.MIN_VALUE;
        int cur_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            cur_sum += arr[i];
            if(cur_sum>max_sum){
                max_sum = cur_sum;
            }
            if(cur_sum<0){
                cur_sum =0;
            }
        }
        System.out.println(max_sum);
    }
}
