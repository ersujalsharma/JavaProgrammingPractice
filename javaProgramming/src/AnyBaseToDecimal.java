import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int base = scanner.nextInt();
        int sum=0;
        int pow=1;
        while(number>0){
            int rem = number%10;
            sum = sum + rem * pow;
            pow = pow * base;
            number/=10;
        }
        System.out.println(sum);
    }
}
