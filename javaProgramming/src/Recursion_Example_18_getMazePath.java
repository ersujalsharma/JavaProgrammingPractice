import java.util.ArrayList;
import java.util.Scanner;

/**
 * Recursion_Example_18_getMazePath
 */
public class Recursion_Example_18_getMazePath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        ArrayList<String> list = getMazePath(1,1,m,n);
        System.out.println(list);
    }

    private static ArrayList<String> getMazePath(int i, int j, int m, int n) {
        if(i==m && j==n){
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("");
            return arrayList;
        }
        ArrayList<String> vrestList = new ArrayList<>();
        ArrayList<String> hrestList = new ArrayList<>();
        ArrayList<String> myResList  = new ArrayList<>();
        if(i<m){
            vrestList = getMazePath(i+1, j, m, n);
        }
        if(j<n){
            hrestList = getMazePath(i, j+1, m, n);
        }
        for (String string : vrestList) {
            myResList.add("v"+string);
        }
        for (String string : hrestList) {
            myResList.add("h"+string);
        }
        return myResList;
    }
}