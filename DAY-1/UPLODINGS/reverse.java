import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.close();
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int rev=0;
        while(n!=0) {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Reverse of the number is: "+rev);
    }
}