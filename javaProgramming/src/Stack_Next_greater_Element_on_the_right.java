import java.util.Scanner;
import java.util.Stack;

/**
 * Stack_Next_greater_Element_on_the_right
 */
public class Stack_Next_greater_Element_on_the_right {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        ans[arr.length-1] = -1;
        for (int j = arr.length-2; j >= 0 ; j--) {
            while(st.size()>0 && arr[j]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                ans[j] = -1;
            }
            else{
                ans[j] = st.peek();
            }
            st.push(arr[j]);
        } 
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}