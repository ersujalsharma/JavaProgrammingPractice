package Strivers_DSA_Sheet;

public class MaximumSubArraySumInAnArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max = 0;
        int starting_index =0;
        int ending_index =0;
        for(int i=0;i<arr.length;i++){
            int current_sum =0;
            for (int j = i; j < arr.length; j++) {
                // int sum = 0;
                current_sum+=arr[j];
                // for(int k =i ; k <= j; k++){
                //     sum+=arr[k];
                // }
                if(current_sum>max){
                    max = current_sum;
                    starting_index = i;
                    ending_index = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(starting_index+" "+ending_index);
        System.out.print("[");
        for (int i = starting_index; i <= ending_index; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println("] ");
    }
}
