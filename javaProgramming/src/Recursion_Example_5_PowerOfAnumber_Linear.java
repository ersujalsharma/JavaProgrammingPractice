import java.util.Scanner;

public class Recursion_Example_5_PowerOfAnumber_Linear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int ans= power(x,n);
        System.out.println(ans);
    }

    private static int power(int x, int n) {
        if(n==1){
            return x;
        }
        return x*power(x, n-1);
    }
}
