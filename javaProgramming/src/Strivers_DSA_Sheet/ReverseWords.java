package Strivers_DSA_Sheet;

public class ReverseWords {
    public static void main(String[] args) {
        String S = "i.like.this";
        String[] str = S.split(".");
        String ans = "";
        for (String string : str) {
            System.out.println(string);
        }
        System.out.println(str);
        for(int i=str.length-1;i>=0;i--){
            if(ans.isEmpty()){
                ans = ans.concat(str[i]);
            }
            else{
                ans = ans.concat("."+str[i]);
            }
        }
        System.out.println(ans);
    }
}
