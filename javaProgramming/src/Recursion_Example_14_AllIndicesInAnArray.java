public class Recursion_Example_14_AllIndicesInAnArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,2,4,3,5,6,4,5,4,5,4};
        int index=0;
        int x = 4;
        int fsf=0;
        int[] arr = allIndicesInArray(array,index,x,fsf);
        if(arr.length==0){
            System.out.println();
            return;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static int[] allIndicesInArray(int[] array, int index, int x,int fsf) {
        if(index==array.length){
            return new int[fsf];
        }
        int [] arr ;
        if(array[index] == x){
            arr = allIndicesInArray(array, index+1, x, fsf+1);
            arr[fsf] = index;
        }
        else{
            arr = allIndicesInArray(array, index+1, x, fsf+1);
        }
        return arr;
    }
}
