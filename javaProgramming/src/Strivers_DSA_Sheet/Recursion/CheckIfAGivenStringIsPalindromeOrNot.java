package Strivers_DSA_Sheet.Recursion;

public class CheckIfAGivenStringIsPalindromeOrNot {
    public static void main(String[] args) {
        String string ="naman";
        boolean ans = isPalindromeOrNot(string,0);
        System.out.println(ans);
    }

    private static boolean isPalindromeOrNot(String string, int i) {
        boolean ans;
        if(i >=string.length()/2){
            return true;
        }
        if(string.charAt(i)!=string.charAt(string.length()-i-1))
            return false;
        ans = isPalindromeOrNot(string, i+1);
        return ans;
    }
}
