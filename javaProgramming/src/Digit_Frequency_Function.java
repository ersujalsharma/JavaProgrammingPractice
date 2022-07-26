import java.util.Scanner;

public class Digit_Frequency_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int digit = scanner.nextInt();
        int freq = getFrequency(input,digit);
        System.out.println(freq);
    }

    private static int getFrequency(int input, int digit) {
        int count=0;
        int lastdigit;
        while(input>0){
            lastdigit=input%10;
            if(lastdigit==digit){
                count++;
            }
            input/=10;
        }
        return count;
    }
}
