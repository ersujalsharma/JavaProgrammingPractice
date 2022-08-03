/**
 * String_6_Comparision_String
 */
public class String_6_Comparision_String {

    public static void main(String[] args) {
        String s1 = "hello0";
        String s2 = "hello0";
        String s3 = new String("hello0");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}