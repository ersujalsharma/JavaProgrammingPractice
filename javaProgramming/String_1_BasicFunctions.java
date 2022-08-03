package javaProgramming;

import java.util.Scanner;

public class String_1_BasicFunctions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Using String Literal
        String  name  = "Sujal Sharma";
        // By Using new keyword
        String title = "Sharma";
        // It is Immutable
        // Scanner functions are - next() - only one word; , nextLine()-till new line;
        String input1 = scanner.next();
        String input2 = scanner.nextLine();
        System.out.println(input1);
        System.out.println(input2);
        // In Built Methods
        // length() - return the length of string
        System.out.println("sujlashrama".length());
    }
}
