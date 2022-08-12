
public class String_4_CompressTheString {
    public static void main(String[] args) {
        String str = "aaabbccddeee";
        String compressedStringc ="";
        for (int j = 0; j < str.length(); j++) {
                while(j<str.length()-1 && str.charAt(j) == str.charAt(j+1) ){
                    j++;
                }
            compressedStringc+=str.charAt(j);
        }
        System.out.println(compressedStringc);
    }
}
