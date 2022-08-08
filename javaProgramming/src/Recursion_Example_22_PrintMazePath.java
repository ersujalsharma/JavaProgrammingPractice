import java.util.Scanner;

public class Recursion_Example_22_PrintMazePath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();;
        String ans = "";
        printMazePath(m,n,ans);
    }

    private static void printMazePath(int m, int n, String ans) {
        if(m==1 && n==1){
            System.out.println(ans);
            return;
        }
        if(m>0){
            printMazePath(m-1, n, "v"+ans);
        }
        if(n>0){
            printMazePath(m, n-1, "h"+ans);
        }
    }
}
