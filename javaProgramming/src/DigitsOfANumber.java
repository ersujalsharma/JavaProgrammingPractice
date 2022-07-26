import java.util.Scanner;

public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int digit;
        while(number>0){
            digit = number%10;
            number/=10;
            System.out.println(digit);
        }
    }
}
