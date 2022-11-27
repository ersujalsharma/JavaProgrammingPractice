package Strivers_DSA_Sheet.Recursion;

public class PrintAllSubsequences {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        printallsubsequences(arr,0,"");
    }

    private static void printallsubsequences(int[] arr, int i, String string) {
        if(i == arr.length){
            System.out.println(string);
            return;
        }
        printallsubsequences(arr, i+1, string+"_\t");
        printallsubsequences(arr, i+1, string+arr[i]+"\t");
    }
}
