import java.util.Scanner;

/**
 * StringExamples_1
 */
public class StringExamples_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str ; // Declaration;
        str = scanner.next(); // Return the first Word
        System.out.println(str);
        str = scanner.nextLine(); // return the characters till new line
        System.out.println(str);
        // CharAt Function 
        for (int i = 0; i < str.length(); i++) { // length function will return the length of the string
            char ch = str.charAt(i);
            System.out.print(ch);
        }
        // split function to split a string into an array
        String[] str2 = str.split(" ");
        for (String string : str2) {
            System.out.print(string+",,,");
        }
        // substring(int start,int last_index) function
        String str3 = str.substring(1,3);
        System.out.println("\n"+str3);
    }
}