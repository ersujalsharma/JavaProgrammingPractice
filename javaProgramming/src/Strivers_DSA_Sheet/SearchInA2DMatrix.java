package Strivers_DSA_Sheet;

public class SearchInA2DMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int low = 0;
        int high = arr.length*arr[0].length-1;
        int target = 3;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid/arr[0].length][mid%arr[0].length] == target){
                System.out.println(mid/arr[0].length+" "+mid%arr.length);
                break;
            }
            else if(arr[mid/arr[0].length][mid%arr[0].length]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
    }
}
