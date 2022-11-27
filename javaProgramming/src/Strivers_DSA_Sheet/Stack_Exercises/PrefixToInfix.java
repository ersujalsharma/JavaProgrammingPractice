package Strivers_DSA_Sheet.Stack_Exercises;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String str = "+++abcd";
        // right to left;
        Stack<String> stack = new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            if(Character.isLetterOrDigit(str.charAt(i))){
                stack.push(str.charAt(i)+"");
            }
            else{
                String s1 = stack.pop();
                String s2 = stack.pop();
                stack.push("("+s1+str.charAt(i)+s2+")");
            }
        }
        System.out.println(stack.pop());
    }
}
