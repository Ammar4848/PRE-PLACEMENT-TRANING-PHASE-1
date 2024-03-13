import java.util.*;
public class StudentDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter the price = ");
            int price = sc.nextInt();
        System.out.println("Are You a Student");
        char y = sc.next().charAt(0);
        if (y=='y'){
            if(price>500){
                int discount = (price*10)/100;
                int total = price-discount;
                System.out.println("Your Student Discount Total = "+total);
            }
            else{
                int discount = (price*5)/100;
                System.out.println("Discount = "+discount);
            }
        }
        else{
            if(price>500){
                int discount = (price*8)/100;
                int total = price-discount;
                System.out.println("Your Discount Total = "+total);
            }
            else{
                int discount = (price*2)/100;
                System.out.println("Discount = "+discount);
            }
        }
    }
}
