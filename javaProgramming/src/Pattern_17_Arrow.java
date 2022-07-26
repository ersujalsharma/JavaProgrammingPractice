import java.util.Scanner;

public class Pattern_17_Arrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int star=1;
        int space=input/2;
        for (int i=0;i<input;i++){
            for (int j=0;j<space;j++){
                if(i==input/2){
                    System.out.print("*\t");
                }
                else {
                    System.out.print(" \t");
                }
            }
            for (int j=1;j<=star; j++){
                System.out.print("*\t");
            }
            if(i<input/2){
                star++;
            }
            else{
                star--;
            }
            System.out.println();
        }
    }
}
