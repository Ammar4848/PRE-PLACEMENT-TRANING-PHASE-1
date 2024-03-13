import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number");
        int a = sc.nextInt();
        int count =0;
        while (a!=0) {
            a=a/10;
            count++;
        }
        System.out.println("Total Count is = "+count);
        sc.close();
    }
}