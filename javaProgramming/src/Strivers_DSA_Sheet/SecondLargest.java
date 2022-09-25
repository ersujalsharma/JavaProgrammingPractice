package Strivers_DSA_Sheet;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
    int smallest =Integer.MAX_VALUE;
    int secondsmallest = Integer.MAX_VALUE;
    int largest = 0;
    int secondlargest = 0;
    for(int i:arr){
        if(i<smallest){
            secondsmallest = smallest;
            smallest = i;
        }
        else if(i<secondsmallest && i!=smallest){
            secondsmallest = i;
        }
    }
    System.out.println(smallest);
    System.out.println(secondsmallest);
    }
    
}
