import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if(year%4==0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
