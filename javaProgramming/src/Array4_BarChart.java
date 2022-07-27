import java.util.Scanner;

public class Array4_BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        int max =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max =arr[i];
            }
        }
        for (int floor = max; floor>=1; floor--) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]>=floor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    
}
