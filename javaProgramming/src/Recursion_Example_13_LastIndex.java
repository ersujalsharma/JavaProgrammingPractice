import java.util.Scanner;

/**
 * Recursion_Example_13_LastIndex
 */
public class Recursion_Example_13_LastIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4,5,3,7,3,9,10};
        int x=3;
        int index=0;
        int ans = LastOccurence(array,index,x);
        System.out.println(ans);
    }

    private static int LastOccurence(int[] array, int index, int x) {
        if(index>=array.length){
            return -1;
        }
        int ans = LastOccurence(array, index+1, x);
        if(ans == -1){
            if(array[index]==x){
                return index;
            }
            else{
                return -1;
            }
        }
        else{
        return ans;
        }
    }
}