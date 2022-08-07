import java.util.Scanner;

public class Recursion_Example_21_PrintStairsPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printStairsPath(number,"");
        
    }

    private static void printStairsPath(int number, String string) {
        if(number==0){
            System.out.println(string);
            return;
        }
        for (int i = 1; i < number; i++) {
            printStairsPath(number-i, string+"i");
        }
    }
}
