import java.util.Scanner;

public class Array15_FirstAndLastElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {10,20,30,30,30,40,40,50,60};
        int first_index=-1;
        int last_index=-1;
        int low=0;
        int high = arr.length-1;
        int data = 30;
        while(low <=high){
            int mid = (low+high)/2;
            if(arr[mid]>data){
                high = mid-1;
            }
            else if(arr[mid]<data){
                low = mid+1;
            }
            else{
                first_index = mid;
                high = mid-1;
            }
        }
        System.out.println(first_index);
         low=0;
         high = arr.length-1;
        
        while(low <=high){
            int mid = (low+high)/2;
            if(arr[mid]>data){
                high = mid-1;
            }
            else if(arr[mid]<data){
                low = mid+1;
            }
            else{
                last_index = mid;
                low = mid+1;
            }
        }
        System.out.println(last_index);
    }
}
