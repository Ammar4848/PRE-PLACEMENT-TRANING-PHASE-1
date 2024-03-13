public class Contructor2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(5,8);
        System.out.println("Area of Rectangle 1 is : "+r1.Area());
        System.out.println("Area of Rectangle 2 is : "+r2.Area()); 
    }
}
class Rectangle{
    int l,b;
    public Rectangle(int length, int breadth){
        l = length;
        b = breadth;

    }
    public int Area(){
        int area = l*b;
        return area;
    }
}