import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first_number = scan.nextInt();
        int second_number = scan.nextInt();
        int gcd=0;
        int lcm=0;
        for(int i=1;i<first_number;i++){
            if(first_number%i==0 && second_number%i==0){
                gcd = i;
            }
        }
        for(int i=1;i<first_number*second_number;i++){
            if(i%first_number==0&& i%second_number==0){
                lcm=i;
                break;
            }
        }
        System.out.printf("GCD is %d LCM is %d",gcd,lcm);
    }
}
