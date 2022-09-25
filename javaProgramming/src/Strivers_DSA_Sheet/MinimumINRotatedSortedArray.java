package Strivers_DSA_Sheet;

public class MinimumINRotatedSortedArray {
    public static void main(String[] args) {
        int nums[] = {4,5,1,2,3};
        int left =0;
        int right = nums.length-1;
        int min = Integer.MIN_VALUE;
        while(left<=right){
            if(nums[left]<nums[right]){
                min = Math.min(min,nums[left]);
                break;
            }
            int mid = (left+right)/2;
            if(nums[left]<=nums[mid]){
                min = Math.min(min,nums[left]);
                left = mid+1;
            }
            else{
                min = Math.min(min,nums[mid]);
                right = mid-1;
            }
        }
    }
}
