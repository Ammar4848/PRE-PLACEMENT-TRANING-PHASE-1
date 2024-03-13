import java.util.*;;
public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.close();
        System.out.println("Enter marks of 3 subjects");
        int s1,s2,s3,per;
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        System.out.println("Enter Your gender");
        char g=sc.next().charAt(0);
        if(s1>=45 && s2>=45 && s3>=45){
            per=(s1+s2+s3)/3;
            if(per>=75 && g=='F'){
                System.out.println("You have passed And you can Take Addmission");
            }
            else if(per>=50 && g=='M'){
                System.out.println("You have passed And you can Take Addmission");
            }
        }
        else{
            System.out.println("Fail");
        }
    }
}