import java.util.Scanner;

public class Recursion_Example_12_FirstIndexOfOccurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4,5,3,7,3,9,10};
        int x=3;
        int index=0;
        int ans = firstOccurence(array,index,x);
        System.out.println(ans);
    }

    private static int firstOccurence(int[] array, int index, int x) {
        if(index>=array.length){
            return -1;
        }
        if(array[index]==x){
            return index;
        }
        int ans = firstOccurence(array, index+1, x);
        return ans;
    }
}
