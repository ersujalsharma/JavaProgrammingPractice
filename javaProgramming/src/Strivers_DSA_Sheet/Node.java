package Strivers_DSA_Sheet;

/**
 * Node
 */
public class Node {
    int data;
    Node next;
    Node(){

    }
    Node(int data){
        this.data  = data;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.insert(head,20);
        head.insert(head,30);
        head.insert(head,40);
        Node cur = head;
        while(cur!=null){
            System.out.println(cur.data);
            cur  = cur.next;
        }
    }
    private static void insert(Node head, int value) {
        Node newnode = new Node(value);
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newnode;
    }
}