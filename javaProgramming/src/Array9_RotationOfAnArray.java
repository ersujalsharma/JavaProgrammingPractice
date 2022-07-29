import java.util.Scanner;

/**
 * Array9_RotationOfAnArray
 */
public class Array9_RotationOfAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int rotationnumber = scanner.nextInt();
        rotationnumber%=size;
        if(rotationnumber<0){
            rotationnumber+=size;
        }
        while(rotationnumber-->0){
            int lastelement = arr[size-1];
            int i=size-1;
            while(i>=1){
                arr[i]=arr[i-1];
                i--;
            }
            arr[0] = lastelement;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}