import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_Exaple_15_GetSubSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "abc";
        ArrayList<String> list = getSubSequence(str);
        System.out.println(list);
    }
    private static ArrayList<String> getSubSequence(String str2) {
        if(str2.length()==0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        char ch = str2.charAt(0);
        String restOfString = str2.substring(1);
        ArrayList<String> rres = getSubSequence(restOfString);
        ArrayList<String> myres = new ArrayList<>();
        for (String res : rres) {
            myres.add(""+res);
            myres.add(ch+res);
        }
        return myres;
    }

}
