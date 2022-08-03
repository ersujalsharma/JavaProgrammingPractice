import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example_RemoveAllPrimes {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        for (int i = 0; i < n; i++) {
            arrayList.add(scan.nextInt());
        }
        ArrayList arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList<>();
        
        for (int i = 0; i < arrayList.size(); i++) {
            int element = arrayList.get(i);
            int flag=0;
            for (int j = 2; j*j < element; j++) {
                if(element%j == 0){
                    flag=1;
                }
            }
            if(flag==0){
                arrayList2.add(element);
            }
            else{
                arrayList3.add(element);
            }
        }
        System.out.println(arrayList2);
        System.out.println(arrayList3);
    }
}
