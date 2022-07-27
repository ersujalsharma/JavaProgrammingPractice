import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int base = scanner.nextInt();
        int addition=0;
        int rem,div=0;
        int lastdigit1;
        int lastdigit2;
        int count=0;
        while(number1>0 || number2>0 || div >0){
            lastdigit1 = number1%10;
            lastdigit2 = number2%10;

            rem = (lastdigit1+lastdigit2+div)%base;
            addition = (int) (addition + rem * Math.pow(10, count));
            count++;
            div = (lastdigit1+lastdigit2+div)/base; 
            number1/=10;
            number2/=10;
        }
        System.out.println(addition);
    }
}
