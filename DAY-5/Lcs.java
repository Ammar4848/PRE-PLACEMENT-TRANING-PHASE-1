import java.util.Arrays;
public class Lcs {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 1, 9, 4, 5, 3 };
        int n = 7;
        Arrays.sort(arr);
        int lastSequence = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == i + 1) {
                lastSequence = arr[i];
            } else {
                break;
            }
        }
        System.out.println(lastSequence);
    }
}