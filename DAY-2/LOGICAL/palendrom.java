import java.util.*;
public class palendrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter A Number");
        int n=sc.nextInt();
        int r,sum=0,temp;
        temp=n;    
        while(n>0){    
         r=n%10;
         sum=(sum*10)+r;    
         n=n/10;    
        }    
        if(temp==sum)    
         System.out.println("palindrome number ");    
        else    
         System.out.println("not palindrome");    
    }
}