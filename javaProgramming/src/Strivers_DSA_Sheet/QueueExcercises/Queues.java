package Strivers_DSA_Sheet.QueueExcercises;

public class Queues {
    int[] arr;
    int front;
    int rear;
    public static void main(String[] args) throws Exception {
        Queues queue = new Queues();
        queue.myQueue();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        for(int i:queue.arr){
            System.out.print(i+" ");
        }
    }
    public void myQueue(){
        arr = new int[5];
        front = -1;
        rear = -1;
    }
    public void offer(int data) throws Exception{ // to add elements
        if((rear+1)%arr.length == front){
            throw new Exception("Overflow");
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear+1)%arr.length;
        arr[rear] = data;
    }
    public int poll() throws Exception{ // to remove elements
        if(front==-1){
            throw new Exception("UnderFlow");
        }
        int result = arr[front];
        arr[front] = 0;
        if(front == rear){
            front = rear = -1;
        }else{
            front = (front+1)%arr.length;
        }
        return result;
    }

}
