import java.util.Scanner;

public class Pattern_16_NumberPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int star = 1;
        int space = 2*input-3;
        for (int i=1;i<=input;i++){
            int count=1;
            for (int j=0;j<star;j++){
                System.out.print(count+"\t");
                count++;
            }
            for (int j=0;j<space;j++){
                System.out.print("\t");
            }
            if(i==input){
                star--;
                count--;
            }
            for (int j=0;j<star;j++){
                count--;
                System.out.print(count+"\t");
            }
            star++;
            space-=2;
            System.out.println();

        }
    }
}
