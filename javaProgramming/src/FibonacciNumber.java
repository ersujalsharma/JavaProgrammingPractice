import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int pre = 0;
        int cur = 1;
        int next;
        System.out.print(pre + " " +cur +" ");
        while(count-->2){
            next = pre+cur;
            pre = cur;
            cur = next;
            System.out.print(next+" ");
        }
    }
}
