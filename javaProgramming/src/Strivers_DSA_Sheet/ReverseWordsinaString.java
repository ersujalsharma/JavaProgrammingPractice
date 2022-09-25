package Strivers_DSA_Sheet;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        String s = "This is an amazing program";
        String[] arr = s.split(" ");
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        int left = 0;
        int right = s.length()-1;
        String temp = "";
        String ans = "";
        while(left<=right){
            char ch = s.charAt(left);
            if(ch != ' '){
                temp += ch;
            }
            else if(ch == ' '){
                if(ans.equals("")){
                    ans = temp;
                }
                else{
                    ans = temp+" "+ans;
                }
                temp = "";
            }
            left++;
        }
        if(!temp.equals("")){
            if(ans.equals("")){
                ans = temp;
            }
            else{
                ans = temp+" "+ans;
            }
        } 
        System.out.println(); 
        System.out.println(ans);
    }
}
