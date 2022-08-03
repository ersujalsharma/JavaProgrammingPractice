public class String_5_CompressedStringFrequency {
    public static void main(String[] args) {
        String str = "aaabbccdeee";
        
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            int count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            ans+=str.charAt(i);
            if(count>1){
                ans+=count;
            }
        }
        System.out.println(ans);
    }
}

