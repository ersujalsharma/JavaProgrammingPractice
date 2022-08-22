import java.util.Scanner;
import java.util.Stack;

public class Stack_5_Stock_span {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        ans[0] = 1;
        for (int j = 1; j < arr.length; j++) {
            while(stack.size()>0 && arr[j]>arr[stack.peek()]){
                stack.pop();
            }
            if(stack.size()>0){
                ans[j] = j+1;
            }
            else{
                ans[j] = j-stack.peek();
            }
            stack.push(j);
        }
    }
}
