package Strivers_DSA_Sheet;

public class StockBuyAndSell {
    public static void main(String[] args) {
        // int arr[] = {7,6,4,3,1};
        int arr[] = {7,1,5,3,6,4};
        int max_difference=Integer.MIN_VALUE;
        int min_value= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min_value = Math.min(arr[i],min_value);
            int current_difference = arr[i] - min_value;
            if(max_difference<current_difference){
                max_difference = current_difference;
            }
        }
        System.out.println(max_difference);
    }
}
