package Strivers_DSA_Sheet.QueueExcercises;

import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {
    
    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();
    
    public MyStack() {
    }
    
    public void push(int x) {
        q2.offer(x);
        while(q1.peek()!=null){
            q2.offer(q1.poll());
        }
        Queue q = q1;
        q1 = q2;
        q2 = q;
    }
    
    public int pop() {
        if(q1.peek() == null){
            return -1;
        }
        return q1.poll();
    }
    
    public int top() {
        if(q1.peek() == null){
            return -1;
        }
        return q1.peek();
    }
    
    public boolean empty() {
        if(q1.peek() == null){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        MyStack mystack = new MyStack();
        mystack.push(1);
        
    }
}