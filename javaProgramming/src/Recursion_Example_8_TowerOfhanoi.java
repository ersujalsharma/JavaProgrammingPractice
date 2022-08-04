import java.util.Scanner;

public class Recursion_Example_8_TowerOfhanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int t3 = scanner.nextInt();
        toh(n,t1,t2,t3);
        
    }

    private static void toh(int n, int t1, int t2, int t3) {
        if(n==0){
            return;
        }
        toh(n-1, t1, t3, t2);
        System.out.println(t1+"------>"+t2);
        toh(n-1, t3, t2, t1);
    }
}
