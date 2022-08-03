public class StringBuilder_Example_5_PrintAllPermutationOfString {
    public static void main(String[] args) {
        String str ="abc";
        int factorialValue = factorial(str.length());
        for (int i = 0; i < factorialValue ; i++) {
            StringBuilder stringBuilder = new StringBuilder(str);
            for (int j = str.length(); j > 0; j--) {
                int value = i%j;
                System.out.print(stringBuilder.charAt(value));
                stringBuilder.deleteCharAt(value);
            }
            System.out.println();
        }
    }

    private static int factorial(int length) {
        if(length==1){
            return 1;
        }
        else{
        return length*factorial(length-1);
        }
    }
}
