import java.util.Scanner;

/*
        *
      * * *
    * * * * *
      * * *
        *
 */
public class Pattern_Star5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for(int i=1;i<=(input/2)+1;i++){
            for (int k=i;k<=input/2;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=input/2;i>=1;i--){
            for (int k=input/2;k>=i;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
