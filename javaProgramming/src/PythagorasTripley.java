import java.util.Scanner;

public class PythagorasTripley {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        // first find hypotenuse
        int hypotenuse;
        int parpendicular;
        int base;;
        if(a>b && a>c){
            hypotenuse = a;
            parpendicular = b;
            base = c;
        }
        else if(b>a &&b>c){
            hypotenuse = b;
            parpendicular = a;;
            base = c;
        }
        else{
            hypotenuse =c;
            parpendicular =a;
            base = b;
        }
        if(hypotenuse*hypotenuse == ((parpendicular*parpendicular)+(base*base))){
            System.out.println("Perpendicular Triplet is valid");
        }
        else{
            System.out.println("invalid");
        }
    }
}
