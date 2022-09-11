package Strivers_DSA_Sheet;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int space = 2*(n-1);
        int star = 1;
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print(count);
                count++;
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                count--;
                System.out.print(count);
            }
            star++;
            space-=2;
            System.out.println();
        }
    }
}
