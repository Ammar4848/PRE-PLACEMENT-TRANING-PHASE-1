interface ABC{
    public void show();
}
abstract class XYZ implements ABC{
    public XYZ(){
        System.out.println("This is Constructor of Abstract Class");
    }
}
public class CinAbstract extends XYZ {
    public void show(){
        System.out.println("This Method is implemented in Child Class");
    }
    public static void main(String[] args) {
        CinAbstract c = new CinAbstract();
        c.show();
    }
}