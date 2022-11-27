package Strivers_DSA_Sheet.Stack_Exercises;

import java.util.Stack;

public class PostFixtoPrefix {
    public static void main(String[] args) {
        String str = "AB+CD-*";
        Stack<String> stack =new Stack<>();
        String s ="";
        for(int i=0;i<str.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                stack.push(str.charAt(i)+"");
            }
            else{
                String op1 = stack.pop();
                String op2 = stack.pop();
                s= str.charAt(i)+""+op2+""+op1;
                stack.push(s);
            }
        }
        System.out.println(s);
    }
}
