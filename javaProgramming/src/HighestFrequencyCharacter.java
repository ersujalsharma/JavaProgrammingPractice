import java.util.HashMap;
import java.util.Scanner;

public class HighestFrequencyCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char  ch =str.charAt(i);
            if(hm.containsKey(ch)){
                int of = hm.get(ch);
                int nf = of+1;
                hm.put(ch,nf);
            }
            else{
                hm.put(ch,1);
            }
        }
        char mcf = str.charAt(0);
        for (Character ch : hm.keySet()) {
            if(hm.get(ch) >hm.get(mcf) ){
                mcf = ch;
            }
        }
        System.out.println(mcf);
    }
}
