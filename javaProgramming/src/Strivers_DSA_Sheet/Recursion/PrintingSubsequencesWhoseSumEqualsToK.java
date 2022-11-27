package Strivers_DSA_Sheet.Recursion;

public class PrintingSubsequencesWhoseSumEqualsToK {
     public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 3;
        printAllSubsequencesGivenK(arr,0,k,0,"");
     }

    private static boolean printAllSubsequencesGivenK(int[] arr, int i, int k,int sum,String ans) {
        if(i == arr.length){
            if(sum==k){
                System.out.println(ans);
                return true;
            }
            return false;
        }
        if(printAllSubsequencesGivenK(arr, i+1, k,sum+arr[i],ans+arr[i]))return true;
        if(printAllSubsequencesGivenK(arr, i+1, k,sum,ans)) return true;
        return false;
    }
}
