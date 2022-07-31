public class Arrays2D_5_UpperDiagonalMatrix {
    public static void main(String... args) {
        int arr[][] ={{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
