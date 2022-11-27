package Strivers_DSA_Sheet.Stack_Exercises;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String str = "abc++";
        Stack<String> stack = new Stack<>();
        String result = "";
        for(int i=0;i<str.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                stack.push(str.charAt(i)+"");
            }
            else{
                String s1 = stack.pop();
                String s2 = stack.pop();
                stack.push('('+s2+str.charAt(i)+s1+')');
            }
        }
        System.out.println(stack.peek());
    }
}
