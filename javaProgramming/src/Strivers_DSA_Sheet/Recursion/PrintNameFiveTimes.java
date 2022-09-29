package Strivers_DSA_Sheet.Recursion;

public class PrintNameFiveTimes {
    public static void main(String[] args) {
        printnames("Sujal",5);
    }

    private static void printnames(String string,int count) {
        if(count==0){
            return;
        }
        System.out.print("SUJAL\n");
        printnames(string, count-1);
    }
    
}
