import java.util.*;
public class lastDigit {
    public static void main(String[] args) {
        System.out.println("Enter A Number=");
        Scanner s = new Scanner(System.in);
        s.close();
        int a = s.nextInt();
        a = a%10;
        System.out.println("The last digit of the number is="+a);
    }
}