import java.util.ArrayList;

/**
 * arrayList_Exaple_1
 */
public class arrayList_Exaple_1 {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        System.out.println( arrayList.size());
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList.add(1);
        arrayList.add("string");
        arrayList.add(102.2);
        arrayList.addAll(arrayList2);
        arrayList.add(1,2000);
        arrayList.set(2,85);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList);;
        arrayList2.add(1);
        arrayList2.add(23423);
        System.out.println(arrayList2);
        arrayList3.add("Sujal");
        arrayList3.add("Sharma");
        System.out.println(arrayList3);
        for (String string : arrayList3) {
            System.out.println(string);
        }
    }
}