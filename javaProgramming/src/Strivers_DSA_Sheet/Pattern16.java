package Strivers_DSA_Sheet;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int space = n-1;
        int star = 1;
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print(ch);
                if(j<star/2)
                    ch++;
                else
                    ch--;
            }
            space-=1;
            star+=2;
            System.out.println();
        }
    }
}
