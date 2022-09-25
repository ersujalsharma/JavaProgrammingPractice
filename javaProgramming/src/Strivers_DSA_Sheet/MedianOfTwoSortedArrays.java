package Strivers_DSA_Sheet;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1,12,15,26,38};
        int arr2[] = {2,13,17,30,45};
        int n = 5;
        int[] arr = new int[2*n];
        int i=0;
        int j =0;
        int k =0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr[k++] = arr1[i++];
            }
            else{
                arr[k++] = arr2[j++];
            }
        }
        while(i<arr1.length){
            arr[k++] = arr1[i++];
        }
        while(j<arr2.length){
            arr[k++] = arr2[j++];
        }
        for(int l:arr){
            System.out.println(l);
        }
        int ans;
        if((2*n)%2==0){
            ans = (arr[2*n/2]+arr[(2*n/2)-1])/2;
        }
        else{
            ans = arr[n/2];
        }
        System.out.println(ans);
    }
}
