import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int inverseNumber=0;
        int index=1;
        while(number>0){
            int rem = number%10;
            inverseNumber += index * Math.pow(10,rem-1);
            number/=10;
            index++;
        }
        System.out.println(inverseNumber);
    }
}
