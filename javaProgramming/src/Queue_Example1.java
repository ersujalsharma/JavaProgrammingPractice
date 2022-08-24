import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_Example1 {
    public static void main(String[] args) {
        // Queue :- it is an interface.
        // Dequeue :- it is an interface .
        // ArrayDequeue :- it is an class that implements the dequeue and dequeue is an interface that extends Queue.
        Queue<Integer> que = new ArrayDeque<>();
        que.add(10);
        System.out.println(que);
        que.add(20);
        System.out.println(que);
        que.add(30);
        System.out.println(que);
        System.out.println(que.remove());
        System.out.println(que.peek());
        que.add(50);
        System.out.println(que);
    }
}
