import java.util.Scanner;

public class Pattern_12_Triangle_fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input  = scanner.nextInt();
        int pre=0,cur=1,next;
        for (int i=1;i<=input;i++){
            for (int j=1;j<=i;j++){
                System.out.print(pre+ " ");
                next = pre+cur;
                pre = cur;
                cur = next;
            }
            System.out.println();
        }
    }
}
