import java.util.Scanner;

public class Recursion_Example_7_PrintZigZag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ziggzagg(n);
    }

    private static void ziggzagg(int n) {
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        ziggzagg(n-1);
        System.out.println(n+" ");
        ziggzagg(n-1);
        System.out.println(n+" ");
    }
}
