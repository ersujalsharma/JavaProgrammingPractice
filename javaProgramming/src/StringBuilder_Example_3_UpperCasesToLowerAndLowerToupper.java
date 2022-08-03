public class StringBuilder_Example_3_UpperCasesToLowerAndLowerToupper {
    public static void main(String[] args) {
        StringBuilder stringBuilder  = new StringBuilder("SujalSharmaHeRo");
        for (int i = 0; i < stringBuilder.length(); i++) {
            char ch = stringBuilder.charAt(i);
            if(ch>'A' && ch<'Z'){
                char lowerCase = (char) (ch - 'A' +'a');
                stringBuilder.setCharAt(i, lowerCase);
            }
            else{
                char upperCase = (char) (ch -'a' +'A');
                stringBuilder.setCharAt(i, upperCase);
            }
        }
        System.out.println(stringBuilder);
    }
}
