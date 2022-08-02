import java.util.Scanner;

/**
 * Arrays2D_LinearSearchingInA2daRRAY
 */
public class Arrays2D_LinearSearchingInA2daRRAY {

    private static final String Scanner = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][] = {{1,2,3,4,5},{6,7,8,9,10}};
        int data = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==data){
                    System.out.println("Location of The Data is "+i+"st Row and "+j+"th Column");
                    break;
                }
            }
        }
    }
}