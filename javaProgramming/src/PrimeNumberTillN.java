import java.util.Scanner;

public class PrimeNumberTillN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int number =0;
        while(count-->0) {
            int flag = 0;
            if(number == 0 | number ==1){
                flag =1;
            }
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(number + " Number is Not Prime");
            } else {
                System.out.println(number + " Number is Prime");
            }
            number++;
        }
    }
}
