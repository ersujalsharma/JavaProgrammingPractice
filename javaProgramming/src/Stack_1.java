import java.util.Stack;

/**
 * Stack_1
 */
public class Stack_1 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        System.out.println(stack);
        stack.push(20);
        System.out.println(stack);
        stack.push(50);
        System.out.println(stack);
        System.out.println( stack.peek());
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println( stack.size());
        System.out.println(stack);
        stack.add(2);
        System.out.println(stack);
        stack.add(2,1);
        System.out.println(stack);
    }
}