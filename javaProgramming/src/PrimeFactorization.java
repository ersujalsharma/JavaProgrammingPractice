import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for(int itr = 2;itr*itr<number;itr++){
            while(number%itr==0){
                number/=itr;
                System.out.print(itr+" ");
            }
        }
        if(number!=1){
            System.out.println(number);
        }
    }
}
