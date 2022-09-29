package Strivers_DSA_Sheet;

public class DoublyLinkedList {
    
    int data;
    DoublyLinkedList prev;
    DoublyLinkedList next;
    DoublyLinkedList(int data){
        this.data = data;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList(10);
        DoublyLinkedList newnode = new DoublyLinkedList(20);
        list.next = newnode;
        list.prev = null;
        newnode.prev = list;
        DoublyLinkedList newnode2 = new DoublyLinkedList(30);
        newnode.next = newnode2;
        newnode2.prev = newnode;
        while(list!=null){
            System.out.println(list.data);
            list = list.next;
        }
    }
}
