public class Construtor1 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area();
        t.perimeter();
        System.out.println("Area of Triangle is : "+t.area());
        System.out.println("Perimeter of Triangle is : "+t.perimeter());
    }
}
class Triangle{
    int a,b,c;
    public Triangle(){
        this.a = 4;
        this.b = 5;
        this.c = 6;
    }
    public int area(){
        int s = (4+5+6)/2;
        int area = (int)Math.sqrt(s*(s-4)*(s-5)*(s-6));
        return area;
    }
    public int perimeter(){
        int perimeter = a+b+c ;
        return perimeter;
    }
}