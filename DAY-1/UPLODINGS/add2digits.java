import java.util.*;
public class add2digits {
    public static void main(String[] args) {
        System.out.println("Enter a 3 digit Number=");
        Scanner s= new Scanner(System.in);
        s.close();
        int n = s.nextInt();
        int n1=n/10;
        n =n1;
        int n2=n%10;
        n1=n/10;
        int a =n1+n2;
        System.out.println("The Sum of first 2 digit is = "+a);
    }
}