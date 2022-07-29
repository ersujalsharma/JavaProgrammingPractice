import java.util.Scanner;

public class Array6_DiffrenceOfArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 = scanner.nextInt();
        int arr1[] = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] newArray = new int[size1>size2?size1:size2];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = newArray.length-1;
        int c=0;
        while(k>=0){
            int d=0;
            int arr1value = i>=0?arr1[i]:0;
            if(arr2[j]+c>=arr1value){
                d = arr2[j]+c-arr1value;
                c=0;
            }
           else{
                d = arr2[j]+c+10-arr1value;
                c=-1;
            }
            newArray[k]=d;
            i--;
            j--;
            k--;
        }
        int index =0;
        while(index<newArray.length){
            if(newArray[index]==0){
                index++;
            }
            else{
                break;
            }
            while(index<newArray.length){
                System.out.println(newArray[index]);
                index++;
            }
        }
   }
}
