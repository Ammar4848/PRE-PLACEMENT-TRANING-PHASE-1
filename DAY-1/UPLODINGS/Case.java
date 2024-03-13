import java.util.*;
public class Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operation you want to perform");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int c = sc.nextInt();
        switch(c) {
            case 1:
                System.out.println("Addition is: " + (a+b));
                break;
            case 2:
                System.out.println("Subtraction is: " + (a-b));
                break;
            case 3:
                System.out.println("Multiplication is: " + (a*b));
                break;
            case 4:
                System.out.println("Division is: " + (a/b));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
