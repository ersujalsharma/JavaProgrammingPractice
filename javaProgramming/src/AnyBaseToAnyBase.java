import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int base1 = scanner.nextInt();
        int base2 = scanner.nextInt();
        int decimalnumber=0;
        int newNumber=0;
        int count=0;
        int temp  = number;
        while(temp>0) {
            int rem = temp % base1;
            decimalnumber = (int) (decimalnumber + rem * (Math.pow(base1, count)));
            count++;
            temp /= 10;
        }
        int count2=0;
        while(decimalnumber>0){
            int rem = decimalnumber%base2;
            decimalnumber/=base2;
            newNumber = (int) (newNumber + rem*Math.pow(10,count2));
            count2++;
        }
        System.out.println(newNumber);
    }
}
