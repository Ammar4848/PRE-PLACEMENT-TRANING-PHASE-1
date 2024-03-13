import java.util.*;
public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        int a= s1.length();
        int b= s2.length();
        if (a>b) {
            System.out.println(a-b);
        }
        else if(a<b){
            System.out.println(b-a);
        }
        else if(a==b){
            for(int i=0;i<a;i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    System.out.println(s1.charAt(i)-s2.charAt(i));
                    break;
                }
            }
        }
        sc.close();
    }
}