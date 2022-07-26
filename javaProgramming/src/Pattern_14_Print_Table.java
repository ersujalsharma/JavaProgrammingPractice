import java.util.Scanner;

public class Pattern_14_Print_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(input+" x "+i+"  =  "+input*i);
        }
    }
}
