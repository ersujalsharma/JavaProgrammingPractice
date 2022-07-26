import java.util.Scanner;

public class Pattern_15_Numbering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int space = input/2;
        int star = 1;
        int count = 1;
        for (int i=1;i<=input;i++){
            for (int j=1;j<=space;j++){
                System.out.print("\t");
            }
            int cval = count;
            for(int j=1;j<=star;j++){
                System.out.print(cval+"\t");
                if(j<=star/2)
                    cval++;
                else
                    cval--;
            }
            if(i<=input/2 ){
                space--;
                star+=2;
                count++;
            }else{
                space++;
                star-=2;
                count--;
            }
            System.out.println();
        }
    }
}
