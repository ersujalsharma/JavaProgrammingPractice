import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_Example_17_GetStairsPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> list= path(n);
        System.out.println(list);
    }
    private static ArrayList<String> path(int n){
        
        if(n==0){
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        else if(n<0){
            ArrayList<String> result = new ArrayList<>();
            return result;
        }
        ArrayList<String> path1 = path(n-1) ;
        ArrayList<String> path2 = path(n-2) ;
        ArrayList<String> path3 = path(n-3) ;
        ArrayList<String> result = new ArrayList<>();
        for (String string : path1) {
            result.add("1"+string);
        }
        for (String string : path2) {
            result.add("2"+string);
        }
        for (String string : path3) {
            result.add("3"+string);
        }
        return result;
    }
}
