import java.util.Scanner;

/**
 * Recursion_Example_6_PowerOfAnumber_Logaritmic
 */
public class Recursion_Example_6_PowerOfAnumber_Logaritmic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int prev_time = (int) System.currentTimeMillis();
        int ans= power(x,n);
        int cur_time = (int) System.currentTimeMillis();
        System.out.println(ans +" "+(cur_time-prev_time));   
    }

    private static int power(int x, int n) {
        if(n==1){
            return x;
        }
        if(n%2==0){
            return power(x, n/2)*power(x, n/2);
        }
        else{
            return power(x, n/2)*power(x, n/2)*x;
        }
    }
}