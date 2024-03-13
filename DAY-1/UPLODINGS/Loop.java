import java.util.*;
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter any 5 Numbers");
        int n1,n2,n3,n4,n5;
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        n4=sc.nextInt();
        n5=sc.nextInt();
        if (n1>n2 && n1>n3 && n1>n4 && n1>n5){
            System.out.println("Largest number is"+n1);
        }
        else if (n2>n1 && n2>n3 && n2>n4 && n2>n5){
            System.out.println("Largest number is"+n2);
        }
        else if (n3>n1 && n3>n2 && n3>n4 && n3>n5){
            System.out.println("Largest number is"+n3);
        }
        else if (n4>n1 && n4>n2 && n4>n3 && n4>n5){
            System.out.println("Largest number is"+n4);
        }
        else if (n5>n1 && n5>n2 && n2>n3 && n5>n4){
            System.out.println("Largest number is"+n5);
        }
    }
}