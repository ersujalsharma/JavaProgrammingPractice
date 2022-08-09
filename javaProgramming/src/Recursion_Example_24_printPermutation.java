import java.util.Scanner;

public class Recursion_Example_24_printPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        printPermutaion(str,"");
    }

    private static void printPermutaion(String str, String string) {
        if(str.length()==0){
            System.out.println(string);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String lros = str.substring(0,i);
            String ros = lros+str.substring(i+1);
            printPermutaion(ros, ch+string);
        }
    }
}
