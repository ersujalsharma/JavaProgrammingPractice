import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int reverseNumber=0;
        while(number>0){
            int rem = number%10;
            reverseNumber = reverseNumber*10+rem;
            number/=10;
        }
        System.out.println(reverseNumber);

    }
}
