import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nth = scan.nextInt();
        for(int i=1;i*i<nth;i++){
            System.out.println(i*i);
        }
    }
}