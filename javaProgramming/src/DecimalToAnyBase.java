import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalnumber = scanner.nextInt();
        int base = scanner.nextInt();
        int sum=0;
        int count=0;
        while(decimalnumber>0){
            int rem = decimalnumber%base;
            sum = (int) (sum+rem*Math.pow(10,count));
            count++;
            decimalnumber/=base;
        }
        System.out.println(sum);
    }
}
