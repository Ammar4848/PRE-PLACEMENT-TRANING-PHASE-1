public class MissingValueInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        System.out.println(missingValue(arr));
    }
    public static int missingValue(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + (i + 1) - arr[i];
        }
        return sum + arr.length + 1;
    }
}