import java.util.Scanner;

public class Recursion_Example_20_PrintKeyPadCombination {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        printKeyPadCombination(number,"");
    }
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};     
    private static void printKeyPadCombination(String string , String ans) {
        if(string.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = string.charAt(0);
        String ros = string.substring(1);
        String stringAtChar = codes[ch-'0'];
        for (int i = 0; i < stringAtChar.length(); i++) {
            char cha = stringAtChar.charAt(i);
            printKeyPadCombination(ros, ans + cha);
        }
    }
}