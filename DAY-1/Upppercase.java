import java.util.*;
public class Upppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter a String");
        char a=sc.next().charAt(0);
        if(a>='A' && a<='Z'){
            System.out.println("Upper Case");
        }
        else if (a>='a' && a<='z') {
            System.out.println("Lower Case");
        }
        else{
            System.out.println("Special Character");
        }
    }
}