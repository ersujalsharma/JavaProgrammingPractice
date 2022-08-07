import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_Example_18_GetMazePathwithJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        ArrayList<String> list = getMazePathWithJump(1,1,m,n);
        System.out.println(list);
    }

    private static ArrayList<String> getMazePathWithJump(int i, int j, int m, int n) {
        if(i==m && j==n){
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("");
            return arrayList;
        }
        else if( i>m || j>n){
            ArrayList<String> res = new ArrayList<>();
            return res;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for(int k=1; k <= n-j ; k++){
            ArrayList<String> arrayList1 = getMazePathWithJump(i, j+k, m, n);
            for (String string : arrayList1) {
                arrayList.add("H"+k+string);
            }
        }
    
    
        for (int k = 1; k <= m-i; k++) {
            ArrayList<String> arrayList1 = getMazePathWithJump(i+k, j, m, n);
            for (String string : arrayList1) {
                arrayList.add("V"+k+string);
            }
        }
        for (int k = 1; k <= m-i && k<=n-j ; k++) {
            ArrayList<String> arrayList1 = getMazePathWithJump(i+k, j+k, m, n);
            for (String string : arrayList1) {
                arrayList.add("d"+k+string);
            }
        }
        return arrayList;
        
    }
}
