package Strivers_DSA_Sheet;

public class SearchInRotatedSortedinArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int target = 0;
        int low = 0;
        int high = arr.length-1;
        int ans =-1;
        while(low<=high){
            int mid = (low+high)>>1;
            if(arr[mid] == target){
                ans = mid;
                break;
            }
            else if(arr[low] <= arr[mid]) {
                if(arr[low]<= target && target <=arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target<=arr[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        System.out.println(ans);
    }
}
