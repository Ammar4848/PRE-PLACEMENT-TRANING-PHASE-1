import java.util.*;
public class UserDefine {
    static void MyExeption(int age) throws InnerUserDefine{
        if (age>18) {
            System.out.println("Shadi hogi Nachoo");
        }
        else{
            throw new InnerUserDefine("Shadi to na ho payegi Kya hai Umar kam hai na abbi");
        }
    }
    public static void main(String[] args) throws InnerUserDefine {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age = ");
        int age = sc.nextInt();
        UserDefine.MyExeption(age);
        sc.close();
    }
}
class InnerUserDefine extends Exception {
    public InnerUserDefine(String str){
        System.out.println(str);
    }
}