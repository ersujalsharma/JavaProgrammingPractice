import java.util.Scanner;
import java.util.Stack;

public class Stack_2_Duplicatebrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ')'){
                if(stack.peek()=='('){
                    System.out.println(true);
                }
                else{
                    while(stack.peek()!='('){
                        stack.pop();
                    }
                    stack.pop();
                }
            }
            else{
                stack.push(ch);
            }
        }
        System.out.println(false);
    }
}
