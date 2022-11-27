package Strivers_DSA_Sheet.Stack_Exercises;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String str = "*+AB-CD";
        Stack<String> stack = new Stack<>();
        String s = "";
        for(int i = str.length()-1;i>=0;i--){
            if(Character.isLetterOrDigit(str.charAt(i))){
                stack.push(str.charAt(i)+"");
            }
            else{
                String op1 = stack.pop();
                String op2 = stack.pop();
                s = op1+op2+str.charAt(i);
                stack.push(s);
            }
        }
        System.out.println(s);
    }
}
