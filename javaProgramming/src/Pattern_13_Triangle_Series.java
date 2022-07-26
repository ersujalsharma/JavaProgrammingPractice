import java.util.Scanner;

public class Pattern_13_Triangle_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i=0;i<input;i++){
            int icj=1;
            for (int j=0;j<=i;j++){
                System.out.print(icj+" ");
                int icjp1 = icj*(i-j)/(j+1);
                icj = icjp1;
            }
            System.out.println();
        }
    }
}

