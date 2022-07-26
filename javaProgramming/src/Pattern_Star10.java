import java.util.Scanner;

public class Pattern_Star10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int os = input/2;
        int is = -1;
        for (int i=1;i<=input;i++){
            for (int j=1;j<=os;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k=1;k<=is;k++){
                System.out.print(" ");
            }
            if(i>1&&i<input) {
                System.out.print("*");
            }
            if(i<=input/2){
                os--;
                is+=2;
            }
            else{
                os++;
                is-=2;
            }
            System.out.println();
        }

    }
}
