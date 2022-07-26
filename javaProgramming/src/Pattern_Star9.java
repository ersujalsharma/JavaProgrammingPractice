import java.util.Scanner;

public class Pattern_Star9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for (int i=1;i<=input;i++){
            for (int j=1;j<=input;j++){
                if(i==j || i+j==input+1)
                System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
