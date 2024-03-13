import java.util.*;
public class StringReduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String = ");
        String a = sc.next();
        char[] arr = a.toCharArray();
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1])
                count++;
            else {
                System.out.print(arr[i] + "" + count);
                count = 1;
            }
        }
        System.out.print(arr[arr.length - 1] + "" + count);
        sc.close();
    }
}