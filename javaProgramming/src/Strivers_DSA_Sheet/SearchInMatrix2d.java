package Strivers_DSA_Sheet;

public class SearchInMatrix2d {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6}};
        int k = 3;
        int i =0;
        int j =0;
        while(i<arr.length){
            while(j<arr[0].length){
                if(arr[i][j]<k){
                    j++;
                    System.out.println("less than");
                    continue;
                }
                else if(arr[i][j] == k){
                    System.out.println(arr[i][j]);
                    System.out.println("Equal");
                    break;
                }
                else{
                    System.out.println("Greater");
                    break;
                }
            }
            i++;
        }
    }
}
