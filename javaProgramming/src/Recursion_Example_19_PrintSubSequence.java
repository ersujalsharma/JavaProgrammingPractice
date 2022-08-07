import java.util.Scanner;

public class Recursion_Example_19_PrintSubSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        printSubSequence(str,"_");
        
    }

    private static void printSubSequence(String str, String string) {
        if(str.length()==0){
            System.out.print(string+",");
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        printSubSequence(ros, string + "");
        printSubSequence(ros, string + ch);
    }
} 
