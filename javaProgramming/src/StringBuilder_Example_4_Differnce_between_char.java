import java.util.Scanner;

public class StringBuilder_Example_4_Differnce_between_char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.charAt(0));
        for(int i=0;i<str.length()-1;i++){
            int difference = (str.charAt(i+1)-str.charAt(i));
            
            stringBuilder.append(difference);
            stringBuilder.append(str.charAt(i+1));
        }
        System.out.println(stringBuilder);
    }
}
