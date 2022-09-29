package Strivers_DSA_Sheet.Recursion;

import java.lang.reflect.ParameterizedType;

public class SumofFirstNNumbers {
    public static void main(String[] args) {
        int n =10;
        int ans = sumoffirstNnumbers(n);
        System.out.println(ans);
        sumoffirstNnumbersParametrized(100,0);
    }
    // Functional Recursion
    private static int sumoffirstNnumbers(int n) {
        if(n==0) return 0;
        return n+sumoffirstNnumbers(n-1);
    }
    // Parameterized Recursion
    private static void sumoffirstNnumbersParametrized(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sumoffirstNnumbersParametrized(n-1,sum+n);
    }
}
