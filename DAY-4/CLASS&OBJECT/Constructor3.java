import java.util.Scanner;
public class Constructor3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the length of Rectangle : ");
       int l = sc.nextInt();
       System.out.println("Enter the breadth of Rectangle : ");
       int b = sc.nextInt();
       Area a = new Area(l,b);
       System.out.println("Area of Rectangle is : "+a.returnArea());
       sc.close();   
    }
}
class Area{
    int l,b;
    public Area(int length, int breadth){
        l = length;
        b = breadth;
    }
    public int returnArea(){
        int area = l*b;
        return area;
    }
}