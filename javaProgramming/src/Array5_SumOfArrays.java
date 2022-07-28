import java.util.Scanner;

/**
 * Array5_SumOfArrays
 */
public class Array5_SumOfArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] newArray = new int[size1>size2?size1:size2];         
        int carry = 0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = newArray.length-1;
        while(k>=0){
            int d = carry;
            if(i>=0){
                d+=arr1[i];
            }
            if(j>=0){
                d+=arr2[j];
            }
            carry = d/10;
            d = d%10;
            newArray[k] = d;
            i--;
            j--;
            k--;
        }
        if(carry!=0){
            System.out.print(carry);
        }
        for(int val : newArray){
            System.out.print(val);
        }
    
    }
}