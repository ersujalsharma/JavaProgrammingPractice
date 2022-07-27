import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int number1  = scanner.nextInt();
        int number2  = scanner.nextInt();
        getDiffrence(number1,number2,base);
    }

    private static void getDiffrence(int number1, int number2, int base) {
        int newNumber=0;
        int borrow =0;
        int count=0;
        while (number2>0) {     
            int lastdigit1 = number1%10;
            int lastdigit2 = number2%10;
                number1/=10;
                number2/=10;
                
                int diffrence=0;
                lastdigit2 = lastdigit2-borrow;

            if(lastdigit2>=lastdigit1){
                borrow=0;
                diffrence = (lastdigit2-lastdigit1);
            }
            else{
                borrow=1;
                diffrence = (lastdigit2+base)-lastdigit1;
            }
            newNumber +=  diffrence*Math.pow(10, count);
            count++;
        }
        System.out.println(newNumber);
    }
    
}
