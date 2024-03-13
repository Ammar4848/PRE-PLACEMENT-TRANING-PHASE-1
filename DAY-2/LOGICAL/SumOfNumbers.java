import java.util.*;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter a Number");
        int a= sc.nextInt();
        int sum=0;
        while(a>0){
            int b = a % 10;
            sum = sum+b;
            a=a/10;
        }
        System.out.println("Sum of all digits is = "+ sum);
    }
}