import java.util.Scanner;

public class Array3_SearchingElementsInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        int element = scanner.nextInt();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == element){
                index =i;
                break;
            }
        }
        System.out.println(index);
    }
}
