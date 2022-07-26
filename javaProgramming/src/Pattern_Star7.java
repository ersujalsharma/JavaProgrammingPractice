import java.util.Scanner;

/*
*
 *
  *
   *
    *
 */
public class Pattern_Star7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for(int  i=1;i<=input;i++){
            for (int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}

