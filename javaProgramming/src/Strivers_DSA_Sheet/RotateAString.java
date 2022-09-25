package Strivers_DSA_Sheet;

public class RotateAString {
    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int i =0;
        int j =0;
        char c = s.charAt(i);
        System.out.print(c+" ");
        while(c != goal.charAt(j)){
                j++;
                System.out.println(j);
        }
        System.out.println(i+" "+j);
        while(i<s.length()){
            if(s.charAt(i) == goal.charAt(j)){
                i++;
                j = (j+1)%goal.length();
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String string1 = "abcde";
        String string2 = "abced";
        System.out.println(rotateString(string1,string2));
    }
}
