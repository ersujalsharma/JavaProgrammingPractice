import java.util.Scanner;

public class JAva2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int marks = scan.nextInt();
        if(marks>=90){
            System.out.println("Excillent");
        }
        else if(marks>=80 && marks<=90){
            System.out.println("Good");
        }
        else if(marks>=70 && marks<=80){
            System.out.println("Fair");
        }
        else if(marks>=60 && marks<=70){
            System.out.println("Meet Expectations");
        }
        else{
            System.out.println("Below Par");
        }
    }
}
