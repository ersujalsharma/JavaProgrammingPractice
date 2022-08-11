
public class String_4_CompressTheString {
    public static void main(String[] args) {
        String str = "aaabbccddeee";
        int i=0;
        String compressedStringc ="";
        while(i<str.length()-1){
        if(str.charAt(i)==str.charAt(i+1)){
           i++;
        }
        compressedStringc += str.charAt(i);
        i++;
        }
        System.out.println(compressedStringc);
    }
}
