import java.util.Scanner;
import java.util.Stack;

public class Stack_7_Inflix_Evaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Stack<Integer> operands = new Stack<Integer>();
    Stack<Character> operator = new Stack<Character>();

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if(ch=='('){
            operator.push(ch);
        }
        else if(Character.isDigit(ch)){
            operands.push(ch-'0');
        }
        else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            while(operator.size()>0 && precedence(ch)<=precedence(operator.peek()) && operator.peek() !='('){
                char op = operator.pop();
                int val2 = operands.pop();
                int val1 = operands.pop();
                int val = operation(val1,val2,op);
                operands.push(val);
            }
            operator.push(ch);
        }
        else if(ch == ')'){
            while(operator.peek() != '(' ){
                char op = operator.pop();
                int val2 = operands.pop();
                int val1 = operands.pop();
                int val = operation(val1,val2,op);
                operands.push(val);
            }
            operator.pop();
        }
    }

    while(operator.size() != 0){
            char op = operator.pop();
            int val2 = operands.pop();
            int val1 = operands.pop();
            int val = operation(val1,val2,op);
            operands.push(val);
    }
    System.out.println(operands.peek());
    }
    private static int precedence(char ch){
        if(ch == '+'){
            return 1;
        }
        else if(ch == '-'){
            return 1;
        }
        else if(ch == '*'){
            return 2;
        }
        else{
            return 2;
        }
    }
    private static int operation(int val1,int val2,char ch){
        if(ch == '+'){
            return val1+val2;
        }
        else if(ch == '-'){
            return val1-val2;
        }
        else if(ch == '*'){
            return val1*val2;
        }
        else{
            return val1/val2;
        }
    }
}
