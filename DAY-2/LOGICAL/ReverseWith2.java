import java.util.*;
public class ReverseWith2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while (num>0){
            System.out.println(num);
            num = num-2;
        }
        sc.close();
    }
}