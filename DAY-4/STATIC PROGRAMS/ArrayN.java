import java.util.*;
public class ArrayN {
    public static void main(String[] args) {
        int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        Unique obj = new Unique(inputArray);
        System.out.println(obj.checkUnique());
    }
}
class Unique {
    int arr[] = new int[10];
    public Unique(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = inputArray[i];
        }
    }
    public boolean checkUnique() {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                return true;
        }
        return false;
    }
}