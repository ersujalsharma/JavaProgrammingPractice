package Strivers_DSA_Sheet.Stack_Exercises;

public class Stack_Class_Using_Linked_List {
    Node head;
    int size;
    public static void main(String[] args) {
        Stack_Class_Using_Linked_List stack = new Stack_Class_Using_Linked_List();
        stack.myStack();
        stack.push(1);
        stack.push(2);
        stack.push(8);
        stack.push(7);
        Node cur = stack.head;
        while(cur!=null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    public void myStack(){
        head = null;
        size = 0;
    }
    public void push(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    public int pop() throws Exception{
        if(head == null){
            throw new Exception("Underflow");
        }
        int res = head.data;
        head = head.next;
        return res;
    }
    public int peek() throws Exception{
        if(head == null){
            throw new Exception("Underflow");
        }
        return head.data;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int size(){
        return size;
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}