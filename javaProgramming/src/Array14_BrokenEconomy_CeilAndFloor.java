import java.util.Scanner;

/**
 * Array14_BrokenEconomy_CeilAndFloor
 */
public class Array14_BrokenEconomy_CeilAndFloor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {10,20,30,40,50,60,70,80,90};
        int data =25;
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(data<arr[mid]){
                r=mid-1;
            }
            else if(data>arr[mid]){
                l=mid+1;
            }
            else{
                System.out.println("floor"+arr[mid]+"ceil"+arr[mid]);
                return;
            }
        }
        System.out.println("floor "+arr[r]+" Ceil "+arr[l]);
    }
}