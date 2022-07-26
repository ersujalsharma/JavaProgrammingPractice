import java.util.Scanner;

public class Pattern_Star8_DIagonal_Right {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for (int i=0;i<=input;i++){
            for (int j=0;j<=input;j++){
                if(i+j == input+1)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
