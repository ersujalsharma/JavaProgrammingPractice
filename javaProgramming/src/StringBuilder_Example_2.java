public class StringBuilder_Example_2 {
    public static void main(String[] args) {
        String str = "";
        int n = 10000;
        double start_time = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            str+=i;
        }
        double end_time = System.currentTimeMillis();
        System.out.println(end_time-start_time);

        StringBuilder stringBuilder = new StringBuilder();
        start_time = System.currentTimeMillis();
        n=100000;
        for (int i = 0; i < n; i++) {
            stringBuilder.append(i);
        }
        end_time = System.currentTimeMillis();
        System.out.println(end_time-start_time);
    }
}
