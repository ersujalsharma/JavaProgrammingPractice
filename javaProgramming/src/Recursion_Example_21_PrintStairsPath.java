import java.util.Scanner;

public class Recursion_Example_21_PrintStairsPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printStairsPath(number,"");
        
    }

    private static void printStairsPath(int number, String string) {
        if(number<=0){
            if(number==0)
            System.out.println(string);
            return;
        }
        printStairsPath(number-1, "1"+string);
        printStairsPath(number-2, "2"+string);
        printStairsPath(number-3, "3"+string);
    }
}
