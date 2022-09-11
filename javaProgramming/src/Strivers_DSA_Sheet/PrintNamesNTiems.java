package Strivers_DSA_Sheet;

import java.util.Scanner;

public class PrintNamesNTiems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int n = scanner.nextInt();
        printNameNTimes(name,n);
    }
    public static void printNameNTimes(String name, int n){
        if(n==0){
            return;
        }
        printNameNTimes(name, n-1);
        System.out.println(name+" "+n);
    }
}
