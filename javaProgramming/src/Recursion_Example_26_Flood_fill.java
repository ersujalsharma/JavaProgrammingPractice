import java.io.*;
import java.util.*;

public class Recursion_Example_26_Flood_fill {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        floodfill(arr, 0, 0, "");
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf) {
          
        if(sr<0 || sc<0 || sr == maze.length || sc  == maze[0].length || maze[sr][sc]==1 ){
            return;
        }
        if(sr == maze.length-1 && sc == maze[0].length-1 ){
            System.out.println(asf);
            return;
        } 
            maze[sr][sc] = 1;
            floodfill(maze,sr-1,sc,"t"+asf);
            floodfill(maze,sr,sc-1,"l"+asf);
            floodfill(maze,sr+1,sc,"d"+asf);
            floodfill(maze,sr,sc+1,"r"+asf);
            maze[sr][sc] = 0;
            
    }
}  