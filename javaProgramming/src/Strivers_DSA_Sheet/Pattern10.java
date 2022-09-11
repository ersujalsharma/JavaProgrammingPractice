package Strivers_DSA_Sheet;

import java.util.Scanner;

/**
 * Pattern10
 */
public class Pattern10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if((i+j)%2==0)
                    System.out.print("1");
                else
                    System.out.print("0");    
            }
            System.out.println();
        }
    }
}