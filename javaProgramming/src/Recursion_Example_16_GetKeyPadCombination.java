import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_Exaple_16_GetKeyPadCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        ArrayList<String> list = getKPC(str);
        System.out.println(list);
    }
    static String[] code = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};
    private static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        char ch = str.charAt(0);
        String restOfString = str.substring(1);
        ArrayList<String> rres = getKPC(restOfString);
        ArrayList<String> mres = new ArrayList<>();
        String alterNate = code[ch - '0'];
        for(int i=0;i<alterNate.length();i++){
            char alter = alterNate.charAt(i);
                for (String string  : rres) {
                mres.add(alter+""+string);
            }
        }
        return mres;
    }
}
