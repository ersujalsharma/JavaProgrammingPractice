import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Priorityqueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int a : arr) {
            pq.add(a);
        }
        while(pq.size()>0){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
        System.out.println();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        for (int a : arr) {
            pq1.add(a);
        }
        while(pq1.size()>0){
            System.out.print(pq1.peek()+" ");
            pq1.remove();
        }
    }
}
