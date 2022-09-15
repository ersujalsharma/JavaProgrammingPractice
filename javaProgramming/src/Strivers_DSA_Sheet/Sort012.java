package Strivers_DSA_Sheet;

public class Sort012 {
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i : arr){
            if(i == 0){
                count0++;
            }
            if(i == 1){
                count1++;
            }
            if(i == 2){
                count2++;
            }
        }
        for(int i=0;i<count0;i++){
            arr[i] = 0;
        }
        for (int i = count0; i < count0+count1; i++) {
            arr[i] = 1;
        }
        for (int i = count0+count1; i < count0+count1+count2; i++){
            arr[i] = 2;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
