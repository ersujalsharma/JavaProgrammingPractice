package Strivers_DSA_Sheet;

import java.util.Scanner;

/**
 * NthRootOfANumber
 */
public class NthRootOfANumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        // int ans = 1;
        // for(int i=1;Math.pow(i,n)<=m;i++){
        //     ans = i;
        // }
        // System.out.println(ans);
        double low = 1;
        double high = m;
        double eps = 1e-6;
        while((high-low)>eps){
            double mid = (low+high)/2.0;
            if(multiply(mid,n)<m){
                low = mid;
            }
            else{
                high = mid;
            }
        }
        System.out.println(n+"th root of"+m+" is : "+low);
    }

    private static double multiply(double mid, int n) {
        double ans  = 1.0;
        for(int i=1;i<=n;i++){
            ans = ans * mid;
        }
        return ans;
    }
}