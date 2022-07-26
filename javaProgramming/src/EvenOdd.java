import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        double sujal = Scan.nextDouble();
        if(sujal%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
