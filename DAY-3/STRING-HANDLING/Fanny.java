public class Fanny {
    public static void main(String[] args) {
        String a = "Hello";
        char b = 'l';
        System.out.println(removeChar(a, b));
    }
    public static String removeChar(String a, char b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b) {
                sb.append(a.charAt(i));
            }
        }
        return sb.toString();
    }
}