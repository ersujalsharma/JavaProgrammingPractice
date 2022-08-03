public class String_2_PrintAllSubString {
    public static void main(String[] args) {
        String str= "Sujal";
        for (int i = 0; i <= str.length()-1; i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String substr = str.substring(i, j);
                System.out.println(substr);
            }
        }
    }
}
