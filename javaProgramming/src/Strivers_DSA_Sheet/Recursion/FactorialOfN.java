package Strivers_DSA_Sheet.Recursion;

public class FactorialOfN {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }

    private static int fact(int i) {
        if(i==1) return 1;
        return i*fact(i-1);
    }
}
