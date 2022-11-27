package Strivers_DSA_Sheet.Recursion;

import java.util.Scanner;

public class PrintAllBinaryStringsOfAGivenNumberKWIthoutConsecutive1s {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String n1 = "0";
        print(k-1,n1);
        String n2 = "1";
        print(k-1,n2);
    }

    private static void print(int i, String str) {
        if(i==0){
            System.out.println(str);
            return;
        }
        if(str.charAt(str.length()-1)=='0'){
            print(i-1, str+"0");
            print(i-1, str+"1");
        }
        if(str.charAt(str.length()-1)=='1'){
            print(i-1,str+"0");
        }
    }
}
