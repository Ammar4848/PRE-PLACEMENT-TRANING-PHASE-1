import java.util.*;
public class PowerOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isPowerOfFour(n));
        sc.close();
    }
    public static boolean isPowerOfFour(int n) {
        for (int i=0 ; i<n ; i++){
            if (Math.pow(i,4) == n){
                return true;
            }
        }
        return false;
    }
}