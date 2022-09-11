package Strivers_DSA_Sheet;

import java.util.Scanner;

/**
 * Pattern13
 */
public class Pattern13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 'A'; j <='A'+i ; j++) {
                System.out.printf("%c",j);
            }
            System.out.println();
        }
    }
}