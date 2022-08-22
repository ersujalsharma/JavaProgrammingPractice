import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Stack_6_Sliding_Window_Maximum {

public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = scanner.nextInt();
    }
    int k = scanner.nextInt();

    // code
    for (int i = 0; i < a.length-k; i++) {
       int max = a[i];
       for (int j = i+1; j < i+k; j++) {
          if(a[j]>max){
             max=a[j];
          }
       }
       a[i] = max;
    }
   for (int num : a) {
      System.out.println(num);
   }
 }
}
