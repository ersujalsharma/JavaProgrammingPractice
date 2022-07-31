import java.util.Stack;

/**
 * Stack_1
 */
public class Stack_1 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack);
        stack.push(1);
        System.out.println(stack);
        stack.push(2);
        System.out.println(stack);
        System.out.println(stack.peek());
        int a = (int) stack.peek();
        System.out.println(a);
        int location = stack.search(1);
        System.out.println(stack.size()-location);
        stack.push(25);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}