import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int k = scan.nextInt();
        int count=0;
        int dividendNumber = (int) Math.pow(10,k);
        int firstdigits=number/dividendNumber;
        while(firstdigits>0){
            count++;
            firstdigits/=10;
        }
        int rotationalNumber = (int) (((number%dividendNumber) * Math.pow(10,count) ) + (number/dividendNumber));
        System.out.println(rotationalNumber);

    }
}
