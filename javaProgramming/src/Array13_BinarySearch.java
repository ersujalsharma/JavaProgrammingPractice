import java.util.Scanner;

/**
 * Array13_BinarySearch
 */
public class Array13_BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {10,20,30,40,50,60,70,80,90};
        int item = scanner.nextInt(); 
        int i=0;
        int j=arr.length-1;
        
        while(i<=j){
            int mid = (i+j)/2;
             if(item>arr[mid]){
                i=mid+1;
             }   
             else if(item<arr[mid]){
                j=mid-1;
             }
             else{
                System.out.println(mid);
                return;
             }
        }
        System.out.println(-1);
    }
}