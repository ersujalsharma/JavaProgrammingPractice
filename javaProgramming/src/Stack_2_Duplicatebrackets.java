import java.util.Scanner;
import java.util.Stack;

public class Stack_2_Duplicatebrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch!=')'){
                stack.push(ch);
            }
            else{
                while(stack.peek() != '('){
                    stack.pop();
                }
                stack.pop();
            }
        }
        if(stack.size() ==0){
            System.out.println("There is no Duplicacy on Bracket");
        }
        else{
            System.out.println("Duplicacy in Bracket");
        }
    }
}
