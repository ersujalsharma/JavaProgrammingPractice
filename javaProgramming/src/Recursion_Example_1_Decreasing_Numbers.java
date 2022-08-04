import java.util.Scanner;

public class Recursion_Example_1_Decreasing_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printDecreasing(n);
        
    }
    private static void printDecreasing(int n){
        
        if(n==0){
            return;
        }System.out.println(n);
        printDecreasing(n-1);
    }
}
