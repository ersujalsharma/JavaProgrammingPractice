package Strivers_DSA_Sheet;

import java.util.Scanner;

public class Print1toN_Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print1toN(n);
    }
    public static void print1toN(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print1toN(n-1);
        System.out.println(n);
        
    }
}

