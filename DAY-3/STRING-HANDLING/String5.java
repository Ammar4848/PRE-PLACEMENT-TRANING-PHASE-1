import java.util.*;
public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Strings");
        String s1 = sc.next();
        String s2 = sc.next();
        String a = s1.toLowerCase();
        String b = s2.toLowerCase();
        int count=0;
        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(a.charAt(i)==b.charAt(j)){
                    count++;
                }
            }
        }
        if(count==a.length()){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
        sc.close();
    }
}