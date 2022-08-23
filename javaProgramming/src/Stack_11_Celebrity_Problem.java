import java.util.Scanner;
import java.util.Stack;

public class Stack_11_Celebrity_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        while(stack.size()>1){
            int i = stack.pop();
            int j = stack.pop();
            if(arr[i][j] == 1){
                stack.push(j);
            }
            else{
                stack.push(i);
            }
        }
        boolean flag = true;
        int val = stack.pop();
        for (int i = 0; i < arr.length; i++) {
            if(i!=val){
                if(arr[i][val] !=1){
                    flag = false;
                    break;                
                }
                if(arr[val][i] !=0){
                    flag = false;
                    break;
                }
            }
        }
        if(flag == true){
            System.out.println(val);
        }
        else{
            System.out.println("noone");
        }

    }
}
