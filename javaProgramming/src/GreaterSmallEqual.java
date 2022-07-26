import java.util.Scanner;

public class GreaterSmallEqual {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float number1  = scan.nextFloat();
        float number2  = scan.nextFloat();
        if(number1==number2){
            System.out.println("Both Number are Equal");
        }
        else{
            if(number1>number2){
                System.out.println("First Number is greater than number 2");
            }
            else{
                System.out.println("the Second Number is greater than First Number");
            }
        }
     }
}
