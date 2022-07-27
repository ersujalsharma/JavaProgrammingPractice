import java.util.Scanner;

public class Array2_SpanOfTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max =arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        int span = max-min;
        System.out.println(span);
    }
    
}
