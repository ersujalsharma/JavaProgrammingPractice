import java.util.Scanner;

public class DigitCount2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int temp = number;
        int count=1;
        while(temp>0){
            count*=10;
            temp/=10;
        }
        count/=10;
        while(number>0){
            int q = number/count;
            System.out.print(q+" ");
            number = number%count;
            count = count/10;
        }
    }
}
