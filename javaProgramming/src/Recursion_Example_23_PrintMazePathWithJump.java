import java.util.Scanner;

public class Recursion_Example_23_PrintMazePathWithJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        String ans ="";
        printMazePathWithJump(0,0,m,n,ans); 
    }

    private static void printMazePathWithJump(int i, int j, int m, int n,String ans) {
        if(i==m && j==n){
            System.out.println(ans);
            return;
        }
        if(i<m){
        printMazePathWithJump(i+1, j, m, n,"H1"+ans);
        printMazePathWithJump(i+2, j, m, n,"H2"+ans);
        printMazePathWithJump(i+3, j, m, n,"H3"+ans);
        }
        if(j<n){
        printMazePathWithJump(i, j+1, m, n,"V1"+ans);
        printMazePathWithJump(i, j+2, m, n,"V3"+ans);
        printMazePathWithJump(i, j+3, m, n,"V2"+ans);
        }
        if(i<m && j<n){
        printMazePathWithJump(i+1, j+1, m, n,"D1"+ans);
        printMazePathWithJump(i+2, j+2, m, n,"D2"+ans);
        printMazePathWithJump(i+3, j+3, m, n,"D3"+ans);
        }
    }
}
