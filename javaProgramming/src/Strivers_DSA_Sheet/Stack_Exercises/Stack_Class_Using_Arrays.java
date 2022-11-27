package Strivers_DSA_Sheet.Stack_Exercises;

/**
 * ImplmentationoOsStackUsingArrays
 */
public class Stack_Class_Using_Arrays {
    int arr[];
    int top;
    int capacity;
    public void myStack(int capacity){
        this.capacity = capacity;
        top = -1;
        arr = new int[capacity];
    }
    public void push(int num) throws Exception{
        if(top == capacity-1){
            throw new Exception("OverFlow");
        }
        top++;
        arr[top] = num;
    }
    public int pop() throws Exception{
        if(top == -1){
            throw new Exception("UnderFlow");
        }
        return arr[top--];
    }
    public int peek() throws Exception{
        if(top == -1){
            throw new Exception("UnderFlow");
        }
        return arr[top];
    }
    public boolean isEmpty() throws Exception{
        return top == -1;
    }
    public static void main(String[] args) throws Exception {
        Stack_Class stack1 = new Stack_Class();
        stack1.myStack(5);
        System.out.println(stack1.isEmpty());
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(5);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
        stack1.pop();
        stack1.push(4);
        stack1.push(2);
        System.out.println(stack1.peek());
        System.out.println(stack1.isEmpty());
        for (int i : stack1.arr) {
            System.out.print(i+" ");
        }
    }
}