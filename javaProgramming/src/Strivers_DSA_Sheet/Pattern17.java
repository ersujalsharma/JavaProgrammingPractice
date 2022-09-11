package Strivers_DSA_Sheet;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char ch = 'E';
        for (int i = 0; i < n; i++) {
            for (int j = ch; j <= ch+i; j++) {
                System.out.printf("%c", j);
            }
            System.out.println();
            ch--;
        }
    }
}
