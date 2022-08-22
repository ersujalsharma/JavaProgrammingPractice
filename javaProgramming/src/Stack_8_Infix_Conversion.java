import java.util.Scanner;
import java.util.Stack;

public class Stack_8_Infix_Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Stack<String> pre_stack = new Stack<>();
        Stack<Character> operator_Stack = new Stack<>();
        Stack<String> post_stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if((ch >='0' && ch<='9') || (ch >='a' && ch<='z') || (ch>='A' && ch <='Z')){
                pre_stack.push(ch+"");
                post_stack.push(ch+"");
            }
            else if(ch == '(' ){
                operator_Stack.push(ch);
            }
            else if(ch == ')'){
                while(operator_Stack.peek() != '('){
                    char op = operator_Stack.pop();
                    String val2 =  pre_stack.pop();
                    String val1 =  pre_stack.pop();
                    String val_pre = op+val1+val2;
                    pre_stack.push(val_pre);
                    String val4 =  post_stack.pop();
                    String val3 =  post_stack.pop();
                    String val_post = val3+val4+op;
                    post_stack.push(val_post);
                    
                }
                operator_Stack.pop();
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(operator_Stack.size()>0 && precedence(ch) <= precedence(operator_Stack.peek()) && operator_Stack.peek() !='('){
                    char op = operator_Stack.pop();
                    String val2 =  pre_stack.pop();
                    String val1 =  pre_stack.pop();
                    String val_pre = op+val1+val2;
                    pre_stack.push(val_pre);
                    String val4 =  post_stack.pop();
                    String val3 =  post_stack.pop();
                    String val_post = val3+val4+op;
                    post_stack.push(val_post);
                }
                operator_Stack.push(ch);
            }
        }
        
        System.out.println(operator_Stack);
        System.out.println(pre_stack);
        System.out.println(post_stack);
        while(operator_Stack.size()>0 ){
            char op = operator_Stack.pop();
                String val2 =  pre_stack.pop();
                String val1 =  pre_stack.pop();
                String val_pre = op+val1+val2;
                pre_stack.push(val_pre);
                String val4 =  post_stack.pop();
                String val3 =  post_stack.pop();
                String val_post = val3+val4+op;
                post_stack.push(val_post);
        }
        System.out.println(operator_Stack);
        System.out.println(pre_stack);
        System.out.println(post_stack);
    }
    private static int precedence(char op){
        if(op=='+'){
            return 1;
        }
        else if(op == '-'){
            return 1;
        }
        else if(op == '*'){
            return 2;
        }
        else{
            return 2;
        }

    }
}
