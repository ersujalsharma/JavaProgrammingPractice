package Strivers_DSA_Sheet;

import java.util.Stack;

public class ChecktheparanthesesareBalancedOrNot {
    public static void main(String[] args) {
        String s = "( ((X)) (((Y))) )";
        int max = 0;
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }
            else if(s.charAt(i) == ')'){
                max = Math.max(stack.size(),max);
                stack.pop();
            }
        }
        System.out.println(max);
    }
}
