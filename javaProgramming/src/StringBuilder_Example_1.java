public class StringBuilder_Example_1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.charAt(4));
        stringBuilder.setCharAt(2, 'e');
        System.out.println(stringBuilder);
        stringBuilder.append("Sujal");
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(4);
        System.out.println(stringBuilder);
        stringBuilder.delete(1, 4);
        System.out.println(stringBuilder);
        stringBuilder.replace(1, 4,"suj");
        System.out.println(stringBuilder);
        String str = stringBuilder.toString();
        System.out.println(str);
        stringBuilder.capacity();

    }
}
