package Strivers_DSA_Sheet;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int arr[] = {10,22,12,3,0,6};
        // for (int i = arr.length-1; i >=0 ; i--) {
        //     int current_element = arr[i];
        //     int maxinright = current_element;
        //     for(int j = i ; j<arr.length;j++){
        //         maxinright = Math.max(arr[j],maxinright);
        //     }
        //     if(current_element>=maxinright){
        //         System.out.println(current_element);
        //     }
        // }
        int maxinright = Integer.MIN_VALUE;
        for (int i = arr.length-1; i >=0 ; i--) {
            int current_element = arr[i];
            if(current_element>=maxinright){
                System.out.println(current_element);
            }
            maxinright = Math.max(current_element,maxinright);
        }
    }
}
