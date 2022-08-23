import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_9_PostFix_Evaluation {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    // code
    Stack<Integer> val = new Stack();
    Stack<String> infix = new Stack();
    Stack<String> prefix = new Stack();
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if(ch >= '0' && ch <= '9'){
            infix.push(ch+"");
            prefix.push(ch+"");
            val.push(ch-'0');
        }
        else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            int val2 = val.pop();
            int val1 = val.pop();
            int ans = operation(val1,val2,ch);
            val.push(ans);
            String val4 = infix.pop();
            String val3 = infix.pop();
            String ans1 = "("+val3+ch+val4+")";
            infix.push(ans1);
            String val6 = prefix.pop();
            String val5 = prefix.pop();
            String ans2 = ch+val5+val6;
            prefix.push(ans2);
        }
    } 
    System.out.println(val.pop());
    for(String st : infix){
        System.out.print(st);
    }
    System.out.println();
    for(String st : prefix){
        System.out.print(st);
    }
 }
 private static int operation(int val1,int val2,char ch){
     if(ch == '+' ){
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