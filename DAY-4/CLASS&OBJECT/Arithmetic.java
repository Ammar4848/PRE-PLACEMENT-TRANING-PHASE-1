import java.util.*;
public class Arithmetic {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Enter the operation you want to perform: ");
        System.out.println("1. Factorial");
        System.out.println("2. Power");
        System.out.println("3. Square Root");
        Scanner sc1 = new Scanner(System.in);
        int choice = sc1.nextInt();
        switch(choice){
            case 1:
                System.out.println("Factorial of the number is: "+c.factorial());
                break;
            case 2:
                System.out.println("Power of the number is: "+c.power());
                break;
            case 3:
                System.out.println("Square root of the number is: "+c.squareroot());
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc1.close();
    }
}
class Calculator{
    Scanner sc = new Scanner(System.in);
    public int factorial(){
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public int power(){
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the power: ");
        int p = sc.nextInt();
        int pow = 1;
        for(int i=1;i<=p;i++){
            pow = pow*n;
        }
        return pow;
    }
    public int squareroot(){
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sqrt = (int)Math.sqrt(n);
        return sqrt;
    }
}