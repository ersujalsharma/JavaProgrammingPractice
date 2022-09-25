package Strivers_DSA_Sheet;

public class CountInversionInAnArray {
    public static void main(String[] args) {
        int arr[] = {5,3,2,1,4};
        int count =0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j =i+1;j<arr.length;j++){
        //         if(arr[j]<arr[i]){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);
        int temp[] = new int[5];
        int ans = mergeSort(arr,temp,0,5-1);
        System.out.println(ans);
    }

    private static int mergeSort(int[] arr, int[] temp, int i, int j) {
        int mid,invco=0;
        if(i<j){
            mid = i+(j-i)/2;
            invco += mergeSort(arr, temp, i, mid);
            invco += mergeSort(arr, temp, mid+1, j);
            invco += merge(arr,temp,i,mid+1,j);
        }
        return invco;
    }

    private static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int invco = 0;
        int i = left;
        int j = mid;
        int k = left;
        while((i<=mid-1) && (j<=right)){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
                invco += invco+(mid-i);
            }
        }
        while(i<=mid-1){
            temp[k++] = arr[i++];    
        }
        while(j<=right){
            temp[k++] = arr[j++];
        }
        for(i=left ;i<=right;i++){
            arr[i] = temp[i];
        }
        return invco;
    }
}
