import java.util.Scanner;

public class Recursion_Example_25_printEncoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        printEncoding(str,"");
    }

    private static void printEncoding(String str, String string) {
        if(str.length()==0){
            System.out.println(string);
            return;
        }
        else if(str.length()==1){
            char ch = str.charAt(0);
            if(ch=='0'){
                return;
            }
            else{
                int character = ch-'0';
                char charval = (char) ('a'+character-1);
                string = string + charval;
                System.out.println(string);
            } 
        }
        else if(str.length()>=2){
            char ch = str.charAt(0);
            String roq = str.substring(1);
            if(ch=='0'){
                return;
            }
            else{
                int character = ch-'0';
                char charval = (char) ('a'+character-1);
                printEncoding(roq, string+charval);
            }
            String ch12 = str.substring(0, 2);
            String ros = str.substring(2);
            int ch123 = Integer.parseInt(ch12);
            if(ch123<=26){
                char code = (char) ('a'+ ch123 -1);
                printEncoding(ros, string+code);
            }
        }
    }
}
