public class String_3_PrintAllPalindromicSubString {
    public static void main(String[] args) {
        String str= "abccbc";
        for (int i = 0; i <= str.length()-1; i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String substr = str.substring(i, j);
                int left =0;
                int right = substr.length()-1;
                boolean palindrome = true;
                while(left<right){
                    if(substr.charAt(left)!=substr.charAt(right)){
                        palindrome = false;
                    }
                    left++;
                    right--;
                }
                if(palindrome==true){
                    System.out.println(substr);
                }
                
            }
        }
    }
}
