import java.util.Scanner;

public class Pattern_11_NumberPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count=1;
        for (int i=1;i<=input;i++){
            for (int j=1;j<=i;j++){
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }
}
