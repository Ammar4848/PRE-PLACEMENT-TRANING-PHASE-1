import java.util.Arrays;
public class StockSpan {
    public static void main(String[] args) {
        int[] price = { 100, 80, 60, 70, 60, 75, 85 };
        int[] span = new int[price.length];
        span[0] = 1;
        for (int i = 0; i < price.length - 1; i++) {
            if (price[i + 1] < price[i]) {
                span[i + 1] = 1;
            } else {
                span[i + 1] = 2;
            }
        }
        for (int i = 0; i < span.length; i++) {
            span[i] = (int) Math.pow(span[i], 3);
        }
        System.out.println(Arrays.toString(span));;
    }
}