import java.util.Scanner;
import java.util.Stack;

public class Stack_3_Balanced_Brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Stack<Character> stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if(ch == ')'){
                if(stack.size()==0){
                System.out.println(false);
                return;
                }
                else if(stack.peek() !='('){
                System.out.println(false);
                return;
                }
                else{
                stack.pop();
                }
            }
            else if(ch == '}'){
                if(stack.size()==0){
                System.out.println(false);
                return;
                }
                else if(stack.peek() !='{'){
                System.out.println(false);
                return;
                }
                else{
                stack.pop();
                }
            }
            else if(ch == ']'){
                if(stack.size()==0){
                System.out.println(false);
                return;
                }
                else if(stack.peek() !='['){
                System.out.println(false);
                return;
                }
                else{
                stack.pop();
                }
            }
        }
        if(stack.size()==0)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
