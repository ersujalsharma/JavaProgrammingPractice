import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = 0;
        while(number>0){
            count++;
            number/=10;
        }
        System.out.println(count);
    }
}
