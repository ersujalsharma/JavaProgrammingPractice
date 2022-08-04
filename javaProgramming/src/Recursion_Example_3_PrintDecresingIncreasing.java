import java.util.Scanner;

public class Recursion_Example_3_PrintDecresingIncreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printDecreasingAndIncreasing(n);
    }

    private static void printDecreasingAndIncreasing(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecreasingAndIncreasing(n-1);
        System.out.println(n);
    }
}
