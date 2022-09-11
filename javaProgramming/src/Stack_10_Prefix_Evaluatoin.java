import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_10_Prefix_Evaluatoin {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
    
        // code
        Stack<Integer> val = new Stack();
        Stack<String> infix = new Stack();
        Stack<String> postfix = new Stack();
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                val.push(ch-'0');
                infix.push(ch+"");
                postfix.push(ch+"");
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int val1 = val.pop();
                int val2 = val.pop();
                int ans = operatio(val1,val2,ch);
                val.push(ans);
                String val3 = infix.pop();
                String val4 = infix.pop();
                String ans1 = "("+val3+ch+val4+")";
                infix.push(ans1);
                String val5 = postfix.pop();
                String val6 = postfix.pop();
                String ans2 = val5+val6+ch;
                postfix.push(ans2);
            }
        }
        System.out.println(val.pop());
        for (String st : infix) {
            System.out.print(st);        
        }
        System.out.println();
        for (String st : postfix) {
            System.out.print(st);
        }
     } 
     private static int operatio(int val1,int val2,char ch){
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
