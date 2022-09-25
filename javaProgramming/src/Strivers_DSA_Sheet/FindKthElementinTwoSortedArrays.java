package Strivers_DSA_Sheet;

/**
 * FindKthElementinTwoSortedArrays
 */
public class FindKthElementinTwoSortedArrays {

    public static void main(String[] args) {
        int arr1[] = {2,3,6,7,9};
        int arr2[] = {1,4,8,10};
        int i=0;
        int j=0;
        int k =0;
        int target = 5;
        // int[] mergedarray  = new int[arr1.length+arr2.length];
        // while(i<arr1.length && j<arr2.length){
        //     if(arr1[i]<=arr2[j]){
        //         mergedarray[k++] = arr1[i++];
        //     }
        //     else{
        //         mergedarray[k++] = arr2[j++];
        //     }
        // }
        // while(i<arr1.length){
        //     mergedarray[k++] = arr1[i++];
        // }
        // while(j<arr2.length){
        //     mergedarray[k++] = arr2[j++];
        // }
        // for(int l:mergedarray){
        //     System.out.print(l+" ");
        // }
        // System.out.println(mergedarray[2]);
        // .................ANOTHER WAY>>>>>>>>>>>>>>>
        // int count = 0;
        // int ans = 0;
        // while(i<arr1.length && j<arr2.length){
        //     if(count == target) break;
        //     else if(arr1[i]<arr2[j]){
        //         ans = arr1[i++];
        //     }
        //     else{
        //         ans = arr2[j++];
        //     }
        //     count++;
        // }
        // if(count != target){
        //     if(i<arr1.length){
        //         ans = arr1[target-count];
        //     }
        //     else{
        //         ans = arr2[target-count];
        //     }
        // }
        // System.out.println(ans);
        //???????????????????????ANOTHER WAY
        int low = Math.max(0,target-arr1.length),
            high = Math.min(target,arr2.length);
            while(low<=high){
                int cut1 = (low+high)>>1;
            }
    }
}