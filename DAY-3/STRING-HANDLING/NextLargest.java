public class NextLargest {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = { 1, 3, 2, 4 };

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    System.out.println(arr[j]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(-1);
            }
        }
    }
}