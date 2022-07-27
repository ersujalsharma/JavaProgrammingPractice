/**
 * Array1
 */
public class Array1 {
    

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 55;
        arr[1] = 43;
        arr[2] = 34;
        arr[3] = 23;
        arr[4] = 35;
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        int[] two = arr;  // shallow copy  ( no objct will create it will store only refrence of that variable)
        printarray(two);
        printarray(two);
        printarray(arr);
        swap(arr,0,4);
        printarray(arr);
        
    }

    private static void printarray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}